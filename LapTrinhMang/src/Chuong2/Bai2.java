package Chuong2;

import java.util.Scanner;


public class Bai2{
	private boolean check;
	private float cd;
	private float cr;
	private float s;
	private float p;

	public float getDienTich() {
		return s;
	}
	
	public float getChuVi() {
		return p;
	}
	
	public Bai2() {
		this.check=false;
		this.cd = 0;
		this.cr = 0;
		this.p = 0;
		this.s = 0;
	}
	public synchronized void Nhap() {
		try {
			if (check ==  false) {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap chieu dai va chieu rong:");
				this.cd = sc.nextFloat();
				this.cr = sc.nextFloat();
				check = true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		notifyAll();
	}
	public synchronized void DienTich() {
		try {
			if (check ==  true) {
				this.s = this.cd * this.cr;
			}
			else {
				wait();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void ChuVi() {
		try {
			if (check ==  true) {
				this.p = 2*(this.cd+this.cr);
			}
			else {
				wait();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Bai2 run = new Bai2();
		Thread cau1 = new Thread(new Runnable() {
			public void run() {
				run.Nhap();
			}
		});
		Thread cau2 = new Thread(new Runnable() {
			public void run() {
				run.ChuVi();
			}
		});
		Thread cau3 = new Thread(new Runnable() {
			public void run() {
				run.DienTich();
			}
		});
		cau1.start();
		cau2.start();
		cau3.start();
		cau2.join();
		cau3.join();
		System.out.println("Chu vi:"+ run.getChuVi());
		System.out.println("Dien Tich:" + run.getDienTich());
	}
}
