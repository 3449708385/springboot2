package com.mgp.service;

import com.mgp.util.ReturnInfo;
import org.springframework.web.bind.annotation.PostMapping;

public interface SeataServiceApi {

    //测试seata框架
    @PostMapping("/testSeata")
    ReturnInfo testSeata();
}
