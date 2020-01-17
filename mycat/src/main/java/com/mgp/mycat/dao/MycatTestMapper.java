package com.mgp.mycat.dao;

import com.mgp.bean.MycatTest;
import com.mgp.bean.MycatTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MycatTestMapper {
    int countByExample(MycatTestExample example);

    int deleteByExample(MycatTestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MycatTest record);

    int insertSelective(MycatTest record);

    List<MycatTest> selectByExample(MycatTestExample example);

    MycatTest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MycatTest record, @Param("example") MycatTestExample example);

    int updateByExample(@Param("record") MycatTest record, @Param("example") MycatTestExample example);

    int updateByPrimaryKeySelective(MycatTest record);

    int updateByPrimaryKey(MycatTest record);
}