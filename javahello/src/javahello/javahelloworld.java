package javahello;

public class javahelloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Java");

		int sayi = 25;
		if (sayi < 20) {

			System.out.println("sayi 20 den küçüktür");
		}

		else if (sayi == 20) {
			System.out.println("sayi 20 ye esittir");
		}

		else {
			System.out.println("sayi 20 den büyüktür");
		}

		int number1 = 10;
		int number2 = 25;
		int number3 = 200;

		int biggestNumber = number1;

		if (biggestNumber < number2) {
			biggestNumber = number2;
		}

		if (biggestNumber < number3) {
			biggestNumber = number3;
		}

		System.out.println("the biggest number = " + biggestNumber);

		int number4 = 10;
		int number5 = 25;
		int number6 = 200;

		if (number5 > number4 && number5 > number6) {
			System.out.println("the biggest number is number5");
		}

		else if (number4 > number5 && number4 > number6) {
			System.out.println("the biggest number is number4");
		}

		else {
			System.out.println("the biggest number is = " + number6);
		}

		System.out.println("-----------------------");

		// for

		for (int i = 1; i < 10; i += 3) {
			System.out.println(i);
		}

		System.out.println("stop for loop");

		int i = 1;

		System.out.println("-----------------------");

		// while

		while (i < 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("stop while loop");

		System.out.println("-----------------------");

		// do while
		int j = 100;
		do {
			System.out.println(j);
			i++;
		} while (j < 10);
		System.out.println("stop do-while loop");

		System.out.println("-----------------------");

		// Arrays
		String[] students = new String[4];
		students[0] = "Sherlock";
		students[1] = "Holmes";
		students[2] = "Moriarty";
		students[3] = "Watson";

		for (int e = 0; e < students.length; e++) {

			System.out.println(students[e]);
		}

		System.out.println("-----------------------");

		for (String student : students) {
			System.out.println(student);

		}

		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			total = total + number;
			System.out.println(number);
			if (max < number) {
				max = number;
			}
		}

		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max);


	}

}
