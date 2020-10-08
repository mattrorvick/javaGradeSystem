// PART ONE

/**
 * gradeSystem
 */

/*
import java.util.Scanner;

public class gradeSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is the score?");
        
        int score = Integer.parseInt(input.nextLine());

        if(score >= 90) {
            System.out.println("Congratulations you got an A!");
        } else if (score >= 80) {
            System.out.println("That's a B!");
        } else if (score >= 70) {
            System.out.println("C work.");
        } else if (score >= 60) {
            System.out.println("D-isappointing.");
        } else {
            System.out.println("Bro...you fail.");
        }
            
    }
} */

// PART TWO
/*
import java.util.Scanner;

public class gradeSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is the score?");
        
        // int score = Integer.parseInt(input.nextLine());

        String percent = input.nextLine();

        // grade = grade.toUpperCase();
		switch (percent) {
		case "90": case "91": case "92": case "93": case "94": case "95": case "96": case "97": case "98": case "99": case "100":
			System.out.println("Congratulations! You're pretty smart!");
			break;
        case "80": case "81": case "82": case "83": case "84": case "85": case "86": case "87": case "88": case "89":
			System.out.println("Is that the Best you got?");
			break;
        case "70": case "71": case "72": case "73": case "74": case "75": case "76": case "77": case "78": case "79":
			System.out.println("C work.");
			break;
        case "60": case "61": case "62": case "63": case "64": case "65": case "66": case "67": case "68": case "69":
			System.out.println("Disappointing");
			break;
		default:
            System.out.println("You're fired!");
            
		}

    }
}
*/

// I think programmers prefer switch over if/else because it might seem easier?
// Clearly I chose the switch statements as the more work-intensive part.

// PART THREE

import java.util.Scanner;

/**
 * gradeSystem
 */
public class gradeSystem {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want for dinner?");

        String dinner = input.nextLine();

        System.out.printf("We don't have %s.\n", dinner);

        System.out.println("Pick between 1 for breakfast, 2 for lunch or 3 for dinner.");

        int number = Integer.parseInt(input.nextLine()); 

        if(number == 1) {
            System.out.println("Okay enjoy some eggs and toast!");
        } else if(number == 2) {
            System.out.println("Okay, here's a sammich!");
        } else {
            System.out.println("Here's a nice steak dinner!");
        }
        
        
    }
}