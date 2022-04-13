package Projects.geometri;

import java.util.Scanner;

public class runner {
    public static void sekilGeo() {
        System.out.println("Geometri dersine hosgeldiniz. Yapmak istediginizi seçiniz : ");
        System.out.println("1- cember alan ve cevre \n2- kare alan ve cevre" +
                "\n3- dikdortgen alan ve cevre \n4- Çıkış");
        Scanner scanner = new Scanner(System.in);
        int tercih = scanner.nextInt();

        switch (tercih) {

            case 1:
                Cember.cemberAlanHesaplama();
               sekilGeo();
                break;
            case 2:
                Kare.kareAlanHesaplama();
                sekilGeo();
                break;
            case 3:
                Dikdortgen.dikdortgenCevreHesaplama();
                sekilGeo();
                break;
            case 4:
                System.out.println("Teşekkürler");
                break;
            default:
                System.out.println("Hatalı giriş");
                sekilGeo();

        }


    }
}
