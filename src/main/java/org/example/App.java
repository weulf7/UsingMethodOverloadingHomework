package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculator calculator = new Calculator();

//        calculator.returnSum(10,20);
//
//        calculator.returnMultiple(20,100);
//
//        calculator.returnDivide(145,5);
//
//        calculator.moduloNumber(129,3);

        calculator.returnSum(65.98,89.76);
        calculator.returnMultiple(65.67,23.78);
        calculator.returnDivide(54.2,4.2);
        calculator.moduloNumber(32.65,3.5);
    }
}
