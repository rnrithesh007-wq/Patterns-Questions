/*
1       2       3       4       5
10      9       8       7       6
11      12      13      14      15
20      19      18      17      16
21      22      23      24      25
*/
public class q10 {

    public static void main(String[] args) {
    int n=5,b=(2*n)-1;
    int a=0,c=0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            a=a+1;
        }else{
            a=a+b;
        }
        c=a;
        for(int j=1;j<=n;j++){
            if(i%2!=0){
                System.out.print(c+"\t");
                c++;
            }else{
                System.out.print(c+"\t");
                c--;
            }

        }
        System.out.println();
    }
}
    
}
