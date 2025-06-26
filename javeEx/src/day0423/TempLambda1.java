package day0423;
import java.util.function.*;
public class TempLambda1 {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add = (a,b)->{return a+b;};
		Integer result = add.apply(5, 8);
		System.out.println(result);
	}
}
