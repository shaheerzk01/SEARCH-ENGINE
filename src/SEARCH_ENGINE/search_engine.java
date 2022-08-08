package SEARCH_ENGINE;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class search_engine {
	
	public static void main(String[] args) {
		System.out.println("--------------SEARCH ENGINE--------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 for Binary search\nPress 2 for Recursive Binary Search\n"
				+ "Press 3 for Linear search\nPress 4 for Jump search\n"
				+ "Press 5 for Interpolation search\nPress 6 for Exponential search\n"
				+ "Press 7 for Fibonacci search");
		
		int x = input.nextInt();
		switch(x) {
		case 1:
			long start = System.currentTimeMillis();
			Binary binary = new Binary();
			System.out.println("Enter number to search");
			int h = input.nextInt();
			int[] a = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
			int result = binary.binary(a, h);
			System.out.print("[");
			for(int i=0; i<a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println(" ]");
			String k = null;
			boolean c = false;
			for(int j=0; j<a.length; j++) {
				if(h==a[j]) {
					System.out.println("\n" + h + " found at index number " + result);
					c = true;
				}else {
					 k = "element not present";
		
				}
			}
			if(c==false) {
				System.out.println(k);
			}
			long end = System.currentTimeMillis();
			long execution = end - start;
		    System.out.println("Execution time: " + execution + " miliseconds ");
			break;
		case 2:
			long start1 = System.currentTimeMillis();
			Recursive_binary recursive_binary = new Recursive_binary();
			System.out.println("Enter number to search");
			int t = input.nextInt();
			int[] w = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
			int result1 = recursive_binary.recursive_binary(w, 0, 10, t);
			System.out.print("[");
			for(int i=0; i<w.length; i++) {
				System.out.print(" " + w[i]);
			}
			System.out.println(" ]");
			String l = null;
			boolean n = false;
			for(int j=0; j<w.length; j++) {
				if(t==w[j]) {
					System.out.println("\n" + t + " found at index number " + result1);
					n = true;
				}else if (t!=w[j]) {
					 l = "element not present";
					 
				}
			}
			if(n==false) {
				System.out.println(l);
			}
			long end1 = System.currentTimeMillis();
			long execution1 = end1 - start1;
		    System.out.println("Execution time: " + execution1 + " miliseconds ");
			break;
		case 3:
			long start2 = System.currentTimeMillis();
			Linear linear = new Linear();
			System.out.println("Enter number to search");
			int e = input.nextInt();
			int[] z = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
			int result2 = linear.linear(z, e);
			System.out.print("[");
			for(int i=0; i<z.length; i++) {
				System.out.print(" " + z[i]);
			}
			System.out.println(" ]");
			String r = null;
			boolean s = false;
			for(int j=0; j<z.length; j++) {
				if(e==z[j]) {
					System.out.println("\n" + e + " found at index number " + result2);
					s = true;
				}else if (e!=z[j]) {
					 r = "element not present";
					 
				}
			}
			if(s==false) {
				System.out.println(r);
			}
			long end2 = System.currentTimeMillis();
			long execution2 = end2 - start2;
		    System.out.println("Execution time: " + execution2 + " miliseconds ");
			break;
		case 4:
			long start3 = System.currentTimeMillis();
			Jump jump = new Jump();
			System.out.println("Enter number to search");
			int p = input.nextInt();
			int[] q = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
			int result3 = jump.jump_search(q, p);
			System.out.print("[");
			for(int i=0; i<q.length; i++) {
				System.out.print(" " + q[i]);
			}
			System.out.println(" ]");
			String u = null;
			boolean m = false;
			for(int j=0; j<q.length; j++) {
				if(p==q[j]) {
					System.out.println("\n" + p + " found at index number " + result3);
					m = true;
				}else if (p!=q[j]) {
					 u = "element not present";
					 
				}
			}
			if(m==false) {
				System.out.println(u);
			}
			long end3 = System.currentTimeMillis();
			long execution3 = end3 - start3;
		    System.out.println("Execution time: " + execution3 + " miliseconds ");
			break;
		case 5:
			long start4 = System.currentTimeMillis();
			Interpolation interpolation = new Interpolation();
			System.out.println("Enter number to search");
			int v = input.nextInt();
			int[] b = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
			int result4 = interpolation.interpolation(b, v);
			System.out.print("[");
			for(int i=0; i<b.length; i++) {
				System.out.print(" " + b[i]);
			}
			System.out.println(" ]");
			String o = null;
			boolean f = false;
			for(int j=0; j<b.length; j++) {
				if(v==b[j]) {
					System.out.println("\n" + v + " found at index number " + result4);
					f = true;
				}else if (v!=b[j]) {
					 o = "element not present";
					 
				}
			}
			if(f==false) {
				System.out.println(o);
			}
			long end4 = System.currentTimeMillis();
			long execution4 = end4 - start4;
		    System.out.println("Execution time: " + execution4 + " miliseconds ");
			break;
		case 6:
			long start5 = System.currentTimeMillis();
			Exponential exponential = new Exponential();
			System.out.println("Enter number to search");
			int d = input.nextInt();
			int[] g = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
			int result5 = exponential.exponential(g, d);
			System.out.print("[");
			for(int i=0; i<g.length; i++) {
				System.out.print(" " + g[i]);
			}
			System.out.println(" ]");
			String y = null;
			boolean a1 = false;
			for(int j=0; j<g.length; j++) {
				if(d==g[j]) {
					System.out.println("\n" + d + " found at index number " + result5);
					a1 = true;
				}else if (d!=g[j]) {
					 y = "element not present";
					 
				}
			}
			if(a1==false) {
				System.out.println(y);
			}
			long end5 = System.currentTimeMillis();
			long execution5 = end5 - start5;
		    System.out.println("Execution time: " + execution5 + " miliseconds ");
			break;
		case 7:
			long start6 = System.currentTimeMillis();
			Fibonacci fibonacci = new Fibonacci();
			System.out.println("Enter number to search");
			int s1 = input.nextInt();
			int[] f1 = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
			int result6 = fibonacci.fibonacci(f1, s1);
			System.out.print("[");
			for(int i=0; i<f1.length; i++) {
				System.out.print(" " + f1[i]);
			}
			System.out.println(" ]");
			String d1 = null;
			boolean q1 = false;
			for(int j=0; j<f1.length; j++) {
				if(s1==f1[j]) {
					System.out.println("\n" + s1 + " found at index number " + result6);
					q1 = true;
				}else if (s1!=f1[j]) {
					 d1 = "element not present";
					 
				}
			}
			if(q1==false) {
				System.out.println(d1);
			}
			long end6 = System.currentTimeMillis();
			long execution6 = end6 - start6;
		    System.out.println("Execution time: " + execution6 + " miliseconds ");
			break;
		}
			
	}
	
}
