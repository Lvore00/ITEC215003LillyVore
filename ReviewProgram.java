/**Class: Intermediate Programming
* Author: Lilly Vore
* Course: ITEC 2150 Fall 2022
* Written: August 11th, 2022
*/
/**
 * class:  add class name here
 * name: add your name
 * date: add the date you complete
 * version: 1.2
 * description: please provide information about this program.
 */
import java.util.Scanner;
public class ReviewProgram{

    public static void main(String[] args){
    ReviewProgram rp = new ReviewProgram();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two numbers:   ");
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      
      int result = rp.add(number1, number2);
      System.out.println("The result of addition two numbers  " + number1 + " and " + number2 + " is " + result);
      
      int resultStatic = rp.add(number1, number2);  //add(number1, number2)
      
      }
      
      
    public int add(int firstNum, int secondNum){
    
      return firstNum + secondNum;
      
      }
      
      
     public static int addStatic(int firstNum, int secondNum)
     {
     
     return firstNum + secondNum;
     
     }
      
      
 }
