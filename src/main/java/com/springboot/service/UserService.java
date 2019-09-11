package com.springboot.service;

import com.springboot.pojo.UserPosition;
import com.springboot.pojo.Users;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ASUS on 2019/9/10.
 */

public interface UserService {

    List<Users> getUser(int age);
    List<UserPosition> getVicinity(BigDecimal minlng, BigDecimal maxlng, BigDecimal minlat, BigDecimal maxlat);


}
