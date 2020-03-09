
public class DistributeCandyAndCake {
	public static int distributeCandy(int[] man, int b, int k, int n){
		int result = 0;
		int candy = 0;
		int cake = 0;
		int lenght = man.length;
		int i = 0;
		while (i < lenght-2) {
			// 2 người lớn gần nhau + 1 bánh
			if (man[i] > 15 && man[i+1] > 15 && man[i+2] > 15) {
				cake++;
				i++;
			} else if (man[i] > 15 && man[i+1] > 15 && man[i+2] <= 15) {
				cake+=2;
				i+=2;
			} else if (man[i] > 15 && man[i+1] <= 15 && man[i+2] > 15) { 
				candy+=4;
				cake+=2;
				i+=2;
			} else if (man[i] > 15 && man[i+1] <= 15 && man[i+2] <= 15) { 
				cake+=2;
				i++;
			} else if (man[i] <= 15 && man[i+1] <= 15 && man[i+2] > 15) {
				candy+=16;
				i+=2;
			} else if (man[i] <= 15 && man[i+1] <= 15 && man[i+2] <= 15) {
				candy+=8;
				i++;
			} else if (man[i] <= 15 && man[i+1] > 15 && man[i+2] <= 15) {
				cake+=2;
				candy+=4;
				i+=2;
			} else if (man[i] <= 15 && man[i+1] > 15 && man[i+2] > 15) {
				candy+=4;
				i++;
			}
		}
		if (man[lenght-2] > 15 && man[lenght-1] > 15) {
			cake+=2;
		} else if (man[lenght-2] <= 15 && man[lenght-1] <= 15) {
			candy+=16;
		} else if (man[lenght-2] > 15 && man[lenght-1] <= 15) {
			cake+=2;
			candy+=4;
		} else {
			cake+=2;
			candy+=4;
		}
		result = (cake*b + candy*k) - n;
		if (result <= 0) {
			return 0;
		}
		return result;
	}

	public static void main(String[] args) {
		int man[] = {1,16,12,20,30,1,2};
		System.out.println(distributeCandy(man, 6, 4, 60));
	}

}
