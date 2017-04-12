package homework01;

import java.util.Scanner;

public class TheGreatHello {

	public static void main(String args[]) {

		System.out.println("Please enter a text: ");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		input.close();

		String line01 = text;
		String line02 = text;
		String line03 = text;
		String line04 = text;
		String line05 = text;

		line01 = line01.replace(" ", "     " + " ");
		line02 = line02.replace(" ", "     " + " ");
		line03 = line03.replace(" ", "     " + " ");
		line04 = line04.replace(" ", "     " + " ");
		line05 = line05.replace(" ", "     " + " ");

		line01 = line01.replace("a"," ### " + " ");
		line02 = line02.replace("a","#   #" + " ");
		line03 = line03.replace("a","#####" + " ");
		line04 = line04.replace("a","#   #" + " ");
		line05 = line05.replace("a","#   #" + " ");

		line01 = line01.replace("b","#### " + " ");
		line02 = line02.replace("b","#   #" + " ");
		line03 = line03.replace("b","#####" + " ");
		line04 = line04.replace("b","#   #" + " ");
		line05 = line05.replace("b","#### " + " ");

		line01 = line01.replace("c"," ### " + " ");
		line02 = line02.replace("c","#    " + " ");
		line03 = line03.replace("c","#    " + " ");
		line04 = line04.replace("c","#    " + " ");
		line05 = line05.replace("c"," ### " + " ");

		line01 = line01.replace("d","#### " + " ");
		line02 = line02.replace("d","#   #" + " ");
		line03 = line03.replace("d","#   #" + " ");
		line04 = line04.replace("d","#   #" + " ");
		line05 = line05.replace("d","#### " + " ");

		line01 = line01.replace("e","#####" + " ");
		line02 = line02.replace("e","#    " + " ");
		line03 = line03.replace("e","###  " + " ");
		line04 = line04.replace("e","#    " + " ");
		line05 = line05.replace("e","#####" + " ");

		line01 = line01.replace("f","#####" + " ");
		line02 = line02.replace("f","#    " + " ");
		line03 = line03.replace("f","###  " + " ");
		line04 = line04.replace("f","#    " + " ");
		line05 = line05.replace("f","#    " + " ");

		line01 = line01.replace("g"," ### " + " ");
		line02 = line02.replace("g","#    " + " ");
		line03 = line03.replace("g","#  ##" + " ");
		line04 = line04.replace("g","#   #" + " ");
		line05 = line05.replace("g"," ### " + " ");

		line01 = line01.replace("h","#   #" + " ");
		line02 = line02.replace("h","#   #" + " ");
		line03 = line03.replace("h","#####" + " ");
		line04 = line04.replace("h","#   #" + " ");
		line05 = line05.replace("h","#   #" + " ");

		line01 = line01.replace("i","#####" + " ");
		line02 = line02.replace("i","  #  " + " ");
		line03 = line03.replace("i","  #  " + " ");
		line04 = line04.replace("i","  #  " + " ");
		line05 = line05.replace("i","#####" + " ");

		line01 = line01.replace("j","#####" + " ");
		line02 = line02.replace("j","  #  " + " ");
		line03 = line03.replace("j","  #  " + " ");
		line04 = line04.replace("j","# #  " + " ");
		line05 = line05.replace("j"," #   " + " ");

		line01 = line01.replace("k","#   #" + " ");
		line02 = line02.replace("k","#  # " + " ");
		line03 = line03.replace("k","###  " + " ");
		line04 = line04.replace("k","#  # " + " ");
		line05 = line05.replace("k","#   #" + " ");

		line01 = line01.replace("l","#    " + " ");
		line02 = line02.replace("l","#    " + " ");
		line03 = line03.replace("l","#    " + " ");
		line04 = line04.replace("l","#    " + " ");
		line05 = line05.replace("l","#####" + " ");

		line01 = line01.replace("m","#   #" + " ");
		line02 = line02.replace("m","## ##" + " ");
		line03 = line03.replace("m","# # #" + " ");
		line04 = line04.replace("m","#   #" + " ");
		line05 = line05.replace("m","#   #" + " ");

		line01 = line01.replace("n","#   #" + " ");
		line02 = line02.replace("n","##  #" + " ");
		line03 = line03.replace("n","# # #" + " ");
		line04 = line04.replace("n","#  ##" + " ");
		line05 = line05.replace("n","#   #" + " ");

		line01 = line01.replace("o"," ### " + " ");
		line02 = line02.replace("o","#   #" + " ");
		line03 = line03.replace("o","#   #" + " ");
		line04 = line04.replace("o","#   #" + " ");
		line05 = line05.replace("o"," ### " + " ");

		line01 = line01.replace("p","#### " + " ");
		line02 = line02.replace("p","#   #" + " ");
		line03 = line03.replace("p","#### " + " ");
		line04 = line04.replace("p","#    " + " ");
		line05 = line05.replace("p","#    " + " ");

		line01 = line01.replace("q"," ### " + " ");
		line02 = line02.replace("q","#   #" + " ");
		line03 = line03.replace("q","#   #" + " ");
		line04 = line04.replace("q","#  # " + " ");
		line05 = line05.replace("q"," #  #" + " ");

		line01 = line01.replace("r","#### " + " ");
		line02 = line02.replace("r","#   #" + " ");
		line03 = line03.replace("r","#### " + " ");
		line04 = line04.replace("r","#  # " + " ");
		line05 = line05.replace("r","#   #" + " ");

		line01 = line01.replace("s"," ### " + " ");
		line02 = line02.replace("s","#    " + " ");
		line03 = line03.replace("s"," ### " + " ");
		line04 = line04.replace("s","    #" + " ");
		line05 = line05.replace("s"," ### " + " ");

		line01 = line01.replace("t","#####" + " ");
		line02 = line02.replace("t","  #  " + " ");
		line03 = line03.replace("t","  #  " + " ");
		line04 = line04.replace("t","  #  " + " ");
		line05 = line05.replace("t","  #  " + " ");

		line01 = line01.replace("u","#   #" + " ");
		line02 = line02.replace("u","#   #" + " ");
		line03 = line03.replace("u","#   #" + " ");
		line04 = line04.replace("u","#   #" + " ");
		line05 = line05.replace("u"," ### " + " ");

		line01 = line01.replace("v","#   #" + " ");
		line02 = line02.replace("v","#   #" + " ");
		line03 = line03.replace("v","#   #" + " ");
		line04 = line04.replace("v"," # # " + " ");
		line05 = line05.replace("v","  #  " + " ");

		line01 = line01.replace("w","#  #  #" + " ");
		line02 = line02.replace("w","#  #  #" + " ");
		line03 = line03.replace("w","#  #  #" + " ");
		line04 = line04.replace("w"," ## ## " + " ");
		line05 = line05.replace("w"," #  # " + "  ");

		line01 = line01.replace("x","#   #" + " ");
		line02 = line02.replace("x"," # # " + " ");
		line03 = line03.replace("x","  #  " + " ");
		line04 = line04.replace("x"," # # " + " ");
		line05 = line05.replace("x","#   #" + " ");

		line01 = line01.replace("y","#   #" + " ");
		line02 = line02.replace("y"," # # " + " ");
		line03 = line03.replace("y","  #  " + " ");
		line04 = line04.replace("y","  #  " + " ");
		line05 = line05.replace("y","  #  " + " ");

		line01 = line01.replace("z","#####" + " ");
		line02 = line02.replace("z","   # " + " ");
		line03 = line03.replace("z","  #  " + " ");
		line04 = line04.replace("z"," #   " + " ");
		line05 = line05.replace("z","#####" + " ");

		System.out.println(line01);
		System.out.println(line02);
		System.out.println(line03);
		System.out.println(line04);
		System.out.println(line05);

	}
}
