
package gaspump;

public class GasPumpTester{
	public static void main (String [ ] args){
	
		GasPumpDisplay pump = new GasPumpDisplay (3);
                
                while(pump.hasMoreElements())
                    
                    System.out.print(pump.nextElement() + " ");
                    
	}
}
