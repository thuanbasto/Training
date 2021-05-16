package Chuong2;

public class Bai3 {
	private int soNgauNhien;
	private int tongBinhPhuong;

	public Bai3() {
		this.soNgauNhien = 0;
		this.tongBinhPhuong = 0;
	}

	public void random(){
		while(true) {
			try {
				Thread.sleep(2000);
				this.soNgauNhien = (int) (Math.random()*20+1);
				System.out.println("So ngau nhien la: "+this.soNgauNhien);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void getRandom(){
		while(true) {
			try {
				Thread.sleep(1000);
				this.tongBinhPhuong = this.soNgauNhien*this.soNgauNhien;
				System.out.println("Binh phuong:" +this.tongBinhPhuong);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Bai3 run = new Bai3();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				run.random();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				run.getRandom();
			}
		});
		thread1.start();
		thread2.start();
	}
}
