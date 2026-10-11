/*
1       3       6       10      15
2       5       9       14      19
4       8       13      18      22
7       12      17      21      24
11      16      20      23      25
*/
public class q2 {
    public static void main(String[] args) {
        int n=6;
        int a=1,b=0,c=0,d=0,e=0;
        for(int i=1;i<=n;i++){
            b=a;
            c=i+1;
            e=n;
            for(int j=1;j<=n;j++){
                
                if(i+j<=n+1){
                    System.out.print(a+"\t");
                    d=a;
                    a=a+(c++);
                }else{
                    d=d+(e--);
                    System.out.print(d+"\t");
                }
            }
            a=b;
            a=a+i;
            System.out.println();
        }
    }
    
}
