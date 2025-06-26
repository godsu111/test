package day0422;

import java.util.HashSet;
import java.util.Set;
class Yo{
	int id;
	
	Yo(int id){
		this.id=id;
	}
	public int hashCode() {
		return Integer.hashCode(id);
	}
	public boolean equals(Object obj){
		boolean result = false;
		if (obj instanceof Yo) {
			result=this.id==((Yo) obj).id;
		}
		return result;
	}
}
// Set 중복X, 순서X HashSet, TreeSet
public class Temp {
	public static void main(String[] args) {
		Set<Yo> set = new HashSet<Yo>();
		set.add(new Yo(1)); 
		set.add(new Yo(1));
		set.add(new Yo(2));
		// 3개 다 다른 객체 equals와 hashCode의 재정의 필요
		System.out.println(set);
		System.out.println(set.size());
		
	}
}
