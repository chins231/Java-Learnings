package nov12.basics;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomwNumbersStrings {

	public static void main(String[] args) {
		Random random =new Random();
		int num=random.nextInt(5000);
		System.out.println(num);
		System.out.println(random.nextDouble());
		System.out.println(Math.random());
		System.out.println(RandomStringUtils.randomNumeric(5));
		System.out.println(RandomStringUtils.randomAlphabetic(6));
	}

}
