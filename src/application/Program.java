package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Students> set = new HashSet<Students>();
		
		int i, id, n;
		
		
		System.out.print("How many students for course A: ");
		n = sc.nextInt();
		sc.nextLine();
		for(i = 0; i<n; i++) {
			id = sc.nextInt();
			set.add(new Students(id));
		}
		
		System.out.print("How many students for course B: ");
		n = sc.nextInt();
		sc.nextLine();
		for(i = 0; i<n; i++) {
			id = sc.nextInt();
			set.add(new Students(id));
		}
		
		System.out.print("How many students for course C: ");
		n = sc.nextInt();
		sc.nextLine();
		for(i = 0; i<n; i++) {
			id = sc.nextInt();
			set.add(new Students(id));
		}
		
		System.out.println("Total students: " + set.size());
			
			
		sc.close();
	}
	
	
	
}
