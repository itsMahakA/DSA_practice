// *	*	*		*	*	*	
// *	*				*	*	
// *						*	
// *	*				*	*	
// *	*	*		*	*	*	

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nsp = 1;
        int nst = n/2 + 1; 
        
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
                
            }
            for(int j = 1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=nst;j++){
                System.out.print("*\t");
            }
            
            //condiiton;
            if(i<=n/2){
                nsp = nsp+2;
                nst--;
            }
            else{
                nsp = nsp-2;
                nst++;
            }
            System.out.println();
        }
        

    }
}