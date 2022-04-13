package Projects.geometri;

import static Projects.geometri.GeometrikSekil.*;

public class Cember{

    public static void cemberAlanHesaplama(){
        System.out.print("Yaricapi giriniz = ");
        yariCap=scan.nextDouble();
        System.out.println("Çemberin çevresi = "+2 * pi * yariCap);
        System.out.println("Çemberin alanı = "+pi * yariCap * yariCap);
    }
}
