import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
        System.out.print("Hello, World!");

        int mat,fizik,kimya, turkce ,tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunu Girin");
        mat= inp.nextInt();
        System.out.println("Fizik Notu Girin");
        fizik=inp.nextInt();
        System.out.println("Kimya Notunu Giriniz");
        kimya=inp.nextInt();
        System.out.println("Turkce Notunu Giriniz");
        turkce=inp.nextInt();
        System.out.println("Turkce Notunu Giriniz");
        fizik=inp.nextInt();
        System.out.println("Tarih Notunu Girin");
        tarih=inp.nextInt();
        System.out.println("Muzik Notunu Giriniz");
        muzik=inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        float ortalamaF = (toplam/6);
        System.out.println(ortalamaF);
    }
}
