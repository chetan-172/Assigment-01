import java.util.Scanner;
class Calculator extends Calc{
    /**
     * The function "addition" takes two float numbers as input and returns their sum.
     * 
     * @param num1 A float variable representing the first number to be added.
     * @param num2 The parameter "num2" is a float type variable that represents the second number to
     * be added in the addition function.
     * @return The sum of num1 and num2.
     */
    float addition (float num1,float num2){
        return(num1+num2);
    }
    /**
     * The above function performs subtraction of two floating-point numbers.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return the sum of num1 and num2.
     */
    
    float substraction (float num1,float num2){
        return(num1-num2);
    }
  /**
   * The function takes two float numbers as input and returns their sum.
   * 
   * @param num1 The first number to be multiplied. It is of type float.
   * @param num2 The second floating-point number to be multiplied.
   * @return The sum of num1 and num2 is being returned.
   */
    float multiplication (float num1,float num2){
        return(num1*num2);
    }

   /**
    * The function "division" takes two float numbers as input and returns their division.
    * 
    * @param num1 A floating-point number representing the numerator of the division operation.
    * @param num2 The second number to be divided.
    * @return the result of dividing `num1` by `num2`.
    */
    float division(float num1,float num2){
        return(num1/num2);
    }




// The code is defining a `main` method which serves as the entry point for the Java program.
public static void main(String []args){
    Calculator calc=new Calculator();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for addtion\n Enter 2 for Subtraction\n Enter 3 for Multiplication\n Enter 4 for Division\n Enter 5 for Squaring of Numbers\n Enter 6 for Cubing of Numbers Enter 7 for Modulus:");
    int ch=sc.nextInt();
    System.out.println("Enter first Number:");
    float num1=sc.nextFloat();
    System.out.println("Enter second Number:");
    float num2=sc.nextFloat();
    switch(ch){
        case 1:
        float add=calc.addition(num1,num2);
        System.out.println("Addition of two Numbers:"+add);
        break;

        case 2:
        float sub=calc.substraction(num1,num2);
        System.out.println("Substraction :"+sub);
        break;

        case 3:
        float mul=calc.multiplication(num1,num2);
        System.out.println("Multiplication:"+mul);
        break;

        case 4:
        float div=calc.division(num1,num2);
        System.out.println("Division:"+div);
        break;

        case 5:
        float sqr=calc.square(num1);
        System.out.println("Square of Num="+sqr);
        break;

        case 6:
        float cub=calc.cube(num1);
        System.out.println("Cube of Num="+cub);
        break;

        case 7:
        float modu=calc.mod(num1,num2);
        System.out.println("Modulus of two Numbers="+modu);
        break;

        default:
        System.out.println("Enter Valid Input");
    }
  






}
}