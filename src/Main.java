public class Main {
    public static void main(String[] args) {
        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1&b1); // 0

        int a2 = 4; //100
        int b2 = 5; //101
        System.out.println(a2 & b2); //  4
        System.out.println();

        int a3 = 2; // 010
        int b3 = 5; // 101
        System.out.println(a3|b3); // результат 7 - 111
        int a4 = 4; // 100
        int b4 = 5; // 101
        System.out.println(a4 | b4); // результат 5 - 101
        System.out.println();

        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме 101101
        int key = 102; //Ключ шифрования - в двоичной системе 1100110
        int encrypt = number ^ key; //Результатом будет число 1001011 или 75
        System.out.println("Зашифрованное число: " +encrypt); // 75

        int decrypt = encrypt ^ key; // Результатом будет исходное число 45
        System.out.println("Расшифрованное число: " + decrypt); // 45
        System.out.println();

        byte a = 12;                 // 0000 1100
        System.out.println(~a);     //  1111 0011   или -13

        int a5 = 2;
        int b5 = 5;
        int result = b5 * 3 + 20 / 2 * a5--;
        System.out.println(result + "\n"); // 35

        int num1 = 4;
        int num2 = 5;
        int num3 = 15;
        int num4 = 10;
        int num5 = 5;
        int result6 = 12;
        System.out.println(result6 += num1 * num2 + num3 % num4 / num5); // 33
        System.out.println();

        int x = 8;
        int y = 9;
        int z = x++ + ++y;
        System.out.println(z); // 18
        System.out.println();

        double x2 = 8.8;
        double y2 = 1.5;
        double z2 = x2 - y2;
        System.out.println(z2); // 7.300000000000001
    }
}