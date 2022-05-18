package package1;

public class Class1 {
	int count=0;
	void isPrime(int num) {
		boolean isPrimeNumberFlag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrimeNumberFlag = false;
				break;
			}
		}

		if (isPrimeNumberFlag == true) {
			System.out.println(num);
			count++;
		}

	}

	void findFirstNPrime(int startRange, int endRange, int targetNumber) {
		System.out.println("First " + targetNumber + " prime numbers in range between " + startRange + " to " + endRange
				+ " :-->");
		while (startRange <= endRange) {
			isPrime(startRange);
			startRange++;
			if (count == targetNumber)
				break;
		}
	}
public static void main(String[]args) {
	Class1 Class1 = new Class1();
	Class1.findFirstNPrime(50,500,3);
}
}

