package com.mgp.service;

import com.mgp.bean.Smt;
import com.mgp.dao.SmtMapper;
import com.mgp.service.feign.SeataServiceFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmtServiceImpl implements SmtService {

    @Autowired
    private SeataServiceFeign seataServiceFeign;

    @Autowired
    private SmtMapper smtMapper;

    /**
     * 采取的是先提交后根据分支事务，删除数据的方式，自增id不会回退。
     */

    @Override
    @GlobalTransactional(name = "addSmt-order",rollbackFor = Exception.class)
    public void addSmt() {
        System.out.println("addSmt");
        Smt smt = new Smt();
        smt.setSmtid(100L);
        smtMapper.insert(smt);
        seataServiceFeign.testSeata();
    }
}
