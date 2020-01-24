public class HelloWorld {
    public static void main(String [] args){
        int[] numbers = new int[5];
        numbers [0]=10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        String[] strings = new String[3];
        strings[0]="Hello ";
        strings[1]="this ";
        strings[2]="f*cking world. ";
        for (int i=0;i<strings.length;i++) {
            System.out.print(strings[i]);
        }
        for(String string1:strings){
            System.out.print(string1);
        }
        System.out.println();

        int[]number={1,2,3};
        int sum=0;
        for (int i:number){
            sum=sum+i;
        }
        System.out.println(sum);

        System.out.println();

        int value=0;
        String s;
        s=null;
        System.out.println(s);
    }
}
