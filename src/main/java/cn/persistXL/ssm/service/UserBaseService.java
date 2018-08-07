package cn.persistXL.ssm.service;

import cn.persistXL.ssm.entity.UserBase;

import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * @author persistXL
 * @data 2018/8/7 19:35
 */
public interface UserBaseService {
    /*
        增加用户
     */
    int createUser (UserBase userBase);

    List<UserBase> findUser();
}
