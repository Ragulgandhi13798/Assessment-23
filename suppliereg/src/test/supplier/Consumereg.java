package test.supplier;

import java.util.function.Consumer;

public class Consumereg {

	public static void main(String[] args) {
		Consumer<Integer> o = (a)->
		System.out.println(a);
            o.accept(5);
	}

}
