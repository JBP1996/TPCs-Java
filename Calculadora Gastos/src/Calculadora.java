import java.util.Scanner;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
		double agua,luz,gas,telecom;
		
		System.out.println("Quanto gasta em média de água por mês?");
		agua = new Scanner(System.in).nextDouble();
		System.out.println("Quanto gasta em média de luz por mês?");
		luz = new Scanner(System.in).nextDouble();
		System.out.println("Quanto gasta em média de gás por mês?");
		gas = new Scanner(System.in).nextDouble();
		System.out.println("Quanto gasta em média de telecom por mês?");
		telecom = new Scanner(System.in).nextDouble();
	}

}
