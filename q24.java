/*
                                1       2       3       4
                        8       7       6       5
                9       10      11      12
        16      15      14      13
*/
public class q24 {
    public static void main(String[] args) {
        int n=5,a=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=n-1;j++){
                if(i%2!=0){
                    System.out.print(a+"\t");
                    a++;
                }else{
                    System.out.print(a+"\t");
                    a--;
                }
            }
            if(i%2!=0){
                a=a+3;
            }else{
                a=a+5;
            }
            System.out.println();
        }
    }
    
}
