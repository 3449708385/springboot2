package com.mgp.dao;

import com.mgp.bean.Smt;
import com.mgp.bean.SmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmtMapper {
    int countByExample(SmtExample example);

    int deleteByExample(SmtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Smt record);

    int insertSelective(Smt record);

    List<Smt> selectByExample(SmtExample example);

    Smt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Smt record, @Param("example") SmtExample example);

    int updateByExample(@Param("record") Smt record, @Param("example") SmtExample example);

    int updateByPrimaryKeySelective(Smt record);

    int updateByPrimaryKey(Smt record);
}