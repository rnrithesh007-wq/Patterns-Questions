/*
1       3       5       7       9
2       4       6       8       10
11      13      15      17      19
12      14      16      18      20
21      23      25      27      29
*/
public class q11 {
    public static void main(String[] args) {
        int n=5;
        int odd=1,even=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
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
