package com.mgp.shardingjdbc.dao;

import com.mgp.bean.MycatTestShardingJDBC;
import com.mgp.bean.MycatTestShardingJDBCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MycatTestShardingJDBCMapper {
    int countByExample(MycatTestShardingJDBCExample example);

    int deleteByExample(MycatTestShardingJDBCExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MycatTestShardingJDBC record);

    int insertSelective(MycatTestShardingJDBC record);

    List<MycatTestShardingJDBC> selectByExample(MycatTestShardingJDBCExample example);

    MycatTestShardingJDBC selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MycatTestShardingJDBC record, @Param("example") MycatTestShardingJDBCExample example);

    int updateByExample(@Param("record") MycatTestShardingJDBC record, @Param("example") MycatTestShardingJDBCExample example);

    int updateByPrimaryKeySelective(MycatTestShardingJDBC record);

    int updateByPrimaryKey(MycatTestShardingJDBC record);
}