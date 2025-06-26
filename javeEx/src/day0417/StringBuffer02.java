package day0417;

public class StringBuffer02 {
	public static void main(String[] args) {
		long start, end;
		
		// StringBuilder
		StringBuilder builder = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			builder.append('a');
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder 소요시간 : "+(end-start)+"ms");
	
		// StringBuffer
		StringBuffer buffer = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			buffer.append('b');
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer의 소요시간 : "+(end-start)+"ms" );
	}
}
