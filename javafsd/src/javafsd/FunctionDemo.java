package javafsd;

import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {
	Function<String,Integer> f =i -> i.length();
	System.out.println(f.apply("Hello"));
	}
}
