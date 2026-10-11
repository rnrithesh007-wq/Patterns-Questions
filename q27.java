/*
                        1
                2       1       2
        3       2       1       2       3
4       3       2       1       2       3       4
*/
public class q27 {
    public static void main(String[] args) {
        int n=4,a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("\t");
            }
            a=i;
            for(int j=0;j<(i*2-1);j++){
                System.out.print(a+"\t");
                if(j<(i*2-1)/2){
                    a--;
                }else{
                    a++;
                }
            }
            System.out.println();
        }
    }
    
}
