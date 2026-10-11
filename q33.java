/*
            G 
          G R 
        G R A 
      G R A M 
    G R A M P 
  G R A M P R 
G R A M P R O
*/
public class q33 {
    public static void main(String[] args) {
        String s="PROGRAM";
        int l=s.length();
        int m=l/2;
        for(int i=1;i<=l;i++){
            int a=m;
            for(int j=1;j<=l;j++){
                if(i+j>=l+1){
                    if(a<l){
                        System.out.print(s.charAt(a)+" ");
                        a++;
                    }else{
                        a=0;
                        System.out.print(s.charAt(a)+" ");
                        a++;
                    }
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
