public class HelloWorld {
    public static void main(String[] args) {
        Person person = new Person();
        Person.tall = 100;
        person.speak();
    }
}
class Person {
    private int age;
    static int tall;
    public Person() {
        this(10);
        System.out.println("无参构造函数");
    }
    public Person(int age) {
        this.age = age;
    }
    void setAge (int a) {
        if(a>=0) age = a;
        else System.out.println("age need to >= 0 set fail");
    }
    void speak() {
        System.out.println("age="+age);
        System.out.println("static tall = "+tall);
    }
}