package DynamicArray;

import java.util.Arrays;

public class DynamicArray {
	
	int[] data ; // Declares an array of integers
	int size ;
	
	public DynamicArray() {
		
	
		// we declares an array of integers with size 1
		
		data = new int[1]; 
		size = 1 ;
	} 
	
	// obvious 
	
	public int get(int index ) {
		
		return data[index] ; 
		
	}
	
	public void retrieveData() {
		
		
		for (int i = 0; i < data.length; i++) {
			
			System.out.println("in the index "+i+ " the value is "+data[i]);
			
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
