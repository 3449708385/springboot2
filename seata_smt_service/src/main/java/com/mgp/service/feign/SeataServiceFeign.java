package com.mgp.service.feign;


import com.mgp.service.SeataServiceApi;
import com.mgp.service.feign.SeataServiceFallBackImpl;
import org.springframework.cloud.openfeign.FeignClient;

//因为无法导入feign的问题，无法放到api公共模块
//@FeignClient(name="seata-order")
@FeignClient(name="seata-order", fallback = SeataServiceFallBackImpl.class)
public interface SeataServiceFeign extends SeataServiceApi {
}
