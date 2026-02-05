public class MaxInArray{
public static int findMax(int[] arr){
int max=arr[0];
for(int num:arr){
if(num>max)max=num;
}
return max;
}
public static int findMin(int[] arr){
int min=arr[0];
for(int num:arr){
if(num<min)min=num;
}
return min;
}
public static void main(String[] args)
{
int[] arr={10,20,5,8};
System.out.println("Max:"+findMax(arr));
System.out.println("Min:"+findMin(arr));
}
}
