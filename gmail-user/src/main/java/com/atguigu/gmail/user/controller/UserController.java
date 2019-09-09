package com.atguigu.gmail.user.controller;

import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) throws Exception {

        List<UmsMemberReceiveAddress> UmsMemberReceiveAddress = userService.getReceiveAddressByMemberId(memberId);

        return UmsMemberReceiveAddress;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() throws Exception {

        List<UmsMember> umsMembers = userService.selectAllUser();

        return umsMembers;
    }


    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
