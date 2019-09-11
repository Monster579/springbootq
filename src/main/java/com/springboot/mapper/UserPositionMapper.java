package com.springboot.mapper;

import com.springboot.pojo.UserPosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ASUS on 2019/9/11.
 */
@Mapper
public interface UserPositionMapper {

    List<UserPosition> getvicinity(@Param("minlng") BigDecimal minlng,
                                   @Param("maxlng") BigDecimal maxlng,
                                   @Param("minlat") BigDecimal minlat,
                                   @Param("maxlat") BigDecimal maxlat);

    List<UserPosition> getvicinitysort(@Param("longitude") BigDecimal longitude,
                                       @Param("latitude") BigDecimal latitude);
}
