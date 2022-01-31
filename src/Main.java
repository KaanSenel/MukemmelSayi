import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int total=0;
        System.out.print("Sayı giriniz : ");
        int sayi=scanner.nextInt();
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                total+=i;
            }

        }
        if (total==sayi)
            System.out.println(sayi+" Mükemmel sayıdır.");
        else
            System.out.println(sayi+" Mükemmel sayı değildir.");
    }
}
