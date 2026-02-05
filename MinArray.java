import java.util.Scanner;
public class MinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter comma seperated integers:");
        String input=sc.nextLine();
        String[] strArr=input.split(",");
        int[] arr=new int[strArr.length];
        for(int i=0;i<strArr.length;i++)
        {
            arr[i]=Integer.parseInt(strArr[i].trim());
        }
        System.out.println("Minimum element:"+findMin(arr));
        System.out.println("Maximum element:"+findMax(arr));
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int num:arr){
            if(num<min)min=num;
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max)max=num;
        }
        return max;
    }
}
