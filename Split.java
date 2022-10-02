package String;

public class Split {

    public static String split (String input) {
        String operand1;
        String operand2;
        String operator;
        String rez;
        int n;
        String[] strArr;
        String[] numArr;
        strArr = input.split("\"");
        numArr = input.split("\\s");
        operand1 = strArr[1].replaceAll("\"", "");
        operator = strArr[2].replaceAll("\\s", "");
        operand2 = input.split("\\s")[2].replaceAll("\"", "");

        try {
            n = Integer.parseInt(numArr[0]);
            throw new RuntimeException("Первый операнд должен быть строкой");
        } catch (NumberFormatException e) {

        }

        if (input.split("\\s")[1].equals("*")) {
            int b = Integer.parseInt(numArr[2]);
            try {

                if (b < 0) {
                    throw new RuntimeException("нельзя умножить строку на отрицательное число");
                }else if (b > 10) {
                    throw new RuntimeException("Второй операнд должен быть не больше 10");
                }
                rez = Multiplication.multiplication(operand1, b);
            } catch (NumberFormatException e) {
                throw new RuntimeException("строку можно умножить только на целое число");
            }

        } else if (input.split("\\s")[1].equals("/")) {
            rez = Delenie.delenie(operand1, operand2);

        } else {

            switch (operator) {
                case "+":
                    operand2 = strArr[3];
                    rez = Plus.plus(operand1, operand2);
                    break;
                case "-":
                    operand2 = strArr[3].replaceAll("\"", "");
                    rez = Minus.minus(operand1, operand2);
                    break;

                default:
                    throw new IllegalArgumentException("неизвестный оператор: " + operator);
            }
        }



    return rez;
    }
}
