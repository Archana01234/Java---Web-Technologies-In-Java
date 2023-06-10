package com.collection;

public class GenricDemo {
	
	public static <E> void ptintarray(E[]inputarray) {
		
		for (E e:inputarray) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Integer intArray[]= {1,2,3,4,5};
		Double doubleArray[]= {1.1,2.2,3.3,4.4,5.5};
	    Character characterArray[]={'T','o','p','s'};
		String strArray[]= {"java","pythone","php","DM"};
		
	ptintarray(intArray);
	ptintarray(doubleArray);
	ptintarray(characterArray);
	ptintarray(strArray);
	
		
		
		
		
	}
}

 
	

		
	
	
	
	
	
	
	
	
	
	
	

	



