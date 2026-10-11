/*
1       2       3       4       5
2       3       4       5       1
3       4       5       1       2
4       5       1       2       3
5       1       2       3       4
*/
public class q31 {
    public static void main(String[] args) {
        int n=5,a=0;
        for(int i=1;i<=n;i++){
            a=i;
            for(int j=1;j<=n;j++){
                if(a!=n+1){
                    System.out.print(a+"\t");
                    a++;
                }else{
                    a=1;
                    System.out.print(a+"\t");
                    a++;

                }

            }
            System.out.println();
        }
    }
    
}
