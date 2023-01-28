import java.util.Scanner;
public class KDVhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fiyat;
        System.out.println("KDVsiz Fiyatı Giriniz: ");
        fiyat = input.nextFloat();
        System.out.print(fiyat <= 1000 ? "KDV'li fiyat: " + ((fiyat * 18/100)+ fiyat) + "\nKDV: %18" : "KDV'li fiyat: " + ((fiyat * 8/100)+ fiyat)+ "\nKDV: %8");





    }
}
