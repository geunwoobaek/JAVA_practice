public class HomeWork2 {
    public static void main(String[] args) {
        problem1();
        problem2();
        problem3("abcde");
        problem4(12322);
        problem5(5);
    }

    public static void problem1() {
        System.out.println("1번문제");
        int a = 0, b = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 8 == 0)
                a++;
            if (i % 9 == 0)
                b++;
        }
        System.out.println("8의배수:" + a);
        System.out.println("9의배수:" + b);
    }

    public static void problem2() {
        System.out.println("2번문제");
        int a = 0, b = 0;
        for (int i = 2; i < 10; i++) {
            String str = new String();
            for (int j = 1; j <= i; j++) {
                str += (Integer.toString(i) + "X" + Integer.toString(j) + "=" + i * j + "   ");
            }
            System.out.println(str);
        }
    }

    public static void problem3(String a) {
        System.out.println("3번문제");
        for (int i = a.length(); i >= 0; i--) {
            System.out.println(a.substring(0, i));
        }
    }

    public static void problem4(int num) {
        System.out.println("4번문제");
        String a = Integer.toString(num);
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.compareTo(b) == 0) {
            System.out.println(a + "는 회문수입니다.");
        } else {
            System.out.println(a + "는 회문수가 아닙니다.");
        }
    }

    public static void problem5(int num) {
        System.out.println("5번문제");
        System.out.println(f(num));
    }

    public static int f(int num) {
        if (num == 0)
            return 1;
        else {
            return 2 * f(num - 1) + 1;
        }
    }
}
str.length()-1