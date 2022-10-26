import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar, kdvORani1 = 0, kdvORani2 = 0, kdvTutar, kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        tutar = scanner.nextDouble();
        if (tutar<1000){
            kdvORani1=0.18;
            System.out.println("kdv oranı : " + kdvORani1);
            kdvTutar = tutar * kdvORani1;
            System.out.println("kdv tutarı : " + kdvTutar);
            kdvliTutar = tutar + kdvTutar;
            System.out.println("kdvli tutar : " + kdvliTutar);
        }else {
            kdvORani2=0.8;
            System.out.println("kdv oranı : " + kdvORani2);
            kdvTutar = tutar * kdvORani2;
            System.out.println("kdv tutarı : " + kdvTutar);
            kdvliTutar = tutar + kdvTutar;
            System.out.println("kdvli tutar : " + kdvliTutar);
        }
    }
}
