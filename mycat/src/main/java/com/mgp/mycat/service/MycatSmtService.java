package com.mgp.mycat.service;

import com.mgp.bean.MycatSmt;

public interface MycatSmtService {
    int addSmt();

    MycatSmt getMycatSmt(Long id);
}
