package com.mgp.shardingjdbc.dao;

import com.mgp.bean.SmtShardingJDBC;
import com.mgp.bean.SmtShardingJDBCExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface SmtShardingJDBCMapper {
    int countByExample(SmtShardingJDBCExample example);

    int deleteByExample(SmtShardingJDBCExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmtShardingJDBC record);

    int insertSelective(SmtShardingJDBC record);

    List<SmtShardingJDBC> selectByExample(SmtShardingJDBCExample example);

    SmtShardingJDBC selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmtShardingJDBC record, @Param("example") SmtShardingJDBCExample example);

    int updateByExample(@Param("record") SmtShardingJDBC record, @Param("example") SmtShardingJDBCExample example);

    int updateByPrimaryKeySelective(SmtShardingJDBC record);

    int updateByPrimaryKey(SmtShardingJDBC record);
}