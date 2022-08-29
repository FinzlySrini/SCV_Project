package com.packages;

import java.util.Comparator;

public class TimeComparator implements Comparator<PojoClass>{

	@Override
	public int compare(PojoClass o1, PojoClass o2) {
		// TODO Auto-generated method stub
		return o1.getLastUpdatedTime().compareTo(o2.getLastUpdatedTime());
	}
	

}