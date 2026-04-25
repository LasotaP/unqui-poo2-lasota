package tp3;

import java.util.ArrayList;
import java.util.Iterator;

public class Multioperador {
	
    private ArrayList<Integer> array = new ArrayList<Integer>();
    
    public int sumador() {
    	return array.stream().mapToInt(Integer::intValue).sum(); 
    }
    
    public int restador() {
    	int res = 0;
    	
    	for (int i = 0; i < array.size(); i++) {
			res -= array.get(i);
		}

    	return res;
    }
    
    public int multiplicador() {
    	int res = 0;
    	
    	for (int i = 0; i < array.size(); i++) {
			res *= array.get(i);
		}

    	return res;
    }
}
