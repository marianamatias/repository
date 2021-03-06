package edu.gatech.oad.antlab.person;

import java.util.ArrayList;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Katherine McAuliffe
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name = "Katherine McAuliffe";
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		java.util.ArrayList<Character> letters = new java.util.ArrayList<>();
		for(char n: input.toCharArray()) {
		    letters.add(n);
        }
        java.util.Collections.shuffle(letters);
        StringBuilder sb = new StringBuilder();
        for(char n : letters)
            sb.append(n);

        String rword = sb.toString();

        System.out.println(rword);

	  //Person 2 put your implementation here
	  return rword;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}

