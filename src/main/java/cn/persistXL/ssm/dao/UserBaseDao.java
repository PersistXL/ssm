package cn.persistXL.ssm.dao;

import cn.persistXL.ssm.entity.UserBase;

import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * @author persistXL
 * @data 2018/8/7 18:30
 */
public interface UserBaseDao {
    /*
        增加用户
     */
    int createUser (UserBase userBase);
    /*
        更改某id的用户信息
     */
    int updateUserById (int id);
    /*
        查询所有用户信息
     */
    List<UserBase> queryAllUser ();

    /*
        删除某id的用户
     */
    int delateUserById(int id);

    List<UserBase> findUser();
}
