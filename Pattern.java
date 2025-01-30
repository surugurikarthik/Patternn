

public class Pattern {
    public static void main(String[] args) {
        int n=4;
     /*    for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.err.println();
        }
        */ 
      /* for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==i||j==n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

    }
    System.out.println("");
    
        }
        */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2==0){
                    System.out.print("*");
                }else{
                    System.out.print("#");
                }
            }
           System.out.println(); 
    }
}
}

