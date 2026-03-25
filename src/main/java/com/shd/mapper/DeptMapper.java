package com.shd.mapper;

import com.shd.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 查询所有部门
     * @return 部门列表
     */
    @Select("SELECT * FROM dept")
    List<Dept> findAll();

    /**
     * 根据ID删除部门
     * @param id 部门ID
     */
    @Delete("DELETE FROM dept WHERE id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept 部门信息
     */
    @Insert("INSERT INTO dept(name, create_time, update_time) VALUES(#{name}, #{createTime}, #{updateTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Dept dept);

    /**
     * 根据ID查询部门
     * @param id 部门ID
     * @return 部门信息
     */
    @Select("SELECT * FROM dept WHERE id = #{id}")
    Dept getById(Integer id);

    /**
     * 更新部门信息
     * @param dept 部门信息
     */
    @Update("UPDATE dept SET name = #{name}, update_time = #{updateTime} WHERE id = #{id}")
    void update(Dept dept);
}