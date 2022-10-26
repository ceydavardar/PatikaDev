import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int edebiyat, fizik, resim, muzik, kimya, mat;
        Scanner not = new Scanner(System.in);

        System.out.println("Edebiyat notunuzu giriniz : ");
        edebiyat = not.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        fizik = not.nextInt();
        System.out.println("Resim notunuzu giriniz : ");
        resim = not.nextInt();
        System.out.println("Müzik notunuzu giriniz : ");
        muzik = not.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        kimya = not.nextInt();
        System.out.println("Matematik notunuzu giriniz : ");
        mat = not.nextInt();

        int toplam = (edebiyat + fizik + resim + muzik + kimya + mat);
        double ortalama = 1.0 * toplam/6;
        System.out.println("Ortalamanız : " + ortalama);

        int baraj = 60;
        System.out.println(ortalama>baraj ? "Sınıfı geçti." : "Sınıfta kaldı.");


    }
}
