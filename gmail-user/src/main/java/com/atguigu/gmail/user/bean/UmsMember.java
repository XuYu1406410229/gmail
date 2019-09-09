package com.atguigu.gmail.user.bean;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class UmsMember {
    @Id//加入主键注解
    @GeneratedValue(strategy = GenerationType.IDENTITY)//需要主键返回
    private Integer id;
    private Integer member_level_id;
    private String username;//用户名
    private String password;//密码
    private String nickname;//昵称
    private String phone;//手机号码
    private Integer status;//帐号启用状态:0->禁用；1->启用
    private Date create_time;//注册时间
    private String icon;//头像
    private Integer gender;//性别：0->未知；1->男；2->女
    private Date birthday;//生日
    private String city;//所做城市
    private String job;//职业
    private String personalized_signature;//个性签名
    private Integer source_type;//用户来源
    private Integer integration;//积分
    private Integer growth;//积分
    private Integer luckey_count;//剩余抽奖次数
    private Integer history_integration;//历史积分数量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMember_level_id() {
        return member_level_id;
    }

    public void setMember_level_id(Integer member_level_id) {
        this.member_level_id = member_level_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalized_signature() {
        return personalized_signature;
    }

    public void setPersonalized_signature(String personalized_signature) {
        this.personalized_signature = personalized_signature;
    }

    public Integer getSource_type() {
        return source_type;
    }

    public void setSource_type(Integer source_type) {
        this.source_type = source_type;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckey_count() {
        return luckey_count;
    }

    public void setLuckey_count(Integer luckey_count) {
        this.luckey_count = luckey_count;
    }

    public Integer getHistory_integration() {
        return history_integration;
    }

    public void setHistory_integration(Integer history_integration) {
        this.history_integration = history_integration;
    }

    @Override
    public String toString() {
        return "UmsMember{" +
                "id=" + id +
                ", member_level_id=" + member_level_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", icon='" + icon + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", job='" + job + '\'' +
                ", personalized_signature='" + personalized_signature + '\'' +
                ", source_type=" + source_type +
                ", integration=" + integration +
                ", growth=" + growth +
                ", luckey_count=" + luckey_count +
                ", history_integration=" + history_integration +
                '}';
    }
}
