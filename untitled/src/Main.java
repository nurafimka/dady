import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор умножения, введи число!!!");
        Double One = new Scanner(System.in).nextDouble();
        System.out.println("Молодец, теперь введи второе число!");
        Double Two = new Scanner(System.in).nextDouble();
        System.out.println("НИЧОСИ ПОЛУЧИЛОСЬ:"+ One*Two);
    }
}