import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Bir Mesaj Giriniz : ");
        String mesaj = scanner.nextLine();
        System.out.println("Mesajınız : " + mesaj);

        System.out.println("--------------------------------------------------------------------- ");

        System.out.println("ÖNEMLİ NOT ! LÜTFEN ADETİ RAKAMLAR İLE YAZINIZ !");
        System.out.print("Mesajınızdan kaç adet yazdırmak istiyorsunuz : ");
        int adet = scanner.nextInt();

        System.out.println("--------------------------------------------------------------------- ");
        System.out.println(mesaj + " Mesajından " + adet + " Adet Yazdırılacak... ");
        System.out.println("--------------------------------------------------------------------- ");

        System.out.print("Mesajlar Yanyana mı Altata mı  ");
        System.out.println("1/Yanyana 2/Alt alta");

        int b = scanner.nextInt();

        System.out.println("--------------------------------------------------------------------- ");

        System.out.print("ONAYLIYOR MUSUNUZ ?  1/Evet 2/Hayır : " );

        int a = scanner.nextInt();

        if (b==1){
            if (a == 1){
                System.out.println("İşlem Başlıyor...");

                while (adet > 0){
                    System.out.print(mesaj);
                    adet--;
                }


            }else if (a != 1) {
                System.out.println("İşlem Reddedildi...");
            }
        } else if (b != 1) {
            if (a == 1){
                System.out.println("İşlem Başlıyor...");

                while (adet > 0){
                    System.out.println(mesaj);
                    adet--;
                }


            }else if (a != 1) {
                System.out.println("İşlem Reddedildi...");
            }

        }
    }
}