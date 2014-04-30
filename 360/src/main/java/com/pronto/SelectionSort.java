package com.pronto;

public class SelectionSort {

	int elementssort[] 	= new int[500];
	
	SelectionSort(int[] array)
	{
		
	elementssort=array;
	}
	
	
	
	void sort()
	{
		 int i, j, first, temp;  
	    
		 for ( i = elementssort.length - 1; i > 0; i--)  
	     {
			  first = 0;   
	     
			  for(j = 1; j <= i; j ++)   
	          {
				  if( elementssort[ j ] < elementssort[ first ] )         
	                 first = j;
	          }
			  
	          temp = elementssort[ first ]; 
	          elementssort[ first ] = elementssort[ i ];
	          elementssort[ i ] = temp; 
	     }        
        
		 for(i=0; i<elementssort.length;i++)
		 {
			 System.out.print(elementssort[i]+" ");
			 
		 }
	
	}
	
}
