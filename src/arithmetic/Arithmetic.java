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
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArithmeticBase r= new ArithmeticBase();

        // Input for operator and numbers
        System.out.println("Enter arithmetic operation to Perform: ");
        String inputOperation = sc.next().toUpperCase();
        
        System.out.println("Enter first number:");
        double firstNum = sc.nextDouble();
        System.out.println("Enter second number:");
        double secondNum = sc.nextDouble();
  
        //operation is assigned
        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(inputOperation);

        // Perform calculations and display the result
        double result = r.calculate(operation, firstNum, secondNum);
        System.out.println("result :" + result); 
    
    }
}