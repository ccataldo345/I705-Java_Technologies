package homework05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FancyPrint {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("Mati", "Kati", "Aadu");
		// List<String> aNames = new ArrayList<>();

		System.out.print("Names that start with A: ");
		// Stream.of(names) .filter(names -> names.startsWith("A"))
		// .forEach(System.out::println);
		names.forEach(name -> {
			if (name.startsWith("A")) {
				// aNames.add(name);
				System.out.print(name + " ");
			}
		});

		// public static int print (int a) {
		List<Integer> numbers = Arrays.asList(10, 40, 0, 4, -5, -14, 35, 1, 5, 6, 7, 8);
		// List<String> numBigTen = new ArrayList<>();
		System.out.println();
		System.out.print("Values that are greater than ten: ");

		numbers.forEach(number -> {
			if (number > 10) {
				// numBigTen.add(number);
				System.out.print(number + " ");
			}
		});
	}
}
