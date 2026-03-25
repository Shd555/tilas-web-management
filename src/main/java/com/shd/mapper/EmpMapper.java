package com.shd.mapper;

import com.shd.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmpMapper {

    /**
     * 查询所有员工
     * @return 员工列表
     */
    @Select("SELECT * FROM emp")
    List<Emp> findAll();

    /**
     * 根据ID删除员工
     * @param id 员工ID
     */
    @Delete("DELETE FROM emp WHERE id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增员工
     * @param emp 员工信息
     */
    @Insert("INSERT INTO emp(username, password, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) " +
            "VALUES(#{username}, #{password}, #{name}, #{gender}, #{phone}, #{job}, #{salary}, #{image}, #{entryDate}, #{deptId}, #{createTime}, #{updateTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Emp emp);

    /**
     * 根据ID查询员工
     * @param id 员工ID
     * @return 员工信息
     */
    @Select("SELECT * FROM emp WHERE id = #{id}")
    Emp getById(Integer id);

    /**
     * 更新员工信息
     * @param emp 员工信息
     */
    @Update("UPDATE emp SET username = #{username}, password = #{password}, name = #{name}, gender = #{gender}, phone = #{phone}, job = #{job}, " +
            "salary = #{salary}, image = #{image}, entry_date = #{entryDate}, dept_id = #{deptId}, update_time = #{updateTime} WHERE id = #{id}")
    void update(Emp emp);
}