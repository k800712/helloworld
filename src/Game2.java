import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int randomInt = random.nextInt(3);
            System.out.println("randomInt = " + randomInt);
            //-----
            //목적 : 저 랜덤한 정수를 "가위" / "바위" / "보" 로 바꾸자
            // 0 : 가위 , 1: 바위,  2: 보
            //------
            String computer;
            if (randomInt == 0) {
                computer = "가위";

            } else if (randomInt == 1) {
                computer = "바위";

            } else {
                computer = "보";
            }
            System.out.println("computer = " + computer);

            Scanner scanner = new Scanner(System.in);
            System.out.println("가위/바위/보 중의 하나를 입력해주세요: ");
            String player = scanner.nextLine();
            System.out.println("player = " + player);
            // 가정 : 입력이 알아서 들어왔음을 확인
            // 목적 : 비교
            // 무승부 구현
            if (computer.equals(player)) {
                System.out.println("비겼습니다.");
            }
            //승리 구현
            else if ((player.equals("가위") && computer.equals("보")) ||
                    (player.equals("바위") && computer.equals("가위")) ||
                    (player.equals("보") && computer.equals("바위"))) {
                System.out.println("승리");

            } else {
                System.out.println("패배");

            }
        }


    }
    }

