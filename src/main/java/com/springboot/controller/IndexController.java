package com.springboot.controller;

/**
 * Created by ASUS on 2019/9/10.
 */

import com.springboot.pojo.UserPosition;
import com.springboot.pojo.Users;
import com.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Map test(){
        Map map = new HashMap();
        List<Users> list =  userService.getUser(21);
        map.put("jian",list);
        return  map;
    }

    /**
     * 查找附近的人
     * @param radii 半径距离(单位km)
     * @param lon 经度
     * @param lat 纬度
     * @return
     */
    @GetMapping("/nearby")
    public List<UserPosition> getVicinity(double radii, double lon, double lat){
        double r = 6371;//地球半径千米
        double dis = radii;
        log.info("半径为info:"+dis);
        log.error("半径为error:"+dis);
        double dlng =  2*Math.asin(Math.sin(dis/(2*r))/Math.cos(lat*Math.PI/180));
        dlng = dlng*180/Math.PI;//角度转为弧度
        double dlat = dis/r;
        dlat = dlat*180/Math.PI;
        double minlat =lat-dlat;
        double maxlat = lat+dlat;
        double minlng = lon -dlng;
        double maxlng = lon + dlng;

        return userService.getVicinity(BigDecimal.valueOf(minlng), BigDecimal.valueOf(maxlng), BigDecimal.valueOf(minlat), BigDecimal.valueOf(maxlat));
    }

}
