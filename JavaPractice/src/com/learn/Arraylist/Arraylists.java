package com.learn.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class Arraylists {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(1);
		list.add(3);
		System.out.println(list);

		int element = list.get(0);
		System.out.println(element);

		list.add(2, 2);
		System.out.println(list);

		list.remove(3);
		System.out.println(list);

		int size = list.size();
		System.out.println(size);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();

//		Collections.sort(list);
		System.out.println(list);
	}

}
