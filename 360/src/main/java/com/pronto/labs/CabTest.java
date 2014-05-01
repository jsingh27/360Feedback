package com.pronto.labs;

import com.pronto.cabs.Location;
import com.pronto.cabs.User;

public class CabTest {

	public static void main(String[] args) {
		
		User akshay = new User();
		
		akshay.setName("akshay");
		akshay.setId(1L);
		
		Location location = new Location();
		location.setPincode(110037);
		
		akshay.setLocation(location);
		
		System.out.println(akshay.getLocation().getPincode());

	}
	
}
