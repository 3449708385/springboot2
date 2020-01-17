/*
package com.mgp.mycat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

*/
/**
 * 注意，这个运行需要继承webmvc接口，然后把他注入到spring管理，才可以使用。
 * 这个是管理controller的拦截器
 * 注入db数据源一般在service，不建议使用这个
 *//*

@Configuration
public class DBOperationInterceptor extends HandlerInterceptorAdapter {

    */
/**
     * 调用时间：Controller方法处理之前
     * 执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序一个接一个执行
     * 若返回false，则中断执行，注意：不会进入afterCompletion
     *//*

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle: ");
        if(handler instanceof HandlerMethod){
            HandlerMethod hm = (HandlerMethod)handler;
            DBRead dbRead =  hm.getMethodAnnotation(DBRead.class);
            DBWrite dbWrite =  hm.getMethodAnnotation(DBWrite.class);
            if(dbRead != null){
                DataSourceContextHolder.setDbType("selectDataSource");
            }else if(dbWrite!=null){
                DataSourceContextHolder.setDbType("updateDataSource");
            }else{
                DataSourceContextHolder.setDbType("updateDataSource");
            }
            return true;
        }else{
            return false;
        }
    }

    */
/**
     * 调用前提：preHandle返回true
     * 调用时间：Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，也就是说在这个方法中你可以对ModelAndView进行操作
     * 执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序倒着执行。
     * 备注：postHandle虽然post打头，但post、get方法都能处理
     *//*

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    */
/**
     * 调用前提：preHandle返回true
     * 调用时间：DispatcherServlet进行视图的渲染之后
     * 多用于清理资源
     *//*

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    */
/**
     * 这个方法会在Controller方法异步执行时开始执行, 而Interceptor的postHandle方法则是需要等到Controller的异步执行完才能执行
     *//*

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
*/
