package day0423;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class TempStream {
	public static void main(String[] args) {
		Arrays.stream(new int[] {1,1,2,3,4,5,5,6,7,8,9,1,})
			  .distinct(); // 중복제거

	}
}
