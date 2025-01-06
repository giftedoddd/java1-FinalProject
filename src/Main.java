import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String binaryValues = toBinary(message);
        int[] decimalValues = toDecimal(binaryValues);

        for (int i = 0;i < decimalValues.length;i++){
            System.out.print((char) decimalValues[i]);
        }
    }
    public static String toBinary(String message){
        message = message.replaceAll("[a-z\\s\\W0-9]", "");
        message = message.replaceAll("ZERO", "0");
        message = message.replaceAll("ONE", "1");
        return message;
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
}




















