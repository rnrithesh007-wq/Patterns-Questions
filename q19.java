/*
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
21      22      23      24      25
*/
public class q19 {
    public static void main(String[] args) {
        int n=5,a=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a+"\t");
                a++;

            }
            System.out.println();
        }
    }
    
}
