import java.util.ArrayList;

public class Setup{
    public static void main(String []args){
        int calcul = 0;
        int nonp = 0;
        
        ArrayList<Integer> calculT =  new ArrayList<Integer>();
        ArrayList<Integer> nonpT =  new ArrayList<Integer>();
        Integer nbr= 2;
        
        while(nbr<=100)
        {	
	        int div =2;
	        boolean premier = true;
	        while(premier && div < nbr-1)
	        {
	            if( nbr % div ==0) premier = false;
	            div++;
	        }
	        
            if(premier) 
            {
                if(nonpT.contains(nbr)!=true && calculT.contains(nbr)!=true)
                {
            		nonpT.add(nbr);
            		nonp = nonp + nbr;
                	
                }
                
            }
            else {
            	 //System.out.println("\t"+nbr+" n 'est pas un nombre premier");
            	 if(calculT.contains(nbr)!=true && nonpT.contains(nbr)!=true ) {
                 	calculT.add(nbr);
                 	calcul = calcul + nbr;
                 }
            	 
            	 }
            nbr++;
        }
        System.out.println("Fourche 2(non premier):");
        System.out.println(calculT);
        System.out.println(nonp);
        //for (Integer oui : calculT) {
            //System.out.println(oui);
            
        //}
        System.out.println("Fourche 1(premier):");
        System.out.println(nonpT);
        System.out.println(calcul);
        //for (Integer non : nonpT) {
           
            //System.out.println(non);
            
        //}
        
    }

}