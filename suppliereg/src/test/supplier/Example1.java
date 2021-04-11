package test.supplier;

import java.util.function.Supplier;

public class Example1 {

	

	public static void main(String[] args) {
		 Supplier<Integer> s = ()->{
			 Integer id = 1 ;
	        for(int i=0;i<6;i++)
			 {
				 id=(int) (id+Math.random()*100000);
				 
			 }
			return id; 
		 };
         System.out.println("employee id 1:" +s.get());
         System.out.println("employee id 2:" +s.get());
         System.out.println("employee id 3:" +s.get());
         System.out.println("employee id 4:" +s.get());
         System.out.println("employee id 5:" +s.get());
	}

}
