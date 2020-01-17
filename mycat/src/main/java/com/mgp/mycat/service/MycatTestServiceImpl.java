package com.mgp.mycat.service;

import com.mgp.bean.MycatTest;
import com.mgp.mycat.config.DBRead;
import com.mgp.mycat.config.DBWrite;
import com.mgp.mycat.dao.MycatTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MycatTestServiceImpl implements MycatTestService {

    @Autowired
    private MycatTestMapper mycatTestMapper;

    @DBRead
    @Override
    public MycatTest selectTest(Long id) {
        return mycatTestMapper.selectByPrimaryKey(id);
    }

    @DBWrite
    @Override
    public int addTest(MycatTest mycatTest) {
        return mycatTestMapper.insert(mycatTest);
    }
}
