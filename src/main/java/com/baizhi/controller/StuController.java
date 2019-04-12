package com.baizhi.controller;

import com.baizhi.dao.StuDao;
import com.baizhi.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("stu")
public class StuController {

   @Autowired
    StuDao stuDao;
   @RequestMapping("selectAll")
   @ResponseBody
   public List<Stu> selectAll(){
       System.out.println("+++++++++++++++++++");
       List<Stu> stus = stuDao.selectAll();
       for (Stu stu : stus) {
           System.out.println(stu);
       }
       System.out.println("-----------------");
       return stus;
   }
}
