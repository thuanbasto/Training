
public class PagesNumbering {
	public static int pagesNumbering(int n){
		int result = 0;
		int count = 0; // đếm n có bao nhiều chữ số
		int temp = n; 
		while(temp > 0) {
			temp/=10;
			count++;
		}
		if (count == 1) {
			return n;
		} else {
			for (int i = 1; i < count; i++) {
				// Ta cần xác định xem n có bao nhiêu chữ số. Giả sử n có x chữ số
				// Vậy thì các số từ 1 đến x - 1 chữ số sẽ xuất hiện đủ. 
				// Riêng các số có x chữ số sẽ chỉ xuất hiện từ 10 ^x - 1 đến n
				// Cộng tổng số lượng số nhân số chữ số tương ứng, ta sẽ có kết quả cần tìm
				result += (Math.pow(10, i) - Math.pow(10, i-1))*i;
			}
		}
		// những số xuất hiện từ 10^x-1 đến n
		result += (n - Math.pow(10, count-1)+1) * count;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(pagesNumbering(1000));
	}

}
