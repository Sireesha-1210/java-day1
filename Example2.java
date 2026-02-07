import java.util.Scanner;
public class Example2 {   
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject1 marks:");
        int subject1=sc.nextInt();
        System.out.println("enter subject2 marks:");
        int subject2=sc.nextInt();
        System.out.println("enter subject3 marks:");
        int subject3=sc.nextInt();
        int total=subject1+subject2+subject3;
        double average=total/3;
        System.out.println(total);
        System.out.println(average);
    }
}
