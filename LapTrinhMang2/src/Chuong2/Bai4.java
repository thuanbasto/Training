package Chuong2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
	private List<Integer> listSNT;

	public Bai4() {
		listSNT = new ArrayList<Integer>();
	}

	public synchronized void timSoNguyenTo(int min,int max) {
		try {
			for (int n=min;n<max;n++) {
				boolean check = true;
				if (n<2) {
					continue;
				}
				else {
					for (int i=2;i<=Math.sqrt(n);i++) {
						if (n%i == 0) {
							check = false;
							break;
						}
					}
					if (check == true) {
						this.listSNT.add(n);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ghiFile(){
		try {
			Collections.sort(this.listSNT);
			@SuppressWarnings("resource")
			PrintStream printStream = new PrintStream("SoNguyenTo.txt");
			for (Integer integer : this.listSNT) {
				printStream.println(integer);
			}
			printStream.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a va b: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = b - a;
		int x = n/3;
//		long s1=System.currentTimeMillis();
//		long s2=0;
		Bai4 run = new Bai4();
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				run.timSoNguyenTo(a,a+x);
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				run.timSoNguyenTo(a+x,a+x+x);
			}
		});
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				run.timSoNguyenTo(a+x+x,b+1);
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
		thread1.join();
		thread2.join();
		thread3.join();
//		s2 = System.currentTimeMillis();
//		System.out.println("Thoi gian ton: "+(s2-s1));
		run.ghiFile();
		System.out.println("Done");
	}
}
