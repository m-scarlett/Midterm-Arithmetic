/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * @modifier Madison Scarlett 991840867
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        double x = 100;
        double y = 25;
       
        System.out.println("PLUS: " + r.calculate(x, y, ArithmeticBase.Operation.PLUS));
        System.out.println("MINUS: " + r.calculate(x, y, ArithmeticBase.Operation.MINUS));
        System.out.println("TIMES: " + r.calculate(x, y, ArithmeticBase.Operation.TIMES));
        System.out.println("DIVIDE: " + r.calculate(x, y, ArithmeticBase.Operation.DIVIDE));
    
    }
}

