package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflect {
    public static void main(String[] args)throws Exception {
        testDeclaredMethod();
    }
    public static void testDeclaredMethod()throws Exception{
        Method[] methods=Demo.class.getDeclaredMethods();
        for(Method method:methods){
            System.out.printf("method name: %s\n",method.getName());
        }
    }
    public static void testContructor() throws Exception{
        Constructor cs=Demo.class.getConstructor(String.class,int.class,String.class);
        Demo demo=(Demo)cs.newInstance("zhangsan",10,"男");
        demo.sayHello();
    }
    public static void testOne() {
        int [] a1 = new int[]{1,2,3};
        int [] a2 = new int[5];
        int [][] a3 = new int[2][3];
        System.out.println(a1.getClass() == a2.getClass());//true
        System.out.println(a1.getClass());//class [I
        System.out.println(a3.getClass());//class [[I
        System.out.println(a1.getClass().getSuperclass() == a3.getClass().getSuperclass());//true
        System.out.println(a2.getClass().getSuperclass());//class java.lang.Object

        //下句编译不通过：Error:(15, 42) java: 不可比较的类型: java.lang.Class<capture#1, 共 ? extends int[]>和java.lang.Class<capture#2, 共 ? extends int[][]>
        //System.out.println(a1.getClass() == a3.getClass());

        Object []b3 = a3;//通过
        //下句编译不通过   Error:(17, 24) java: 不兼容的类型: int[]无法转换为java.lang.Object[]
        //Object [] b1 = a1;

        String s1 = "abc";
        System.out.println(Arrays.asList(a1));//[[I@1540e19d]
        System.out.println(Arrays.asList(s1));//[abc]
    }
}
