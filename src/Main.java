import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int number = 20;

        System.out.println(number + 5);

        String name = ("이름 : 박효신");
        String county = ("국적 : 대한민국");
        int height = 178;
        int weight = 65;
        int birth = 800712;
        String army = ("예");

        System.out.println(name);
        System.out.println(county);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);
        System.out.println("생년월일: " + birth);
        System.out.println("군필 : " + army);


        String title = ("제목 : 범죄의 도시 1");
        String date = ("개봉일: 2017.10.03.");

        double rating1 = 9.78;
        int atten = 6680000;
        String rating2 = ("예");

        System.out.println(title);
        System.out.println(date);
        System.out.println("평점: " + rating1);
        System.out.println("관객수: " + atten);
        System.out.println("청소년관람불가: " + rating2);


        int year = 5400;
        int month = (year / 12);

        System.out.println("월급 = " + month + "만원");


        int i = 1;
        i = (i + 1);
        i = (i + 1);
        i = (i + 1);
        i = (i + 1);

        System.out.println(i);

        int price = 1000;
        int price2 = 3;

        System.out.println(price * price2);

        int age = 20;
        age = (age + 1);

        System.out.println(age);

        int count = 5;

        count = (count - 1);
        System.out.println("count: " + count);
        count = (count - 1);
        System.out.println("count: " + count);
        count = (count - 1);
        System.out.println("count: " + count);
        count = (count - 1);
        System.out.println("count: " + count);
        count = (count - 1);

        System.out.println("count: " + count);
        System.out.println();

        int n = 20;
        n = -n ;

        System.out.println("n= " + n);
        System.out.println();



        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        int temp = a;
        a = b;
        b = c;
        c = temp;


        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println();

        int d = 100;
        int e = 0;

        int f = d;
        d = e;
        e = f;

        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println();




    }
}