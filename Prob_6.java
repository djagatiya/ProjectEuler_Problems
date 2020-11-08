/**
 * The sum of the squares of the first ten natural numbers is,
 * 	1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * 	(1 + 2 + ... + 10)^2 = 55^2 = 3025 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .i
 * 	3025 - 385 = 2640
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * Answer : 25164150 
 */

public class Prob_6 {
	public static void main(String[] args) {
		int start = 1, end = 100;
		int sum = 0, squaredSum = 0;
		for(int i = start; i <= end; i++) {
			squaredSum += (i * i);
			sum += i;
		}
		int ans = (sum * sum) - squaredSum;
		System.out.println(ans);
	}
}
