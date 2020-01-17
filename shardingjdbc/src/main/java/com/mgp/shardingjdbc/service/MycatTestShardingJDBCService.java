package com.mgp.shardingjdbc.service;

import com.mgp.bean.MycatTest;
import com.mgp.bean.MycatTestShardingJDBC;

public interface MycatTestShardingJDBCService {

    int addTest(MycatTestShardingJDBC mycatTest);

    MycatTestShardingJDBC selectTest(Long id);

}
