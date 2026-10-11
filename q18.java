/*
*           * 
* *       * * 
* * *   * * * 
* * * * * * * 
* * *   * * * 
* *       * * 
*           * 
*/
public class q18 {
    public static void main(String[] args) {
        int n=7,a=0;
        int n1=7/2+1;
        for(int i=0;i<n;i++){
            if(i<n1){
                a=i+1;
            }else{
                a=n-i;
            }
            for(int j=1;j<=n;j++){
                if(j<=a || j>n-a){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    
}
