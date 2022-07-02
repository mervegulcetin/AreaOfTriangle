import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.print("side 1: ");
        a=scan.nextInt();
        System.out.print("side 2: ");
        b=scan.nextInt();
        System.out.print("side 3: ");
        c=scan.nextInt();

        int u=(a+b+c)/2;
        double area=u*(u-a)*(u-b)*(u-c);

        System.out.println("Area of triangle: "+area);

    }
}
