package com.collections.geeks;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
ArrayList<Integer> a=new ArrayList<Integer>(n);
		for(int i=1;i<=n;i++)
			a.add(i);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		for(int i=0;i<a.size();i++)
			System.out.println("ele= "+a.get(i)+" ");
	}

}
