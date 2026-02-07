import java.util.*;
public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive.");
        }


        System.out.println("enter a number1:");
        int num1=sc.nextInt();
        if(num1>0&&num1%2==0){
            System.out.println("Number is positive and even.");
        }


        System.out.println("enter a number:");
        int x=sc.nextInt();
        System.out.println("Assigned value="+x);

        
        System.out.println("enter a number:");
        int y=sc.nextInt();
        y++;
        System.out.println("After increment:"+y);
    }
}
