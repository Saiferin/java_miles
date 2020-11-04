import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость авиабилета:");
        int ticketCost = sc.nextInt();
        sc.close();
        int miles = ticketCost/20;
        System.out.println("Получено милей:" + miles);


    }
}
