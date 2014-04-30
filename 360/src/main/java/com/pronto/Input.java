package com.pronto;

import java.io.BufferedReader;
import java.util.Scanner;
/**
 * Hello world!
 *
 */


public class Input 
{
    public static void main( String[] args )
    {
int size;


Scanner in = new Scanner(System.in);
System.out.println("Input number of integers to sort");
size = in.nextInt();   

int elements[]= new int[size];
 	 
System.out.println("Enter Number:");  
        
        for(int i=0;i<size;i++)
        {
        	elements[i]=in.nextInt();
        	
        }   
        
        System.out.println("Numbers Are:");
        for(int i=0;i<size;i++)
        {
        	System.out.print(elements[i]);
        	                	
        }
        
        System.out.printf("Enter Sorting Option: 1 , 2");
        
        int type;
       type=in.nextInt();
        switch(type)
        {
        case 1:
        	SelectionSort s1=new SelectionSort(elements);
        	s1.sort();
        	
        	break;
                	
        case 2:
        	BubbleSort b1= new BubbleSort(elements);
        	b1.sort();
        break;
        
        default:
        System.out.println("Enter Correct Choice");
        	break;
        
        
        }
        
        
    }
}
