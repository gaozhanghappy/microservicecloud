package git.gaozhanghappy.controller;

import git.gaozhanghappy.entities.Dept;
import git.gaozhanghappy.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/8/18.
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {

        return this.deptClientService.list();
    }
    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {

        return this.deptClientService.add(dept);
    }
}
