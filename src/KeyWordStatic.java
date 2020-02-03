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
        //пример измениния статического поля класса
        People.description="Man";
        People man3=new People();
        System.out.println(man3.getDescription());
        System.out.println(man1.getDescription());
        System.out.println(man2.getDescription());
        System.out.println(People.coube(2));
        System.out.println(People.getCountPeople());
    }
}
class People{
    private String name;
    private int age;
    private static int countPeople=0;
    // ключевое слово static означает что медот или поле относится не к одному єкземляру класса(сосданного обььекта)
    // а ко всему классу. Таким образом к параметрам и методам обозначенными ключевим словом static можно обратиться не создавая єкземпляр класса
    // и данное изменение будет относиться ко всем обьектам данного класса
    // Эта ебала для того, что при создании экземпляра класса создаются новые переменные для каждого отдельного обьекта, но если какой то параметр имеет описание static
    // то такая переменна создается один раз и все обьекты ссылаються на одну и ту же ячеку памяти, где находится значение данного поля.
    public static String description;
    public static int x;

    public People(){
        this.name="Dafult name";
        this.age=0;
        countPeople++;
    }

    public People(String name, int age){
        setName(name);
        setAge(age);
        countPeople++;
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

    public String getDescription(){ return description; }

    public static int coube(int x){// Статический метод, он работает вне зависимости от создания обьекта класса
        int result;                // можно вызвать People.coube(2) и будет збс
        result=x*x;
        return result;
    }
    public static int getCountPeople(){return countPeople;}

}