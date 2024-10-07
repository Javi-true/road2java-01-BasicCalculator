public class Calculator {

    //Constructor method.
    public Calculator(){
    }

    //This method adds 2 int numbers.
    public int add(int a, int b){
        return a + b;
    }

    //This method subtracts 2 int numbers.
    public int subtract(int a, int b){
        return a - b;
    }

    //This method multiplies 2 int numbers.
    public int multiply(int a, int b){
        return a * b;
    }

    //This method divides 2 int numbers.
    public int divide(int a, int b){
        return a / b;
    }

    //This method returns the remainder of the division between 2 int numbers.
    public int modulo(int a, int b){
        return a % b;
    }

    //Main method.
    public static void main(String[] args){
        //Create object.
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
    }
}
