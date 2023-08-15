package us.kvitko.calcapp._main;

import us.kvitko.calcapp.service.ResultWriteService;
import static us.kvitko.calcapp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result = add(num1, num2);
        ResultWriteService.printResult(num1, num2, "addition", result);
        result = subtract(num1, num2);
        ResultWriteService.printResult(num1, num2, "subtraction", result);
        result = multiply(num1, num2);
        ResultWriteService.printResult(num1, num2, "multiplication", result);
    }

}

