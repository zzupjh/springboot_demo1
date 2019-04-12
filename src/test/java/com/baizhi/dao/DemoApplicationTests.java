package com.baizhi.dao;

import com.baizhi.entity.Stu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
   private StuDao stuDao;
    @Test
    public void contextLoads() {
        List<Stu> stus = stuDao.selectAll();
        for (Stu stu : stus) {
            System.out.println(stu);
        }
    }

}