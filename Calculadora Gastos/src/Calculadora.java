import java.util.Scanner;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
		double agua,luz,gas,telecom;
		
		System.out.println("Quanto gasta em m�dia de �gua por m�s?");
		agua = new Scanner(System.in).nextDouble();
		System.out.println("Quanto gasta em m�dia de luz por m�s?");
		luz = new Scanner(System.in).nextDouble();
		System.out.println("Quanto gasta em m�dia de g�s por m�s?");
		gas = new Scanner(System.in).nextDouble();
		System.out.println("Quanto gasta em m�dia de telecom por m�s?");
		telecom = new Scanner(System.in).nextDouble();
	}

}
