package gaspump;
public class GasPumpDisplay{
	public GasPumpDisplay (int numberOfPosition){
               digits = numberOfPosition;
               if (digits > 1)
                   tail = new GasPumpDisplay(digits - 1);
               else
                   tail = null;
               currentDigit = 0;
	}
public String nextElement (){        
        String r = null;
        if (digits == 1)
        {
            r = currentDigit + "";
            currentDigit++;
            return r;
        }
           r = currentDigit + tail.nextElement();
           if (!tail.hasMoreElements())
           {
               currentDigit++;
               tail = new GasPumpDisplay(digits - 1);
           }
           return r;
}
public Boolean hasMoreElements (){
            //int MAX_DIGIT = 4;
        return currentDigit <= MAX_DIGIT;
}

private final int digits;
private GasPumpDisplay tail;
private int currentDigit;
private int MAX_DIGIT = 4;

}
