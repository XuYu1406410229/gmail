package com.atguigu.gmail.user.service.impl;


import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmail.user.mapper.UserMapper;
import com.atguigu.gmail.user.service.UserService;
import com.sun.org.glassfish.gmbal.InheritedAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> selectAllUser() throws Exception {
        List<UmsMember> umsMemberList=userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);//Example代表查询规则（Example根据什么去查的呢）
        e.createCriteria().andEqualTo("memberId",memberId);//根据参数查询
        //封装的参数对象
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);//根据外键查询
        //通过umsMemberReceiveAddresses的映射去做一个查询，这个查询的条件封装在哪里呢？就封装在UmsMemberReceiveAddress里面，比如说这个对象里面，
        //哪一个字段不为空，我就根据哪一个字段作为过滤条件，然后查询UmsMemberReceiveAddress，将查询的结果封装成一个集合，然后返回出去
        return umsMemberReceiveAddresses;
    }
}
