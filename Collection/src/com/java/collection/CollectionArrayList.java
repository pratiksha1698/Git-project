package com.java.collection;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("pratiksha");
		list.add("thakur");
		list.add("rakesh");
		list.stream().forEach(x->System.out.println(x));
	}
}
