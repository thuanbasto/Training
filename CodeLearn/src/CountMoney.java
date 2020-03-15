
public class CountMoney {
	public static long countMoney(long moneyToBuy){
		long result = 0;
		long money[] = {1000,2000,5000,10000,20000,100000,200000,500000};
		long temp = 0;
		temp = moneyToBuy/money[7];
		moneyToBuy-= money[7]*temp;
		result+=temp;
		temp = moneyToBuy/money[6];
		moneyToBuy-= money[6]*temp;
		result+=temp;
		temp = moneyToBuy/money[5];
		moneyToBuy-= money[5]*temp;
		result+=temp;
		temp = moneyToBuy/money[4];
		moneyToBuy-= money[4]*temp;
		result+=temp;
		temp = moneyToBuy/money[3];
		moneyToBuy-= money[3]*temp;
		result+=temp;
		temp = moneyToBuy/money[2];
		moneyToBuy-= money[2]*temp;
		result+=temp;
		temp = moneyToBuy/money[1];
		moneyToBuy-= money[1]*temp;
		result+=temp;
		temp = moneyToBuy/money[0];
		moneyToBuy-= money[0]*temp;
		result+=temp;
		return result;
	}
	public static void main(String[] args) {

	}

}
