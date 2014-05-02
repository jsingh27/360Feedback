package com.pronto.test;

import com.pronto.cabs.Cab;
import com.pronto.cabs.CarA;
import com.pronto.cabs.Location;
import com.pronto.cabs.User;

public class CabTest {

	public static void main(String[] args) {
		
		User akshay = new User();
		Cab cab = new CarA();
		
		akshay.setName("akshay");
		akshay.setId(1L);
		Location location = new Location();
		location.setPincode(110037);
		akshay.setLocation(location);
		
		
		
		
		System.out.println(akshay.getLocation().getPincode());

	}
	
}
