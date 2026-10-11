/*
1 1 1 1 1 
1 2 2 2 1 
1 2 3 2 1 
1 2 2 2 1 
1 1 1 1 1 
*/
public class q14 {
    public static void main(String[] args) {
        int n=5,res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+1>=j+1){
                    res=j+1;
                }else{
                    res=i+1;
                }
                if(res>=n-i){
                    res=n-i;
                }
                if(res>=n-j){
                    res=n-j;
                }
                System.out.print(res+" ");

            }
            System.out.println();
        }
    }
    
}
