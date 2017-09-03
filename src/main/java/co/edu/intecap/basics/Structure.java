/*
 * All rights revesver for Intecap
 * Copyright 2017/2019
 * 
 */

package co.edu.intecap.basics;

/**
 * This class is responsible for
 * printing user messages
 * 
 * @author cesar07hoyos@gmail.com
 * @version 0.0.1
 * @since 0.0.1
 * 
 */
public class Structure {
	
	/**
	 * This method say hello with name in upper case
	 * @param name - The name of the user
	 * @return The hello message
	 */
	public String sayUpperHello(String name) {
		return "Hi " + name.toUpperCase();
	}
	
	/**
	 * This method say hello with name in lower case
	 * @param name - The name of the user 
	 * @return The hello message
	 */
	public String sayLowerHello(String name) {
		// name is the user name
		return "Hi " + name.toLowerCase();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Structure st =  new Structure();
		System.out.println(st.sayUpperHello("cesar"));
	}
}
