package com.shd.controller;

import com.shd.pojo.Emp;
import com.shd.pojo.Result;
import com.shd.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("emps")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 查询所有员工
     * @return 员工列表
     */
    @GetMapping
    public Result list() {
        log.info("查询全部员工数据");
        List<Emp> empList = empService.findAll();
        return Result.success(empList);
    }

    /**
     * 根据ID删除员工
     * @param id 员工ID
     * @return 操作结果
     */
    @DeleteMapping()
    public Result delete(Integer id) {
        log.info("根据id删除员工，{}", id);
        empService.deleteById(id);
        return Result.success();
    }

    /**
     * 新增员工
     * @param emp 员工信息
     * @return 操作结果
     */
    @PostMapping()
    public Result add(@RequestBody Emp emp) {
        log.info("添加员工：{}", emp);
        empService.add(emp);
        return Result.success();
    }

    /**
     * 根据ID查询员工
     * @param id 员工ID
     * @return 员工信息
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("查找id：{}", id);
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    /**
     * 更新员工信息
     * @param emp 员工信息
     * @return 操作结果
     */
    @PutMapping()
    public Result update(@RequestBody Emp emp) {
        log.info("更新员工emp:{}", emp);
        empService.update(emp);
        return Result.success();
    }
}