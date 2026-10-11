/*
1       10      11      20      21
2       9       12      19      22
3       8       13      18      23
4       7       14      17      24
5       6       15      16      25
*/
public class q12 {
    public static void main(String[] args) {
        int n=5;
        int a=1,b=(2*n)-1,c=0;
        for(int i=1;i<=n;i++){
            c=i;
            for(int j=1;j<=n;j++){
                if(j%2!=0){
                    System.out.print(c+"\t");
                    c+=b;
                }else{
                    System.out.print(c+"\t");
                    c+=a;
                }
            }
            a+=2;
            b-=2;
            System.out.println();
        }
    }
    
}
