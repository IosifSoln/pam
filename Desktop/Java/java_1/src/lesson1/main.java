package lesson1;

public class main<year> {


    public static void main(String[] args) {
//      printHelloworld();
//     firstHomework();
//        Homework1_4();


//    Homework1_5();
// Homework1_6();
//        Homework1_7();
//       Homework1_8();
    }

    static void Homework1_8() {
    }

    static void Homework1_7() {
    }

    static void Homework1_6() {
    }

    static void Homework1_5() {
    }

    static void Homework1_4() {

    }


    private static void homework() {
    }

    public static void printHelloworld() {
        System.out.println("Hello,world");

    }

    public static void firstHomework() {
        int A = 3;
        short B = 13;
        long C = 63_000_000_000_000L;
        float H = 0.33f;
        double E = 443.33;
        boolean F = true;
        char G = 's';
        byte D = 1;
        long result = A * (B + (C / D));
        System.out.println(result);
    }

    static boolean Homework1_4(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            return true;
        else return false;
    }

    static void Homework1_5(int a) {

        if (a >= 0) System.out.println("число" + a + "положительное");
        else System.out.println("число" + a + "отрицательно");
    }

    static boolean Homework1_6(int a, Object name) {
        if (a < 0)
            return true;
        else return false;
    }

    static void Homework1_7(String name)


        {


            System.out.println("привет," + name + "!");

        }
    static void Homework1_8 (int year) {{

            if (!(year % 4 == 0) ||
            ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + "год не високосный");
            else System.out.println(year + "год високосный");
        }
    }
}
