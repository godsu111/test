package day0407;

public class TvMain {
	public static void main(String[] args) {
		// 객체 생성
		Tv v1 = new Tv("v1");
		Tv v2 = new Tv("v2", "회색");
		Tv v3 = new Tv("울트라TV","검정",48);
		
		// 값 확인		
		System.out.println("v1의 모델은 : "+v1.model);
		System.out.println("v2의 모델은 : "+v2.model);
		System.out.println("v2의 색상은 : "+v2.color);
		System.out.println("v3의 제조사는 : "+v3.brand);
		System.out.println("v3의 모델은 : "+v3.model);
		System.out.println("v3의 색상은 : "+v3.color);
		System.out.println("v3의 인치는 : "+v3.inch);
		System.out.println("=================");
		
		// 값 변경
		v1.model = "V1";
		v2.model = "V2";
		v2.color = "녹색";
		v3.brand = "LG";
		v3.model = "SlimTv";
		v3.color = "White";
		v3.inch = 80;
		
		// 변경 값 확인
		System.out.println("변경된 v1의 모델은 : "+v1.model);
		System.out.println("변경된 v2의 모델은 : "+v2.model);
		System.out.println("변경된 v2의 색상은 : "+v2.color);
		System.out.println("변경된 v3의 제조사는 : "+v3.brand);
		System.out.println("변경된 v3의 모델은 : "+v3.model);
		System.out.println("변경된 v3의 색상은 : "+v3.color);
		System.out.println("변경된 v3의 인치는 : "+v3.inch);
		
	}
}
