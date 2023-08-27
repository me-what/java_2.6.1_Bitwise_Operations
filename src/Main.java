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
    }
}