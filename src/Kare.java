package Projects.geometri;

import static Projects.geometri.GeometrikSekil.kenar;
import static Projects.geometri.GeometrikSekil.scan;

public class Kare {

    public static void kareAlanHesaplama() {

        System.out.println("Karenin kenar uzunluğunu giriniz");
        kenar=scan.nextDouble();
        System.out.println("Karenin alanı = "+kenar*kenar);
        System.out.println("Karenin çevresi = "+(4*kenar));
    }
}

