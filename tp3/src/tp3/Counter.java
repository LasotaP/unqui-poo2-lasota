package tp3;

import java.util.ArrayList;
import java.util.Iterator;

public class Counter{
    
    private ArrayList<Integer> array = new ArrayList<Integer>(20);
    
    public Integer getEvenOcurrences() {
            return (int) array.stream()
                    .filter(x -> x % 2 == 0)
                    .count();
    }
    
    public void addNumber(int x) {
        array.add(x);
    }
    
    public int eddEvenOcurrences() {
        return (int) array.stream()
                .filter(x -> x % 2 != 0)
                .count();
    }
    
    public int divOcurrences(int i) {
        return (int) array.stream()
                .filter(x -> x % i == 0)
                .count();
    }
    
    /*
    public int moreEvenDigits() {
    	int res = 0;
    	for (Integer integer : array) {
			
		}
    	return moreEvenDigitsBetween();
    }
    */
    
    public int multiplos(int x, int y) {
    	int res = 1000;
    	
    	while(res > 0 && !(res % x == 0 && res % y == 0) ) {    		
    		res--;
    	}
 
    	return res;
    }
    
    
}