package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserDaoProxy {
    private Object target;

    public UserDaoProxy(Object target){
        this.target = target;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("调用方法："+method.toString());
//                System.out.println(proxy.getClass());
//                System.out.println(target.getClass());
                System.out.println("代理开始");
                final Object invoke = method.invoke(target, args);
                System.out.println("代理结束");
                return invoke;
            }
        });
    }

}
