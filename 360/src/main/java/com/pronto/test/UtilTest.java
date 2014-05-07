package com.pronto.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import com.pronto.cabs.User;

public class UtilTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Hello");
		
		
		String a = new String("hello");
		String b = new String("hello");
		
//		System.out.println("String: " + a.equals(b));
		
		
		
		
		
		
		List<String> strings = new ArrayList<String>();

		
		
		User karan = new User();
		karan.setName("karan");
		karan.setId(1L);
		
		User gujral = new User();
		gujral.setName("gujral");
		gujral.setId(2L);
		
		User hello = new User();
		hello.setName("hello");
		hello.setId(2L);
		
		List<User> users = new ArrayList<User>();
		users.add(gujral);
		users.add(karan);
		
		
		
		users.remove(hello);
//		System.out.println(users.contains(asd));
		
//		System.out.println(users);
		
		
		
//		strings.add("Karan");
//		strings.add("Akshay");
//		strings.add("Sandeep");
//		strings.add("Jassi");
//		strings.add("Neha");
//		
//		List<String> stringList = new LinkedList<String>();
//		stringList.add("Karan");
//		stringList.add("Akshay");
//		stringList.add("Karan");
//		stringList.add("Sandeep");
//		stringList.add("Jassi");
//		stringList.add("Neha");
//		stringList.remove("Karan");
//		System.out.println(stringList);
		
		
		Set<User> userSet = new HashSet<User>();
		userSet.add(karan);
		userSet.add(gujral);
		userSet.add(hello);
//		System.out.println(karan.hashCode());

		
		Set<User> treeUsers = new TreeSet<User>();
		treeUsers.add(karan);
		treeUsers.add(gujral);
		treeUsers.add(hello);
//		System.out.println(treeUsers);
		
//		Set<String> sets = new TreeSet<String>();
//		sets.add("karan");
//		sets.add("kaarna");
//		sets.add("akshay");
//		sets.add("kaaae");
//		System.out.println(sets);
		
		Map<Integer, User> map = new HashMap<Integer, User>();
		map.put(0, karan);
		map.put(1, gujral);
		map.put(1, hello);
		
		map.remove(1);
		
		System.out.println(map);
		
	} 
}
