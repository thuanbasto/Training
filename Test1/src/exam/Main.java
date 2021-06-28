package exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		Set<Integer> set = new HashSet<>(Arrays.asList(a,b,c,d));
		
		if (set.size() < 2 || set.size() == 4) System.out.println("NO");
		else System.out.println("YES");
		
	}
}

//import java.util.Scanner;
//
//public class Main {
//	public static int S(int n) {
//		int a = 0;
//		while (n > 0) {
//			a += n%10;
//			n /= 10; 
//		}
//		return a;
//	}
//	public static void main(String[] args) {
//		
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		int count = 0;
//		while (n > 0) {
//			n -= S(n);
//			count++;
//		}
//		System.out.println(count);
//	}
//}

//package exam;
//
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		int n = 4, m = 4;
////		Scanner sc = new Scanner(System.in);
//		String[][] arr = {
//				{".","*","*","*"},
//				{".","*",".","*"},
//				{".","*","*","*"},
//				{".",".",".","."}
//		};
//		int rStart = 0;
//		int rEnd = 0;
//		int cStart = 0;
//		int cEnd = 0;
//		boolean check = false;
//		for (int i = 0; i < n; i++) {
//			int count = 0;
//			for (int j = 0; j < m; j++) {
//				if (arr[i][j].equals("*") && check == false) {
//					check = true;
//					rStart = i;
//					cStart = j;
//					count++;
//				} else if (arr[i][j].equals("*")) {
//					cEnd = j;
//					if (check == true) count++;
//				} else {
//					check = false;
//				}
//				while (count >= 3 && check == true) {
//					int countLeft = 0;
//					int countRight = 0;
//					int countBottom = 0;
//					for (int q = rStart; q < n; q++) {
//						if (arr[q][cStart].equals(".")) break;
//						else {
//							countLeft++;
//							rEnd = q;
//						}
//					}
//					for (int q = rStart; q < n; q++) {
//						if (arr[q][cEnd].equals(".")) break;
//						else countRight++;
//					}
//					for (int q = cStart; q <= cEnd; q++) {
//						if (arr[rEnd][q].equals(".")) break;
//						else countBottom++;
//					}
//					if (countLeft == countRight && countLeft == countBottom) {
//						check = true;
//						System.out.println("YES");
//						break;
//					} else {
//						if (count >= 3) count --;
//					}
//				}
//			}
//		}
//		if (check == false) System.out.println("NO");
//	}
//}
