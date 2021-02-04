/*
Lab 4
Partners: Jay Patel and Chris Sonnhalter
Date: 2/4/21
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The Random Number is : " + randomNum);

    if (randomNum <= 5) 
    {    
    while (randomNum >= 0) 
    {
      System.out.println(randomNum);
      randomNum--;
    }
    System.out.println("Ahoy Mateys!");
    } else if (randomNum > 25 && randomNum < 42)
    { 
      while (randomNum >= 0)
      {
      System.out.println(randomNum);
      randomNum--;
      }
      System.out.println("Cannonball!");
    }else 
    {
    while (randomNum >= 0)
      {
      System.out.println(randomNum);
      randomNum--;
      }
      System.out.println("Blast Off!");
    }
  }
}