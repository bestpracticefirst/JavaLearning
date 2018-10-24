package generic;

import java.util.Set;

public class A<T> {
    //泛型类的成员方法，该T受A后面的T的限制
    public T memberFunc() {
        return null;
    }

    //泛型方法，这里的T和和类A的T是不同的
    public static <T> T genericFunc(T a) {
        return null;
    }

    public static void main(String[] args) {
        A a=new A<String>();
        //编译不通过
        //Integer i = a.findByUserName("s");
        //编译通过
        Set<Integer> set = a.findByConditions("s");
    }

    public void add(T x) {
    }

    public T findById(int id) {
        return null;
    }

    public void delete(T obj) {
    }

    public void delete(int id) {
    }

    public void update(T obj) {
    }

    public T findByUserName(String name) {
        return null;
    }

    public <T> Set<T> findByConditions(String where) {
        return null;
    }

}
