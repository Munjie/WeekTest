package com.mwj.controller;


import com.mwj.model.Student;
import com.mwj.service.StudentService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {


    @Resource
    private StudentService studentService;


    @InitBinder
    public  void  bindDate(ServletRequestDataBinder requestDataBinder){
        requestDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false));
    }

    @RequestMapping("all.do")
    public  String show(Model model){

        final List<Student> students = studentService.selectByPrimaryKey();
        model.addAttribute("student",students);
        if (students !=  null)
            return
            "all";
        else
            return
            null;

    }
    @RequestMapping("update.do")
    public String update(Student student){

        final boolean b = studentService.updateByPrimaryKey(student);
        if (b)
            return
            "success";
        else
            return "all";
    }



}
