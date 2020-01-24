public class Lesson2 {
    public static void main(String[] args){
        Human person1= new Human();
        Human person2= new Human("Vasya",10);
    }
}
    class Human{
        private int age;
        private String name;

        public Human(){
            name="Default name";
            age=0;
            System.out.println("Empty parameters set default");
            System.out.println("Name : "+this.name);
            System.out.println("Age : "+this.age);
        }

        public Human(String name,int age){
            setName(name);
            setAge(age);
            System.out.println("Parameters");
            System.out.println("Name : "+getName());
            System.out.println("Age : "+getAge());
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

