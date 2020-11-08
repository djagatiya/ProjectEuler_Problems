/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Ans : 232792560
 */
public class Prob_5 {

	static boolean isAllDivisible(int num) {
		for(int i=2;i<=20;i++) {
			if(num % i != 0) {
				return false;
			} 
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 1;
		while(true) {
			if(isAllDivisible(num)) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}
}
