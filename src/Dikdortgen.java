package Projects.geometri;

import static Projects.geometri.GeometrikSekil.*;

public class Dikdortgen {

    public static void dikdortgenCevreHesaplama() {
        System.out.println("Dikdörtgenin uzun kenarını giriniz = ");
        uzunKenar = scan.nextDouble();
        System.out.println("Dikdörtgenin kısa kenarını giriniz = ");
        kisaKenar = scan.nextDouble();
        System.out.println("Dikdörtgenin çevresi = " + 2 * (kisaKenar + uzunKenar));
        System.out.println("Dikdörtgenin alanı = " + (kisaKenar * uzunKenar));
    }
}
