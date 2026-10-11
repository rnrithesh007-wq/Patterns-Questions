/*
1  
2  6  
3  7  9  
4  8  
5  
*/
public class q17 {
    public static void main(String[] args) {
        int n=5;
        int n1=(n/2)+1;
        int a=0,b=0,i=0;
        for(i=1;i<=n1;i++){
            b=n-1;
            a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a+"  ");
                a=a+b;
                b=b-2;
            }
            System.out.println();
        }
        for(i=n1+1;i<=n;i++){
            a=i;
            b=n-1;
            for(int j=n;j>=i;j--){
                System.out.print(a+"  ");
                a=a+b;
                b=b-2;
            }
            System.out.println();
        }

    }
    
}
