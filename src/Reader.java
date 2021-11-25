import java.util.Scanner;

public class Reader {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        String age = scanner.nextLine();

        System.out.println("Ваш возраст"+ age);
    }


}
