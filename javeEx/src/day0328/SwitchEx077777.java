package day0328;

public class SwitchEx077777 {
	public static void main(String[] args) {
		int speed = 90;
		String name = " "; 
		name = "빠르기는 "+speed+" 점이고, ";
		switch(speed) {
			case 90:
				name += "상급, ";
				break;
			case 80:
				name += "중급, ";
			case 70:
				name += "초보, ";
			default:
				name += "유아용";
				
		}
		System.out.println(name+"레인 이용가능합니다.");
	}
}
/* while(조건식){ 
  		실행문;
  		증감식;
	}
 	for(초기식; 조건식; 증감식){
 	}
	switch(변수){
	case 값:
	break;
	}



 */
