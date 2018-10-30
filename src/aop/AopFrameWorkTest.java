package aop;

import java.io.InputStream;
import java.util.Collection;

public class AopFrameWorkTest {
    public static void main(String[] args) {
        InputStream inputStream = AopFrameWorkTest.class.getResourceAsStream("config.property");
        Object bean = new BeanFactory(inputStream).getBean("xxx");
        System.out.println(bean.getClass().getName());
        ((Collection) bean).clear();
    }
}
