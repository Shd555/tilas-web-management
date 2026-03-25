package com.shd.service;

import com.shd.pojo.Emp;
import java.util.List;

public interface EmpService {

    /**
     * 查询所有员工
     * @return 员工列表
     */
    List<Emp> findAll();

    /**
     * 根据ID删除员工
     * @param id 员工ID
     */
    void deleteById(Integer id);

    /**
     * 新增员工
     * @param emp 员工信息
     */
    void add(Emp emp);

    /**
     * 根据ID查询员工
     * @param id 员工ID
     * @return 员工信息
     */
    Emp getById(Integer id);

    /**
     * 更新员工信息
     * @param emp 员工信息
     */
    void update(Emp emp);
}