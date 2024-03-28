package DynamicArray;

import java.util.Arrays;

public class DynamicArray {
	
	int[] data ; 
	int size ;
	
	public DynamicArray() {
		// for the initial value we put 1 in the array
		
		data = new int[1];
		size = 1 ;
	} 
	
	
	public int get(int index ) {
		
		return data[index] ; 
		
	}
	
	public void retrieveData(int index) {
		
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.println(data[i]);
			
		}
		

	}
	
	// For ensuring that our data is going be stored in the data array:
	// 1- first we have to ensure the size 
	// 2- then we store it successfully 
	
	public void put(int element) {
		// by adding the number 1 to the size 
		// (size + 1 ) it's going be named the currentCapacity
		ensureCapacity(size + 1 );
		
		// then we're going to store data in the array 
		
		data[size++] = element ; 
		
	}
	
	
	public void ensureCapacity(int currentCapacity) {
		
		int oldCapacity = data.length ; 
		
		if ( currentCapacity >= oldCapacity ) {
			
			int newCapacity = oldCapacity*2  ; 
			
			// in here we renew the size of our dataArray
			
			data = Arrays.copyOf(data, newCapacity);
			
		}
		
		
		
	}
	
	

}
