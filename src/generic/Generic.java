package generic;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        int a = biggerOne(3,5);
        //int 和 double,取交为Number
        Number b = biggerOne(3,5.5);
        System.out.println(b);
        //String和int 取交为Object
        Object c = biggerOne("1",2);
    }
    public void testType(){
        ArrayList<Integer> collection1 = new ArrayList<Integer>();
        ArrayList<String> collection2= new ArrayList<String>();

        System.out.println(collection1.getClass()==collection2.getClass());
        //两者class类型一样,即字节码一致

        System.out.println(collection2.getClass().getName());
        //class均为java.util.ArrayList,并无实际类型参数信息
    }
    public static <T> T biggerOne(T x,T y){
        return y;
    }
}
