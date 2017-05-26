package homework05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FancyPrint {

	public static void main(String args[]) {

		print("Names that start with A", e -> e.startsWith("A"), "Mati", "Kati", "Aadu");

		print("Values that are greater than ten", e -> e > 10, 40, 0, 4, -5, -14, 35, 1, 5, 6, 7, 8);
	}

	public static <T> void print(String A, Predicate<T> B, T... param) {

		System.out.print(A + ": ");

		for (T t : param) {
			if (B.test(t)) {
				System.out.print(t + " ");
			}
		}
		// System.out.print(".");
		System.out.println();
	}
}
