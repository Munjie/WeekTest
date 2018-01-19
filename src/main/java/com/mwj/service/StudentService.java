package com.mwj.service;

import com.mwj.dao.StudentDao;
import com.mwj.mapper.StudentMapper;
import com.mwj.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentService {


    @Resource
   private StudentDao studentDao;

    //显示学生信息
   public   List<Student> selectByPrimaryKey(){

       return  studentDao.selectByPrimaryKey();


   }

    //更新学生信息
    public  boolean updateByPrimaryKey(Student student){

         return  studentDao.updateByPrimaryKey(student);



    }
}
