package git.gaozhanghappy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//lombok可以解决后面所有的getset等设置
@SuppressWarnings("serial") //警告压制
@AllArgsConstructor //全参构建
@NoArgsConstructor  //无参
@Data              //getset
@Accessors(chain = true)  //链式编程
public class Dept implements Serializable {
    private long deptno;
    private String dname;
    private String db_source; //来自哪个数据库，微服务在哪个数据库
    //将上面的全参构造去掉后设置某个参数的构造
    public Dept(String dname){
        this.dname=dname;
    }
   /* public static void main(String[] args) {
        Dept dept=new Dept();
        //链式编程
        Dept dept1 = dept.setDeptno(11l).setDname("rd").setDb_source("01");
    }*/
}
