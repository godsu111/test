package day0403;

public class ArrayMyEx07 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7, -9 };
		//역순 출력
		for(int a=nums.length-1; a>=0; a--) {
			System.out.println(nums[a]);
		}
		//최솟값 출력
		int min = nums[0];
		for(int a=1; a<nums.length; a++) {
			if(nums[a]<min) {
				min = nums[a];
			}
		}
		System.out.println(min);
		//for문으로 최솟값 출력
		int min1 = nums[0];
		for(int a : nums) {
			if(min1 > a) {
				min1 = a;
			}
		}
		System.out.println("최솟값은 : "+min1);
	}
}
