package Chuong2;
class Bai1 extends Thread {
	int delay;
	int n;
	public Bai1(int n,int delay){
		this.n = n;
		this.delay = delay;
	}
	void cau1(int n){
		for(int i=1; i<n; i++ )
		{
			if (i%2==1){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	void cau2(int n){
		for(int i=1; i<n; i++ )
		{
			if (i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	void cau3(int n){
		for(int i=1; i<=n; i++ )
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	void cau4(){
		for(char i=65; i<91; i++ )
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void run(){
		try{
			for (int i=0;i<15;i++){
				if (this.n==1){
					cau1(10);
				}
				else if (this.n==2){
					cau2(10);
				}
				else if (this.n==3){
					cau3(10);
				}
				else cau4();
				sleep(this.delay);
			}
		}
		catch(Exception e){
			return;
		}
	}
	public static void main(String[] args) {
		Bai1 a1=new Bai1(1,1000);
		Bai1 a2=new Bai1(2,6000);
		Bai1 a3=new Bai1(3,3000);
		Bai1 a4=new Bai1(4,2000);	
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
