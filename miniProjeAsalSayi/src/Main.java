public class Main {
    public static void main(String[] args) {
        int number =8;
         int remainder = number % 2 ;
         boolean isPrime = true;
        for (int i =2; i<number; i++)
        {
            if (number % 2 ==0)
            {
                isPrime=false;
            }

        }
        if (isPrime)
        {
            System.out.println("Sayı Asal ");
        }
        else
        {
            System.out.println("Sayı Asal Değil");
        }



    }
}