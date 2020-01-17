package com.mgp.mycat.service;

import com.mgp.bean.MycatTest;

public interface MycatTestService {

    int addTest(MycatTest mycatTest);

    MycatTest selectTest(Long id);

}
