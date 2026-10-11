/*
1       2       4       7       11
3       5       8       12      16
6       9       13      17      20
10      14      18      21      23
15      19      22      24      25
*/
public class q26 {
    public static void main(String[] args) {
        int n=5,a=1,b=0,c=0;
        for(int i=1;i<=n;i++){
            b=i;
            c=a;
            for(int j=1;j<=n;j++){
                if(i+j<n+1){
                    System.out.print(a+"\t");
                    a=a+b;
                    b++;
                }else{
                    System.out.print(a+"\t");
                    b--;
                    a=a+b;
                }
            }
            System.out.println();
            a=c;
            a=a+i+1;

        }
    }
}
