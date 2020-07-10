package top.jiaway.headfirst.Proxy.Protect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public OwnerInvocationHandler(PersonBean bean){
        this.person = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")){
                return method.invoke(person,args);
            // 不允许执行这个方法
            }else if(method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(person,args);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        // 调用其他方法 其他方法一律不理
        return null;
    }
}
