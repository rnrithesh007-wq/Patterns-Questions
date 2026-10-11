/*
1  
2  3  
4  5  6  
7  8  
9 
*/
public class q16 {
    public static void main(String[] args) {
        int n=5;
        int n1=(n/2)+1,n2=n-n1;
        int a=1;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=i;j++){
                System.err.print(a+"  ");
                a++;
            }
            System.out.println();
        }
        for(int i=0;i<n2;i++){
            for(int j=1;j<=n2-i;j++){
                System.err.print(a+"  ");
                a++;
            }
            System.out.println();
        }
    }
    
}
