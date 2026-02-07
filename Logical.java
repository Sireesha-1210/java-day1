public class Logical {
    public static void main(String[] args) {
        int marks=18;
        boolean status=true;
        if(marks>90&&marks<100)
        {
            System.out.println("A grade");
        }
        else if(marks>35||marks==35){
           System.out.println("Pass");
        }
        else{
            System.out.println(!status);
        }


    }
    
}
