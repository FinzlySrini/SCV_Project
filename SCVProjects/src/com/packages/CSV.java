package com.packages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CSV {
	public static void main(String[] args) throws IOException {
		String filepath = "C:\\Users\\gsrin\\Downloads\\CurrencyPairs.csv";
		String line =  null;
		String [] cp = null;
		String cps = null;
		ArrayList<PojoClass> c = new ArrayList<>();
		BufferedReader bf = new BufferedReader(new FileReader(filepath));
		while((line = bf.readLine()) != null) {
			cp = line.split(",");
			cps = cp[0]+cp[1];
			c.add(new PojoClass(cp [0],cp[1],cp[2],cp[3],cp[4],cp[5],cps));
			Collections.sort(c,new CurrencyPairComparator());
		}
		for(PojoClass s1:c) {
			System.out.println(s1);
		}
		retriveData(c);	
	
		/*sortTime(c);
		for(CurrencyPairs cc :c) {
			System.out.println(cc); 
			}*/
		/*sortCurrencyPair(c);
		for(CurrencyPairs cc :c) {
			System.out.println(cc); 
			}*/		
	}
	public static void retriveData(ArrayList<PojoClass> c) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Currency Pairs");
		String pairs = input.next();
		for(PojoClass cc:c) {
			if(pairs.equals(cc.getCcy1()+cc.getCcy2())) {
				System.out.println(cc);
			}
		}	
	}
	public static void sortDate(ArrayList<PojoClass> c) {
		Collections.sort(c,new TimeComparator());
	}
	public static void sortCurrencyPair(ArrayList<PojoClass> c) {
		Collections.sort(c,new CurrencyPairComparator());
	}

}


