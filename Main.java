import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String binaryValues = toBinary(message);
        int[] decimalValues = toDecimal(binaryValues);
        System.out.println(toLeet(decimalValues));

    }
    public static String toBinary(String message){
        int length = message.length() - 1;
        StringBuilder binary = new StringBuilder();
        int index = 0;
        while (index < length){
            String subString = message.substring(index);

            if (subString.startsWith("ONE")){
                binary.append("1");
                index += 2;

            } else if (subString.startsWith("ZERO")) {
                binary.append("0");
                index += 3;

            }else {
                index += 1;
            }
        }
        return binary.toString();
    }

    public static int[] toDecimal(String binary) {
        int allocatedArea = (int) Math.ceil((double) binary.length() / 8);
        int[] powers = {128, 64, 32, 16, 8, 4, 2, 1};
        int[] decimalValues = new int[allocatedArea];
        int counter = 0;

        for (int i = 0; i < binary.length(); i += 8) {
            String subString = binary.substring(i, i + 8);
            int sum = 0;
            for (int j = 0; j < subString.length(); j++) {

                if (subString.charAt(j) == '1') {
                    sum += powers[j];
                }

            }
            decimalValues[counter] = sum;
            counter++;
        }
        return decimalValues;
    }
    public static String toLeet(int[] decimalValues){
        StringBuilder result = new StringBuilder();
        for (int decimalValue : decimalValues) {
            String currentChar = "" + (char) decimalValue;

            switch (currentChar) {
                case "4":
                    currentChar = "A";
                    break;
                case "8":
                    currentChar = "B";
                    break;
                case "3":
                    currentChar = "E";
                    break;
                case "6":
                    currentChar = "G";
                    break;
                case "1":
                    currentChar = "I";
                    break;
                case "0":
                    currentChar = "O";
                    break;
                case "2":
                    currentChar = "Z";
                    break;
                default:
                    break;
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}