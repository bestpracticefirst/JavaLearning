package reflect;

public class Demo {
    public String name;
    private int age;
    private String sex;

    public Demo(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Demo(){

    }
    public void sayHello(){
        System.out.printf(name+" says hello\n");
    }
    private void sayBye(String toPerson){
        System.out.printf(name+" says bye to "+toPerson+"\n");
    }
}
