public class SuperEvenNumber {
	public static int superEvenNumber(int n)
	{
	    String s = n+"";
	    int result = 0;
	    if(n == 0 || n == 1)
	        return 0;
	    if(n<10)
	        return n/2;
	    for(int i = s.length()-1; i >= 0; i--){
	        int tmp = n/(int)Math.pow(10,i);
	        if(tmp%2 != 0){
	            tmp -= 1;
	            tmp *= (int)Math.pow(10,i);
	            for(int j = i-1; j >= 0; j--){
	                tmp +=Math.pow(10,j)*8;
	            }
	            n = tmp;
	        }
	    }
	    String temp2 = ""+n;
				int index = 0;
				while (index < temp2.length()) {
					int tempNumber = Integer.valueOf(String.valueOf(temp2.charAt(index)));
					if (index == s.length()-1) {
						if (tempNumber == 2) { // 2222
							result += 1; 
						} else if (tempNumber == 4) {
							result += 2;  
						} else if (tempNumber == 6) {
							result += 3; 
						} else if (tempNumber == 8) {
							result += 4; 
						} else result +=0;
						break;
					}
					if (tempNumber == 2) { // 2222
						result += 1*Math.pow(5, temp2.length()-1-index); 
					} else if (tempNumber == 4) {
						result += 2*Math.pow(5, temp2.length()-1-index);  
					} else if (tempNumber == 6) {
						result += 3*Math.pow(5, temp2.length()-1-index); 
					} else if (tempNumber == 8) {
						result += 4*Math.pow(5, temp2.length()-1-index); 
					}
					index++;
			}
			return result;
	}

	public static void main(String[] args) {
		System.out.println(superEvenNumber(312)); // 88888
	}

}
