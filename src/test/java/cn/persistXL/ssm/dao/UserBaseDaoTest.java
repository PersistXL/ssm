package cn.persistXL.ssm.dao;

import cn.persistXL.ssm.entity.UserBase;
import cn.persistXL.ssm.service.UserBaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author persistXL
 * @data 2018/8/7 19:21
 */
/*
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml",})

public class UserBaseDaoTest {
    //注入Dao实现依赖
    @Resource  //注入dao实现
    private UserBaseDao userBaseDao;
    //注入service实现的依赖
    @Resource//注入service实现
    private UserBaseService userBaseService;
    @Test
    public void createUser() {
        UserBase userBase = new UserBase();
        userBase.setId(3);
        userBase.setAge(19);
        userBase.setUsername("C罗1");
        userBase.setPassword("520cluo");
        int insertUser = userBaseService.createUser(userBase);
        System.out.println(insertUser);
    }

    @Test
    public void updateUserById() {
    }

    @Test
    public void queryAllUser() {
    }

    @Test
    public void delateUserById() {
    }
}