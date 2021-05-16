package Chuong2;

public class Bai5 {
	private boolean flag;
	private boolean checkFull;
	private int soNguyenTo;
	private int tong;

	public Bai5() {
		this.flag = false;
		this.checkFull = false; 
		this.soNguyenTo = 0;
		this.tong = 0;
	}

	public int getTong() {
		return this.tong;
	}

	public synchronized void timSoNguyenTo() {
		try {
			for (int n=2;n<=1000;n++) {
				if (flag == false) {
					boolean check = true;
					for (int i=2;i<=Math.sqrt(n);i++) {
						if (n%i == 0) {
							check = false;
							break;
						}
					}
					if (check == true) {
						this.soNguyenTo = n;
						System.out.println("SNT la: "+this.soNguyenTo);
						flag = true;
						notifyAll();
						wait();
					}
					if (n==1000) {
						this.checkFull = true;
						notifyAll();
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void tinhTong() {
		try {
			while (true) {
				if (this.checkFull == true) {
					break;
				}
				if (flag == true) {
					this.tong += this.soNguyenTo;
					System.out.println("Tong la: "+this.tong);
					flag = false;
					notifyAll();
					wait();
				}
				else {
					wait();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Bai5 run = new Bai5();
//		long s1=System.currentTimeMillis();
//		long s2=0;
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				run.timSoNguyenTo();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				run.tinhTong();
			}
		});
		thread1.start();
		thread2.start();
		thread1.join();
//		s2 = System.currentTimeMillis();
//		System.out.println(s2-s1);
		System.out.println("Tong cac so nguyen to la: "+run.getTong());
	}
}
