package com.springboot.service;

import com.springboot.mapper.UserMapper;
import com.springboot.mapper.UserPositionMapper;
import com.springboot.pojo.UserPosition;
import com.springboot.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ASUS on 2019/9/10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserPositionMapper userPositionMapper;

    @Override
    public List<Users> getUser(int age) {
        return userMapper.getUser(age);
    }

    @Override
    public List<UserPosition> getVicinity(BigDecimal minlng, BigDecimal maxlng, BigDecimal minlat, BigDecimal maxlat){
        return userPositionMapper.getvicinity(minlng, maxlng, minlat, maxlat);
    }

}
