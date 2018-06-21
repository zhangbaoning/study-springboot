package cn.zhangbaoning.studyspringboot.service;

import cn.zhangbaoning.studyspringboot.entity.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;
    @Test
    public void getById() {
        Girl girl = girlService.getById("4e7cd502-7155-423e-aa7d-7880a6578bd9");
        Assert.assertEquals(new Integer(18),girl.getAge());
    }
}