/*
                                5
                        9       4
                12      8       3
        14      11      7       2
15      13      10      6       1
*/
public class q1{
    public static void main(String[] args) {
        int n=5,a=n,b=n-1,c=0,d=0;
        for(int i=1;i<=n;i++){
            c=a;
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    System.out.print(a+"\t");
                    a=a-d;
                    d++;
                }else{
                    System.out.print("\t");
                }
            }
            a=c;
            a=a+b;
            d=b+1;
            b--;
            System.out.println();
        }
    }
}