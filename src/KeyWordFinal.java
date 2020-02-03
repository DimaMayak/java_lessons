public class KeyWordFinal {
    public static void main(String[] args) {
        System.out.println(Test.CONSTANT2+10);
        Test test = new Test(5);
        System.out.println(test.CONSTANT1+10);
    }
}

class Test{
    public final int CONSTANT1;

    public  Test(int CONSTANT){
        this.CONSTANT1=CONSTANT;
    }

    public static final int CONSTANT2=10;

    //сетеры не будут работать(ну логично)
}