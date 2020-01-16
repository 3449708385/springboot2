package com.mgp.shardingjdbc.service;

import com.mgp.bean.SmtShardingJDBC;
import com.mgp.shardingjdbc.dao.SmtShardingJDBCMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmtShardingJDBCServiceImpl implements SmtShardingJDBCService {

    @Autowired
    private SmtShardingJDBCMapper smtShardingJDBCMapper;

    @Override
    public int addSmt(SmtShardingJDBC smtShardingJDBC) {
        return smtShardingJDBCMapper.insert(smtShardingJDBC);
    }
}
