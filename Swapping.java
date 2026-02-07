import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("enter a number: ");
        int b=sc.nextInt();
        sc.close();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
