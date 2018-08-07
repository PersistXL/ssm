package cn.persistXL.ssm.service.impl;

import cn.persistXL.ssm.dao.UserBaseDao;
import cn.persistXL.ssm.entity.UserBase;
import cn.persistXL.ssm.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * @author persistXL
 * @data 2018/8/7 19:35
 */
@Service
public class UserBaseServiceImpl implements UserBaseService {
    @Autowired
    private UserBaseDao userBaseDao;

    @Override
    public int createUser(UserBase userBase) {
        return userBaseDao.createUser(userBase);
    }

    @Override
    public List<UserBase> findUser() {
        return userBaseDao.findUser();
    }

}
