package aop;

import java.lang.reflect.Method;

public class MyAdvice implements Advice{
    long beginTime = 0;
    @Override
    public void beforeMethod(Method method) {
        beginTime=System.currentTimeMillis();
        System.out.println(method.getName()+" before at "+beginTime);
    }

    @Override
    public void afterMethod(Method method) {
        long endTime= System.currentTimeMillis();
        System.out.println(method.getName()+" cost total "+(endTime-beginTime));
    }
}
