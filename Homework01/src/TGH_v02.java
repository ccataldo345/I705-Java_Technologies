package homework01;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TGH_v02 {
	public static void main(String args[]) {

		System.out.println("Please enter a text: ");
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		input.close();
		System.out.println();
		printBig(text);
	}

	public static void printBig(String text){	
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < text.length(); j++) {
				char c = text.charAt(j);     // split text into characters
				if (Character.isAlphabetic(c) || c == ' '){  //check if c is a letter or an empty space
				String[] big = alphabet.get(c);
				count ++;
				System.out.print(big[i]);
				//System.out.println(Arrays.toString(big));  //print letters in one line
				//Arrays.stream(alphabet.get(c)).forEach(System.out::print);   //print vertically
				}
				else {
					c = 'A';  //any character not included in map will no be considered			
					}
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println("total characters: " + count/5);
	}

	private static Map<Character, String[]> alphabet = new HashMap<>();

	static {

		alphabet.put(' ', new String[]{
				"   ",
				"   ",
				"   ",
				"   ",
				"   "
		});

		alphabet.put('a', new String[]{
				" ###  ",
				"#   # ",
				"##### ",
				"#   # ",
				"#   # "
		});

		alphabet.put('b', new String[]{
				"####  ",
				"#   # ",
				"####  ",
				"#   # ",
				"####  ",
		});

		alphabet.put('c', new String[]{
				" #### ",
				"#     ",
				"#     ",
				"#     ",
				" #### ",
		});

		alphabet.put('d', new String[]{
				"####  ",
				"#   # ",
				"#   # ",
				"#   # ",
				"####  ",
		});

		alphabet.put('e', new String[]{
				"##### ",
				"#     ",
				"###   ",
				"#     ",
				"##### ",
		});

		alphabet.put('f', new String[]{
				"##### ",
				"#     ",
				"###   ",
				"#     ",
				"#     ",
		});

		alphabet.put('g', new String[]{
				" ###  ",
				"#     ",
				"#  ## ",
				"#   # ",
				" ###  ",
		});

		alphabet.put('h', new String[]{
				"#   # ",
				"#   # ",
				"##### ",
				"#   # ",
				"#   # ",
		});

		alphabet.put('i', new String[]{
				"##### ",
				"  #   ",
				"  #   ",
				"  #   ",
				"##### ",
		});

		alphabet.put('j', new String[]{
				"##### ",
				"   #  ",
				"   #  ",
				"#  #  ",
				" ##   ",
		});

		alphabet.put('k', new String[]{
				"#   # ",
				"#  #  ",
				"###   ",
				"#  #  ",
				"#   # ",
		});

		alphabet.put('l', new String[]{
				"#     ",
				"#     ",
				"#     ",
				"#     ",
				"##### ",
		});

		alphabet.put('m', new String[]{
				"#   # ",
				"## ## ",
				"# # # ",
				"#   # ",
				"#   # ",
		});

		alphabet.put('n', new String[]{
				"#   # ",
				"##  # ",
				"# # # ",
				"#  ## ",
				"#   # ",
		});

		alphabet.put('o', new String[]{
				" ###  ",
				"#   # ",
				"#   # ",
				"#   # ",
				" ###  ",
		});

		alphabet.put('p', new String[]{
				"####  ",
				"#   # ",
				"####  ",
				"#     ",
				"#     ",
		});

		alphabet.put('q', new String[]{
				" ###  ",
				"#   # ",
				"#   # ",
				"#  #  ",
				" #  # ",
		});

		alphabet.put('r', new String[]{
				"####  ",
				"#   # ",
				"####  ",
				"#  #  ",
				"#   # ",
		});

		alphabet.put('s', new String[]{
				" #### ",
				"#     ",
				"  #   ",
				"    # ",
				"####  ",
		});

		alphabet.put('t', new String[]{
				"##### ",
				"  #   ",
				"  #   ",
				"  #   ",
				"  #   ",
		});

		alphabet.put('u', new String[]{
				"#   # ",
				"#   # ",
				"#   # ",
				"#   # ",
				" ###  ",
		});

		alphabet.put('v', new String[]{
				"#   # ",
				"#   # ",
				"#   # ",
				" # #  ",
				"  #   ",
		});

		alphabet.put('w', new String[]{
				"#  #  # ",
				"#  #  # ",
				"#  #  # ",
				" # # #  ",
				" #  #   ",
		});

		alphabet.put('x', new String[]{
				"#   # ",
				" # #  ",
				"  #   ",
				" # #  ",
				"#   # ",
		});

		alphabet.put('y', new String[]{
				"#   # ",
				" # #  ",
				"  #   ",
				"  #   ",
				"  #   ",
		});

		alphabet.put('z', new String[]{
				"##### ",
				"   #  ",
				"  #   ",
				" #    ",
				"##### ",
		});
	} 	
}
