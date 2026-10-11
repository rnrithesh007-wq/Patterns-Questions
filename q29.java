/*
1
2       4
3       5       7
6       8       10      12
9       11      13      15      17
*/
public class q29 {
    public static void main(String[] args) {
        int n=5,odd=1,even=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(even+"\t");
                    even+=2;
                }else{
                    System.out.print(odd+"\t");
                    odd+=2;
                }
            }
            System.out.println();
        }
    }
    
}
