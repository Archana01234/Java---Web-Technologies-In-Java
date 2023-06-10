package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo implements Comparator<Emp> {


	public int compare(Emp e1, Emp e2) {
		int value=0;
		if(e1.getSel()>e2.getSel());
		{
			value=1;	
		}
		 if (e1.getSel()<e2.getSel()) 
		{
			value=-1;	
		}
		else if (e1.getSel()==e2.getSel()) 
		{
			value=0;
		}

		
		
		
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<>();
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("harsh");
		e1.setSel(15000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("anjali");
		e2.setSel(10000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("heer");
		e3.setSel(5000);
		
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list,new ComparatorDemo() );
		for (Emp e:list);
		{
			System.out.println("EID :"+e1.getEid()+"ENAME :"+e1.getEname()+"SALLARY :"+e1.getSel());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

