package day1.Q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Product> PQ = new PriorityQueue<>();
		
		System.out.println("Enter no of Product: ");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Product Id: ");
			int id = sc.nextInt();
			System.out.println("Enter the Product Name: ");
			String name = sc.next();
			System.out.println("Enter the Product Price: ");
			int price = sc.nextInt();
			PQ.add(new Product(id,name,price));
		}

		ArrayList<Product> arr = new ArrayList<>();
		
		Product P;
		
		while ((P=PQ.poll())!=null) {
			arr.add(P);
		}
		
		Iterator<Product> itr = arr.iterator();
		while(itr.hasNext()) {
			Product s = itr.next();
			 System.out.println(s);
		}
		
	}

}
