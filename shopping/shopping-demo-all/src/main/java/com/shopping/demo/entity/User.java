package com.shopping.demo.entity;


import com.shopping.demo.constants.DaoConstant;
import com.shopping.demo.dto.UserDto;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author Gao
 * @Date 2020/10/21 22:55
 * @Version 1.0
 */

@Entity
@Table(name = DaoConstant.USER_TABLE_NAME)
@Data
@DynamicInsert()
@DynamicUpdate
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DaoConstant.USER_ID)
    private Long id;

    @Column(name = DaoConstant.USER_USERNAME)
    private String userName;

    @Column(name = DaoConstant.USER_TRUE_NAME)
    private String trueName;

    @Column(name = DaoConstant.USER_PASSWORD)
    private String password;

    @Column(name = DaoConstant.USER_EMAIL)
    private String email;

    @Column(name = DaoConstant.USER_MOBILE_NUM)
    private String mobileNum;

    @Column(name = DaoConstant.USER_AVATAR_ADDR)
    private String avatarAddress;

    @Column(name = DaoConstant.USER_SEX)
    private String sex;

    @Column(name = DaoConstant.USER_ADD_TIME)
    private String addTime;

    @Column(name = DaoConstant.USER_ROLE)
    private String userRole;

    public User(){}

    public User(UserDto userDto){
        this.id = userDto.getId();
        this.userName = userDto.getUserName();
        this.trueName = userDto.getTrueName();
        this.email = userDto.getEmail();
        this.mobileNum = userDto.getMobileNum();
        this.avatarAddress = userDto.getAvatarAddress();
        this.sex = userDto.getSex();
        this.addTime = userDto.getAddTime();
        this.userRole = userDto.getUserRole();

    }


}
