import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double a, area, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire Dilimi Alanı Hesaplayıcı\nYarıçapı Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısını giriniz: ");
        a = input.nextDouble();
        area = (pi*(r*r)*a)/360;
        System.out.println(area);
    }
}