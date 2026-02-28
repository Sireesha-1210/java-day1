public class Pattern {
    public static void main(String[] args) {
        int i,j;
        int n=6;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==n||j==1||i==j){
                    System.out.print("*");
                }
                else{
                 System.out.print(" ");
                }
            }
              System.out.println("");
        }
        for(i=1;i<=n-1;i++){
            for(j=1;j<=n;j++){
                if(i==n||j==1||i+j==n+1){
                    System.out.print("*");
                }
                else{
                 System.out.print(" ");
                }
            }
              System.out.println("");
        }
        
    }
}
