public class KeyWordStatic {
    public static void main(String[] args){
        System.out.println("OK");
        People man1 = new People();
        System.out.println(man1.getAge());
        System.out.println(man1.getName());
        System.out.println();
        People man2 = new People("Dima",23);
        System.out.println(man2.getAge());
        System.out.println(man2.getName());
        System.out.println();
    }
}
class People{
    private String name;
    private int age;

    public People(){
        this.name="Dafult name";
        this.age=0;
    }

    public People(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}