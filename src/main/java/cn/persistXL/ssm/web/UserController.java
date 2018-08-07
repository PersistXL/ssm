package cn.persistXL.ssm.web;

import cn.persistXL.ssm.entity.UserBase;
import cn.persistXL.ssm.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author persistXL
 * @data 2018/8/7 20:05
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserBaseService userBaseService;

    @RequestMapping("/findUser")
    @ResponseBody
    public List<UserBase> findUser(HttpServletRequest request){
        List<UserBase> userBase = (List<UserBase>) userBaseService.findUser();
        return userBase;
    }
}
