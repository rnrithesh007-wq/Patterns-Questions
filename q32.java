/*
     0
    101
   21012
  3210123
 432101234
*/
public class q32 {
    public static void main(String[] args) {
        int n=5,o=1,a=0,m=0;
        for(int i=0;i<n;i++){
            a=i;
            m=o/2+1;
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=o;j++){
                if(j<m){
                    System.out.print(a);
                    a--;
                }else{
                    System.out.print(a);
                    a++;
                }
            }
            o+=2;
            System.out.println();

        }
    }
    
}
