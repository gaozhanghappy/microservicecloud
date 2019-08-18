package git.gaozhanghappy.service;

import git.gaozhanghappy.entities.Dept;

import java.util.List;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
