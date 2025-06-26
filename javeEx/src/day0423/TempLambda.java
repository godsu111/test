package day0423;
import java.util.function.Consumer;

public class TempLambda {
	public static void main(String[] args) {
	
	Consumer<String> c = (msg)-> {System.out.println(msg);};
	c.accept(";;");
	
	}
}
