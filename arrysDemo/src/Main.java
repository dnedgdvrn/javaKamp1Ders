public class Main {
    public static void main(String[] args) {

        String [] ogrenciler = new String[4];
        ogrenciler[0]="engin";
        ogrenciler[1]="derin";
        ogrenciler[2]="elif";
        ogrenciler[3]="ayşe";
        for (int i=0; i<ogrenciler.length; i++)
        {
            System.out.println (ogrenciler[i]);
        }


        for (String ogrenci : ogrenciler)
        {
            System.out.println(ogrenci);
        }
    }
}