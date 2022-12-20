import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Math.abs(sc.nextInt());
        String numberInStringFormat = String.valueOf(number);
        char max ='0';
        int i = 0;
        while (i<numberInStringFormat.length()) {
            if (max<numberInStringFormat.charAt(i)){
                max = numberInStringFormat.charAt(i);
            }
            i++;
        }
        System.out.println(max);
    }
}
