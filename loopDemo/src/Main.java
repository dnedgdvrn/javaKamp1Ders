public class Main {
    public static void main(String[] args) {
//for
       for (int i =1; i<10; i+=2)
       {
           System.out.println(i);
       }
       System.out.println("döngü bitti");
// while
       int j =1;
       while (j<10)
       {
           System.out.println(j);
           j++;
       }
       System.out.println("while döngüsü bitti");
//do-while
        int a=100;
        do{
            System.out.println(a);
            j+=2;
        } while (a<10);
        System.out.println("do - while döngüsü bitti");

    }
}