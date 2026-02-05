public class Array{
    public static int findTotal(int[]arr){
        int total=0;
        for(int num:arr){
            total=total+num;
        }
        return total;
    }
    public static void main(String[]args){
        int[] arr={10,20,5,8};
        System.out.println("Total:"+findTotal(arr));
    }
}