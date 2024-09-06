// import java.util.Random;
// import java.util.Scanner;

// public class Game {
//     public static void main(String[] args) {
//         Scanner sc2 = new Scanner(System.in);
//         int secret;
//         Random r = new Random();
//         secret = r.nextInt(100) + 1;
//         // System.out.println(secret);
//         System.out.println("::::Guessing The Number Game::::");
//         int i = 0, j = 1, num = -1, check = 1, choice;
//         System.out.print("Which Type Of Game You Wanna Play : \n1. Unlimited Guesses\n2. 10 Guesses\nYour Choice : ");
//         choice = sc2.nextInt();
//         if (choice == 2) {
//             System.out.println("You Have 10 Guesses.");
//             while (j <= 10 && num != secret) {
//                 System.out.println("Guess Number : " + j);
//                 num = sc2.nextInt();
//                 if (num > secret) {
//                     System.out.println("Your Number Is Greater Than The Actual Number");
//                 } else if (num < secret) {
//                     System.out.println("Your Number Is Less Than The Actual Number");
//                 } else {
//                     System.out.println("You Entered Right Number \nYOU WON");
//                 }
//                 if (j == 10) {
//                     System.out.println("10 Guesses Are Finished\nYou Loss");
//                 }
//                 j++;
//             }
//         } else if (choice == 1) {

//             do {
//                 System.out.print("Guess The Number : ");
//                 num = sc2.nextInt();
//                 // sc.close();
//                 if (num > secret) {
//                     System.out.println("Your Number Is Greater Than The Actual Number");
//                 } else if (num < secret) {
//                     System.out.println("Your Number Is Less Than The Actual Number");
//                 } else {
//                     System.out.println("You Entered Right Number \nYOU WON");
//                     check = 10;
//                 }
//                 i++;
//             } while (num != secret);
//         } else {
//             System.out.println("You Entered A Wrong Number\nGame Finished");
//         }
//         if (check == 0) {
//             System.out.println("You Failed \nActual Number Is " + secret);
//         }
//         if (check == 10 || choice == 1) {
//             System.out.println("You Guess The Number In " + i + " Guesses");
//         }
//         sc2.close();
//     }
// }