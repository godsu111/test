package day0404;

public class Animal { //동물
	//변수
	String species; // 종
	int weight;  // 몸무게
	boolean sex;    // 성별
	String area;
	
	Animal(String a, String b, boolean c, int d){
		area = a;
		species = b;
		sex = c;
		weight = d;
	}
}
