package com.mgp.mycat.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

// 使用AOP动态切换不同的数据源
@Aspect
@Component
@Lazy(false)
@Order(0) // Order设定AOP执行顺序 使之在数据库事务上先执行
public class SwitchDataSourceAOP {
	// 这里切到你的方法目录
	@Before("execution(* com.mgp.*.service.*.*(..))")
	public void process(JoinPoint joinPoint) {

		MethodSignature joinPointObject = (MethodSignature) joinPoint.getSignature();
		Method method = joinPointObject.getMethod();

		if(method.isAnnotationPresent(DBRead.class)){
			DataSourceContextHolder.setDbType("selectDataSource");
		}else if(method.isAnnotationPresent(DBWrite.class)){
			DataSourceContextHolder.setDbType("updateDataSource");
		}else{
			DataSourceContextHolder.setDbType("updateDataSource");
		}
	}
}