package com.atguigu.gmail.user.service;

import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> selectAllUser() throws Exception;

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
