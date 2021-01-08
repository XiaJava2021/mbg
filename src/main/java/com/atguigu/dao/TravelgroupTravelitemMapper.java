package com.atguigu.dao;

import com.atguigu.pojo.TravelgroupTravelitemExample;
import com.atguigu.pojo.TravelgroupTravelitemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelgroupTravelitemMapper {
    long countByExample(TravelgroupTravelitemExample example);

    int deleteByExample(TravelgroupTravelitemExample example);

    int deleteByPrimaryKey(TravelgroupTravelitemKey key);

    int insert(TravelgroupTravelitemKey record);

    int insertSelective(TravelgroupTravelitemKey record);

    List<TravelgroupTravelitemKey> selectByExample(TravelgroupTravelitemExample example);

    int updateByExampleSelective(@Param("record") TravelgroupTravelitemKey record, @Param("example") TravelgroupTravelitemExample example);

    int updateByExample(@Param("record") TravelgroupTravelitemKey record, @Param("example") TravelgroupTravelitemExample example);
}