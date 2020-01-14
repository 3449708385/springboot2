package com.mgp.service.feign;

import com.mgp.util.ReturnInfo;
import io.seata.core.context.RootContext;
import io.seata.tm.api.GlobalTransactionContext;
import org.springframework.stereotype.Service;

//因为无法导入feign的问题，无法放到api公共模块
@Service
public class SeataServiceFallBackImpl implements SeataServiceFeign {

    @Override
    public ReturnInfo testSeata() {
        try{
            //https://blog.csdn.net/linzhefeng89/article/details/103726590
            GlobalTransactionContext.reload(RootContext.getXID()).rollback();
        }catch (Exception e){
            System.out.println("回滚分布式事务异常");
        }
        return null;
    }
}
