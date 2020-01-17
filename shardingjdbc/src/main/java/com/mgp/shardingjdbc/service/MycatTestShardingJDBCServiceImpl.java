package com.mgp.shardingjdbc.service;

import com.mgp.bean.MycatTest;
import com.mgp.bean.MycatTestShardingJDBC;
import com.mgp.shardingjdbc.dao.MycatTestShardingJDBCMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MycatTestShardingJDBCServiceImpl implements MycatTestShardingJDBCService {

    @Autowired
    private MycatTestShardingJDBCMapper mycatTestShardingJDBCMapper;

    @Override
    public MycatTestShardingJDBC selectTest(Long id) {
        return mycatTestShardingJDBCMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addTest(MycatTestShardingJDBC mycatTest) {
        return mycatTestShardingJDBCMapper.insert(mycatTest);
    }
}
