package day0403;

public class ArrayMyEx08 {
    public static void main(String[] args) {
        int[][] image = {
            {255, 128, 64},
            {32, 16, 8},
            {4, 2, 1}};
        for(int a=0; a<image.length; a++) {
        	for(int b=0; b<image[a].length; b++) {
        		System.out.print(image[a][b]+" ");
        	}
        	System.out.println();
        }
        for(int[] a : image) {
        	for(int b : a) {
        		System.out.print(b+" ");
        	}
        	System.out.println();
        }
}
}