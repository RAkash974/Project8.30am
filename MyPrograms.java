package org.prgms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyPrograms {
	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter the Number");
	List<Integer> a=new ArrayList(4);
	for(int i=0;i<4;i++) {
		a.add(s.nextInt());
	}
	
	for(int i=0;i<a.size();i++) {
		for(int j=0;j<a.size();j++) {
			if(i!=j) {
				if(a.get(i)==a.get(j) ){
				a.remove(j);
			}
			}
		}
	}
	for(Integer x:a) {
		System.out.println(x);
	}
}
}

