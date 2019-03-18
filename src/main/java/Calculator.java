public class Calculator {

    public Calculator(){

    }

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber){
        int total = 0;
        if (firstNumber != 0 || secondNumber != 0){
            total = firstNumber / secondNumber;
        }
        return total;
    }


}
