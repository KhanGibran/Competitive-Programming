package inheritence;

/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 */

public class Main {

   public static void main(String[] args) {
      Car wagonR = new WagonR(24);
      wagonR.print("WagonR");

      Car hondaCity = new HondaCity(20);
      hondaCity.print("HondaCity");

      InnovaCrysta innovaCrysta = new InnovaCrysta(25);
      innovaCrysta.print("InnovaCrysta");
   }
}