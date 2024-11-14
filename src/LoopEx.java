public class LoopEx {
    public LoopEx() {

    }

    public static void main(String[] args) {

        int i = 0;
        while (i <= 10) {
            System.out.println("i의 값: " + i);
            i = i + 1;


        }
        for (int j = 0; j <= 10; j++) {

            System.out.println("j의 값: " + j);

        }

        int k = 10;
        while (k >= 0) {
            System.out.println("k의 값: " + k);
            k = k - 1;

        }
        for (k = 10; k >= 0; k--) {
            System.out.println("i의 값: " + k);
        }
        int f = 3;
        while (f < 34) {
            System.out.println(f + "를 3으로 나눴을 때 나머지: " + f % 3);
            f = f + 1;


        }
        int g = 3;

        for (g = 3; g < 34; g++) {

            System.out.println(g + "를 3으로 나눴을 때 나머지: " + g % 3);

        }

    }
}






