package com.设计模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/10/01/21:52
 * @Description:
 */
public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //待理对象要做的事情
                if (method.getName().equals("sing")) {
                    System.out.println("待理对象开始收钱了");
                    return method.invoke(bigStar, args);
                }else if(method.getName().equals("dance")){
                    System.out.println("待理对象开始准备场地了");
                    return method.invoke(bigStar, args); //这一块实际上就是执行业务的代码
                }else {
                    return method.invoke(bigStar, args);
                }
            }
        });
        return starProxy;
    }
}
