package view;

import java.util.Scanner;

import controller.MaquinaController;

public class Main {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		System.out.print(" a1 = ");
		int a1 = (int) le.nextDouble();
		System.out.print(" a2 = ");
		int a2 = (int) le.nextDouble();
		System.out.print(" a3 = ");
		int a3 = (int) le.nextDouble();
		MaquinaController m = new MaquinaController(a1, a2, a3);
		System.out.println(m.minutosMelhorPosicionamento());
	}
	
}
