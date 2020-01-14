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
