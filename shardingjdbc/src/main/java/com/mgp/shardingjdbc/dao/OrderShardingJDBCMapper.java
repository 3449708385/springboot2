package com.mgp.shardingjdbc.dao;

import com.mgp.bean.OrderShardingJDBC;
import com.mgp.bean.OrderShardingJDBCExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface OrderShardingJDBCMapper {
    int countByExample(OrderShardingJDBCExample example);

    int deleteByExample(OrderShardingJDBCExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderShardingJDBC record);

    int insertSelective(OrderShardingJDBC record);

    List<OrderShardingJDBC> selectByExample(OrderShardingJDBCExample example);

    OrderShardingJDBC selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderShardingJDBC record, @Param("example") OrderShardingJDBCExample example);

    int updateByExample(@Param("record") OrderShardingJDBC record, @Param("example") OrderShardingJDBCExample example);

    int updateByPrimaryKeySelective(OrderShardingJDBC record);

    int updateByPrimaryKey(OrderShardingJDBC record);
}