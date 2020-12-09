package test1.bread.factory;

import java.util.ArrayList;

import test1.bread.product.*;

public class BreadMain {

	public static void main(String[] args) {
		
		Factory factory = new RealFactory();
		ArrayList<Bread> list = new ArrayList<Bread>();
		
		Bread butterBread = (ButterBread)factory.create("butter");
		((ButterBread) butterBread).setFlour(100);
		((ButterBread) butterBread).setWater(100);
		((ButterBread) butterBread).setButter(50);
		list.add(butterBread);
		
		Bread creamBread = (CreamBread)factory.create("cream");
		((CreamBread) creamBread).setFlour(100);
		((CreamBread) creamBread).setWater(100);
		((CreamBread) creamBread).setCream(200);
		list.add(creamBread);
		
		Bread sugarBread = factory.create("sugar");
		((SugarBread) sugarBread).setFlour(100);
		((SugarBread) sugarBread).setWater(50);
		((SugarBread) sugarBread).setSugar(200);
		list.add(sugarBread);
		
		int totalElements = list.size();
		for (int i = 0; i < totalElements; i++) {
			   list.get(i).recipe();
			   System.out.println();
		}


	}

}
