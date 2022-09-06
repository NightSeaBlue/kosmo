package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02_Easy_Use {

	public static void main(String[] args) {
		
		String [][]arr1 = new String [][] {{"홍길동","이순신","세종대왕"}, 
			{"독수리","부엉이","닭","오리"},{"붕어","가물치","잉어"},
			{"호랑이","사자"}};
		
		String [] arr2 ;
		arr2 = new String [] {"사람 이름 : ", "새 이름 : ","물고기 이름 : ","포유류 이름 : "};
		
		System.out.println("=== for ===");
		for (int i=0 ; i <arr1.length ; i++) {
			System.out.print(arr2[i]);
			for (int j=0; j<arr1[i].length ; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=== Enhanced For ===");
		
		int e =0;
		for (String []a : arr1) {
			System.out.print(arr2[e]);
			for (String b : a) {
				System.out.print(b + " ");
			}System.out.println();
			e++;
		}
		
		System.out.println();
		System.out.println("=== Arrays.toString() ===");
		for (int i=0 ; i <arr1.length ; i++) {
			System.out.print(arr2[i]);
			System.out.println(Arrays.toString(arr1[i]));
		}
		

	}

}
