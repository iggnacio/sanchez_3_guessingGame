/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchez_3_strings;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author IgnacioS
 */
public class Sanchez_3_Strings {

    /**
     * @param args the command line arguments
     */
    
static int magicNumber;
static int usersGuess;
static String userName;
static Random randy = new Random();
static Boolean playAgain;
    
    public static void main(String[] args) {
       


playAgain = true;
magicNumber = randy.nextInt(100);
System.out.println("Would you like to play");
Scanner userInputName = new Scanner(System.in);
Scanner sc = new Scanner(System.in);
System.out.println("what is your name ?"); 


int  something = sc.nextInt();
sc.nextLine();
userName = userInputName.nextLine();
System.out.println("welcome"+ userName);

while (playAgain){
playTheGame();

}
}

static void playTheGame(){
Scanner userInputNumber = new Scanner(System.in);
System.out.println ("Please pick a number");
usersGuess = userInputNumber.nextInt();
if (magicNumber == usersGuess){
System.out.println("You Win + userName");
playAgain = false;

if (magicNumber>usersGuess)
{
    System.out.println("Too low , play again");

}
System.out.println("Please pick a numbe between 1- 100");
usersGuess = userInputNumber.nextInt();
if (magicNumber>usersGuess)
    System.out.println("Too low mate, try again");
}else{
    System.out.println("Too high mate, try again");
}
}
}




