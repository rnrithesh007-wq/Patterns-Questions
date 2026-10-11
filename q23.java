/*
1
2       6
3       7       11
4       8       12      16
5       9       13      17      21
        10      14      18      22
                15      19      23
                        20      24
                                25
*/
public class q23 {
    public static void main(String[] args) {
        int n=5,a=0,b=0;
        for(int i=1;i<=n;i++){
            a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                a=a+(n-1);
            }
            System.out.println();
        }
        a=n*2;
        for(int i=1;i<n;i++){
            b=a;
            for(int j=1;j<=n;j++){
                if(i<j){
                    System.out.print(a+"\t");
                    a=a+(n-1);
                }else{
                    System.out.print("\t");
                }
            }
            a=b;
            a=a+n;
            System.out.println();
        }
    }
    
}
