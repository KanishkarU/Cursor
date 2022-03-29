package org.cursor;

import java.util.*;


public class Cursor {
	public static void main(String[] args) {
		
		//Enumeration
	
		
			Vector<Integer> v = new Vector<>();
			v.add(1);
			v.add(2);
			v.add(3);
			
			System.out.println("kanishkar");
			Enumeration<Integer> elements2 = v.elements();
			while(elements2.hasMoreElements()) {
				Integer l = elements2.nextElement();
				System.out.println(l);
			}
		}
		
		
		
		
	}


