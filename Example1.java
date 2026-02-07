import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter age:");
        Short age=sc.nextShort();
        System.out.println("enter marks:");
        int marks=sc.nextInt();
        System.out.println("enter grade:");
        char grade=sc.next().charAt(0);
        System.out.println("enter status:");
        String status=sc.next();
        sc.close();
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
        System.out.println(status);
    }

}
