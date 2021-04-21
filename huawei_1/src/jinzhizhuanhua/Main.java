package jinzhizhuanhua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner sca = new Scanner(System.in);
            String line = sca.nextLine();

            ArrayList<Character> list = new ArrayList<>();

            int len = line.length() - 2;
            for (int i = 2; i < line.length(); i++) {
                list.add(line.charAt(i));
            }
            double temp = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 'A') {
                    temp = temp + 10 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == 'B') {
                    temp = temp + 11 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == 'C') {
                    temp = temp + 12 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == 'D') {
                    temp = temp + 13 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == 'E') {
                    temp = temp + 14 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == 'F') {
                    temp = temp + 15 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '1') {
                    temp = temp + 1 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '2') {
                    temp = temp + 2 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '3') {
                    temp = temp + 3 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '4') {
                    temp = temp + 4 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '5') {
                    temp = temp + 5 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '6') {
                    temp = temp + 6 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '7') {
                    temp = temp + 7 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '8') {
                    temp = temp + 8 * Math.pow(16, len - 1 - i);
                } else if (list.get(i) == '9') {
                    temp = temp + 9 * Math.pow(16, len - 1 - i);
                } else {
                    System.out.println("输入字符不合法！");
                }
            }
            System.out.println(temp);
        }
    }
}
