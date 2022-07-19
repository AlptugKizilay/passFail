import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik, dersSayisi = 5;
        double avarage;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Yaziniz: ");
        Matematik = input.nextInt();
        System.out.print("Fizik Notunuzu Yaziniz: ");
        Fizik = input.nextInt();
        System.out.print("Turkce Notunuzu Yaziniz: ");
        Turkce = input.nextInt();
        System.out.print("Kimya Notunuzu Yaziniz: ");
        Kimya = input.nextInt();
        System.out.print("Muzik Notunuzu Yaziniz: ");
        Muzik = input.nextInt();

        if (Matematik < 0 || Matematik > 100)
            Matematik = 0;
        if (Fizik < 0 || Fizik > 100)
            Fizik = 0;
        if (Kimya < 0 || Kimya > 100)
            Kimya = 0;
        if (Turkce < 0 || Turkce > 100)
            Turkce = 0;
        if (Muzik < 0 || Muzik > 100)
            Muzik = 0;

        avarage = (Matematik + Fizik + Turkce + Kimya + Muzik) / (dersSayisi);
        if (avarage < 55) {
            System.out.println("Sinifta kaldiniz");
        }
        else {
            System.out.println("Sinifi Gectiniz Tebrikler");

        }
        System.out.println("Ortalamaniz : " + avarage);

    }
}