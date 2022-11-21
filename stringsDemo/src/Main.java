import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel!";
        System.out.println(mesaj);

        System.out.println("eleman sayasısı =" +""+ mesaj.length());
        System.out.println("eleman sayasısı =" +""+ mesaj.charAt(4));
        System.out.println("eleman sayasısı =" +""+ mesaj.concat("DÖNE"));
        System.out.println("eleman sayasısı =" +""+ mesaj.startsWith("A"));
        System.out.println("eleman sayasısı =" +""+ mesaj.endsWith("b"));
        System.out.println("eleman sayasısı =" +""+ mesaj.lastIndexOf("a"));
        System.out.println("eleman sayasısı =" +""+ mesaj.indexOf("a"));
        String  yeniMesaj = mesaj.replace(" ","-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        for (String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }

    }
}