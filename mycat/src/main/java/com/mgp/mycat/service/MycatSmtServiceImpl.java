package com.mgp.mycat.service;

import com.mgp.bean.MycatSmt;
import com.mgp.mycat.dao.MycatSmtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MycatSmtServiceImpl implements MycatSmtService {

    @Autowired
    private MycatSmtMapper mycatSmtMapper;

    @Override
    public int addSmt() {
        for(int i=0;i<100;i++){
            MycatSmt mycatSmt = new MycatSmt();
            mycatSmt.setSmtId(i);
            mycatSmtMapper.insert(mycatSmt);
        }
        return 1;
    }

    @Override
    public MycatSmt getMycatSmt(Long id) {
        return mycatSmtMapper.selectByPrimaryKey(id);
    }
}
