package com.pronto;

public class BubbleSort {
int elementssort[] 	= new int[500];
	
	BubbleSort(int[] array)
	{
	elementssort=array;
	}
	

	void sort()
	{
		
		  int i,j;
		     boolean flag = true;   // set flag to true to begin first pass
		     int temp;   //holding variable

		     while ( flag )
		     {
		            flag= false;    //set flag to false awaiting a possible swap
		            for( j=0;  j < elementssort.length -1;  j++ )
		            {
		                   if ( elementssort[ j ] < elementssort[j+1] )   // change to > for ascending sort
		                   {
		                           temp = elementssort[ j ];                //swap elements
		                           elementssort[ j ] = elementssort[ j+1 ];
		                           elementssort[ j+1 ] = temp;
		                          flag = true;              //shows a swap occurred  
		                  } 
		            } 
		      } 
	        
        
		 for(i=0; i<elementssort.length;i++)
		 {
			 System.out.print(elementssort[i]+" ");
			 
		 }

	}
}
