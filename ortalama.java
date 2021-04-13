package ertugileyaz;
import java.util.Scanner;
public class ortalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner ortalama = new Scanner(System.in);
  int notT,notM,notF,notI;
  double notortalama;
  System.out.println("Türkçe dersi notunuzu giriniz.");
  notT = ortalama.nextInt();
  System.out.println("Matematik desri notunuzu giriniz.");
  notM = ortalama.nextInt();
  System.out.println("Fen dersi notunuzu giriniz.");
  notF = ortalama.nextInt();
  System.out.println("Ýngilizce dersi notunuzu giriniz.");
  notI = ortalama.nextInt();
  notortalama = (notT + notM + notF + notI) /4;
 System.out.println("Not Ortalamanýz:"+ notortalama);
 String durum = (notortalama>=45) ? "gectiniz" : "kaldiniz";
  System.out.println(durum);
	}

}
