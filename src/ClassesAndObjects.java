public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.age=10;
        person1.setName("Vas");
        person1.speak();
        person1.sayHallo();
        System.out.println(person1.method1());
    }
}
class Person{
    //поля
    String name;
    int age;
    //методы
    void speak(){
        System.out.println("My name is "+name+", i'm "+age+"years old.");
    }
    void sayHallo(){
        System.out.println("Hello");
    }

    int method1(){
        return age-1;
    }

    void setName(String userName){
        name=userName;
    }
}
