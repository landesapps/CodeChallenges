package challenge1;

import java.util.Scanner;

public class IntegerParsing {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	if (scan.hasNextLine()) {
	    String input = scan.nextLine();
	    
	    System.out.println(parsedInts(input));
	} else {
	    System.out.println("No string was found");
	}
	scan.close();
    }
    
    /**
     * Parse through each character, since we don't want to use the language library
     * 
     * @param input
     * @return int
     */
    public static int parsedInts(String input) {
	int total = 0;
	    for (int iter = 0; iter < input.length(); iter++) {
		switch (input.charAt(iter)) {
			case '1':
			    total += 1;
			    break;
			case '2':
			    total += 2;
			    break;
			case '3':
			    total += 3;
			    break;
			case '4':
			    total += 4;
			    break;
			case '5':
			    total += 5;
			    break;
			case '6':
			    total += 6;
			    break;
			case '7':
			    total += 7;
			    break;
			case '8':
			    total += 8;
			    break;
			case '9':
			    total += 9;
			    break;
		}
	    }

	    return total;
    }

}
