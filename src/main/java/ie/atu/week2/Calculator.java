package ie.atu.week2;

public class Calculator {
    public Calculator() {
    }

    public int power(int base, int exponent) {
        int result = 1;       // Step 1: start with 1
        for (int i = 1; i <= exponent; i++) {
            // Step 2: repeat exponent times
            result *= base;     //multiply result by base each time
        }
        return result;      // Step 3: give back the result
    }
}
