package com.shd.service;

import com.shd.pojo.Dept;
import java.util.List;

public interface DeptService {

    /**
     * 查询所有部门
     * @return 部门列表
     */
    List<Dept> findAll();

    /**
     * 根据ID删除部门
     * @param id 部门ID
     */
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept 部门信息
     */
    void add(Dept dept);

    /**
     * 根据ID查询部门
     * @param id 部门ID
     * @return 部门信息
     */
    Dept getById(Integer id);

    /**
     * 更新部门信息
     * @param dept 部门信息
     */
    void update(Dept dept);
}