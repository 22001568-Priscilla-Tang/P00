
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 22001568, May 29, 2023 9:38:54 AM
 */

public class Calculator {
       public int add (int a, int b) {
    	   return a + b;
       }
       public int subtract (int a, int b) {
    	   return a - b;
       }
       public int multiply (int a, int b) {
    	   return a * b;
       }
       public int divide (int a, int b) {
    	   if (b == 0) {
    		   throw new IllegalArgumentException("The world is ending");
    		   }
    	   return a / b;
    	   }
       }

