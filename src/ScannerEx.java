import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int input = scanner.nextInt();  // 사용자에게 숫자를 입력받아 정수로 변환하여 input에 기억

        while (input < 0) {
            System.out.print("나이를 입력하세요: ");
            input = scanner.nextInt();

        }

        int age = input;
        System.out.println("입력받은 age: " + age);


        if (age < 19) {
            System.out.println("미성년자");
        }

        int i = 0;
        int sum = 0;

        for (i = 0; i <= 100; i++) {

            sum = sum + i;
            System.out.println("sum = " +  sum);

        }

    }
}
