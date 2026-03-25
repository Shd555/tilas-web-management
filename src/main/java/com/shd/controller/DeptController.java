package com.shd.controller;

import com.shd.pojo.Dept;
import com.shd.pojo.Result;
import com.shd.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RequestMapping("depts")
@RestController

public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询所有部门
     * @return 部门列表
     */
    @GetMapping
    public Result list() {
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    /**
     * 根据ID删除部门
     * @param id 部门ID
     * @return 操作结果
     */
//    @DeleteMapping("/{id}")
    @DeleteMapping()
    public Result delete( Integer id) {
        log.info("根据id删除部门，{}", id);
        deptService.deleteById(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @param dept 部门信息
     * @return 操作结果
     */
    @PostMapping()
    public Result add(@RequestBody Dept dept) {
        log.info("添加部门：{}", dept);
        deptService.add(dept);
        return Result.success();
    }

    /**
     * 根据ID查询部门
     * @param id 部门ID
     * @return 部门信息
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("查找id：{}", id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 更新部门信息
     * @param dept 部门信息
     * @return 操作结果
     */
    @PutMapping()
    public Result update(@RequestBody Dept dept) {
        log.info("更新部门dept:{}", dept);
        deptService.update(dept);
        return Result.success();
    }
}