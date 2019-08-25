package git.gaozhanghappy.mapper;


import git.gaozhanghappy.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  //这个注解要有
public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
