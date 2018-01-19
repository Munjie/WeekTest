package com.mwj.dao;

import com.mwj.mapper.StudentMapper;
import com.mwj.model.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
public class StudentDao {



    @Resource
    private StudentMapper studentMapper;

    //显示学生信息
    public List<Student> selectByPrimaryKey(){

        return  studentMapper.selectByPrimaryKey();


    }

    //更新学生信息
    public  boolean updateByPrimaryKey(Student student){

        int i = studentMapper.updateByPrimaryKey(student);
        return  i > 0;


    }
}
