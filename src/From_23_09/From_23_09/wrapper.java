package From_23_09;

import java.util.ArrayList;

public class wrapper {
	public static void main(String[] args) {
		Integer I=10;
		System.out.println(I);
		int i=new Integer(20);
		System.out.println(i);
		
	}
}
class Calculator{
	void add(Integer i) {
		System.out.println("wrapper"+" "+i);
	}
	void add(int i) {
		System.out.println("Primitive"+" "+i);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(45);
		c.add(new Integer(45));
		
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(4);
		al.add(3);
		Object i = al.get(2);
//		i=new Integer(3);
		int j = (Integer)i;
		System.out.println(j);
		
		
	}
}