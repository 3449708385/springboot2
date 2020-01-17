package com.mgp.mycat.dao;

import com.mgp.bean.MycatSmt;
import com.mgp.bean.MycatSmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MycatSmtMapper {
    int countByExample(MycatSmtExample example);

    int deleteByExample(MycatSmtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MycatSmt record);

    int insertSelective(MycatSmt record);

    List<MycatSmt> selectByExample(MycatSmtExample example);

    MycatSmt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MycatSmt record, @Param("example") MycatSmtExample example);

    int updateByExample(@Param("record") MycatSmt record, @Param("example") MycatSmtExample example);

    int updateByPrimaryKeySelective(MycatSmt record);

    int updateByPrimaryKey(MycatSmt record);
}