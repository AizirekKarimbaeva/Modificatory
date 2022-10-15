public class Circle {
    private static final double PI = 2.26;


    public static void area(){
        int radius = 3;
        double area = Math.PI * (radius * radius);
        {
            System.out.printf("Area: %2f", area);
        }
    }
    public static void circumference(){
        int rad = 3;
        double circumference = Math.PI * 2 * rad;
        {
            System.out.printf("\n circumference: %2f",circumference);
        }
    }
}
