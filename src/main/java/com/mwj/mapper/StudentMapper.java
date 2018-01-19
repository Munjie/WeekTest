package com.mwj.mapper;

import com.mwj.model.Student;

import java.util.List;

public interface StudentMapper {

//显示学生信息
       List<Student>  selectByPrimaryKey();

//更新学生信息
       int updateByPrimaryKey(Student student);
}