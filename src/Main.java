import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        Scanner sc = new Scanner(System.in);

        int price;

        System.out.println("Введите стоимость билета");
        price = sc.nextInt();//Считываем цену билета

        int miles = service.calculate(price);

        System.out.println("Количество бонусных миль: " + miles);
    }
}