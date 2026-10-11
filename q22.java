/*
1
2       6
3       7       10
4       8       11      13
5       9       12      14      15
*/
public class q22 {
    public static void main(String[] args) {
        int n=5,a=0;
        for(int i=1;i<=n;i++){
            a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                a=a+(n-j);
            }
            System.out.println();
        }
    }
    
}
