package com.mgp.service.feign;

import com.mgp.util.ReturnInfo;
import org.springframework.stereotype.Service;

//因为无法导入feign的问题，无法放到api公共模块
@Service
public class SeataServiceFallBackImpl implements SeataServiceFeign {
    @Override
    public ReturnInfo testSeata() {
        return null;
    }
}
