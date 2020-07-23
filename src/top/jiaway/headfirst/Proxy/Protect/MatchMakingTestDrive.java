package top.jiaway.headfirst.Proxy.Protect;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

    public void drive(){
        getOwnerProxy(new PersonBeanImpl() {
        });
    }

    private PersonBean getOwnerProxy(PersonBean person) {

        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                                person.getClass().getInterfaces(),
                                new OwnerInvocationHandler(person));

    }


}
