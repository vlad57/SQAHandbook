/*
* Class name: SumString
* Description: Convert and add two numbers as a string and return an int.
* Version: 1.0
* Author: Vladislav VOROBYEV
 */

package handbook.examples;

class SumString {
    private static int total = 0;
    private String firstNumber;
    private String secondNumber;

    SumString(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    int addition() {
        int convertedFirstNumber;           // Describe this variable...
        int convertedSecondNumber;

        if (!checkParams()) {
            /* Describe what happen in this if ... */

            return 0;
        }
        convertedFirstNumber = Integer.parseInt(this.firstNumber);
        convertedSecondNumber = Integer.parseInt(this.secondNumber);
        total = convertedFirstNumber + convertedSecondNumber;
        return total;
    }

    /**
     * This method checks parameters...
     */
    private boolean checkParams() {
        return !this.firstNumber.equals("") && !this.secondNumber.equals("") && total == 0;
    }
}
