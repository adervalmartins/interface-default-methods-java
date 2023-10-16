package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantia R$  ");
		double amount = sc.nextDouble();
		System.out.println("Meses: ");
		int months = sc.nextInt();
		
		InterestService  is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Pagamento depois de " + months+ "Meses");
		System.out.println(String.format("R$ %.2f ", payment));
		sc.close();
	}

}
