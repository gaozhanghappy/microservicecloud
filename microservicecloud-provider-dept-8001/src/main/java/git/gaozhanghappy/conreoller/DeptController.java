package git.gaozhanghappy.conreoller;


import git.gaozhanghappy.entities.Dept;
import git.gaozhanghappy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

/**
 * Created by Administrator on 2019/8/17.
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = discoveryClient.getServices();//到微服务上将所有的微服务取出来
        System.out.println("**********" + list);
        //查找微服务名为microservicecloud-dept的微服务信息，有哪些内容返回一个列表
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        serviceInstances.stream().forEach(a-> System.out.println(a.getPort()+" "+a.getHost()));

        return this.discoveryClient;
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.findById(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.findAll();
    }
}
