public class LessonString {
    public static void main(String[] args) {
        String x = "Hello";
        x=x.toUpperCase();
        System.out.println(x);

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());

        System.out.printf("This is a string, %s", "NICE");
        System.out.println();
        System.out.printf("This is a string, %d", 5);
        System.out.println();
        System.out.printf("This is a string, %f", 9.0);
        System.out.println();

        System.out.printf("This is a string, %10d\n", 53242);
        System.out.printf("This is a string, %10d\n", 5123);
        System.out.printf("This is a string, %10d\n", 51);
        System.out.printf("This is a string, %10d\n", 53222);
        System.out.println();

        System.out.printf("This is a string, %-10d\n", 53242);
        System.out.printf("This is a string, %-10d\n", 5123);
        System.out.printf("This is a string, %-10d\n", 51);
        System.out.printf("This is a string, %-10d\n", 53222);
        System.out.println();

        System.out.printf("This is a string, %.2f\n", 52.2343242 );
        System.out.printf("This is a string, %.2f\n", 52.34232 );
        System.out.printf("This is a string, %.2f\n", 52.2343242342 );
        System.out.printf("This is a string, %.2f\n", 52.2768 );
    }
}
