package patternComportement.chainOfResponsabilities;

import java.util.Scanner;

public class RunCOR {
	private DispenseChain c1;

	public RunCOR() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		boolean quit = false;
		RunCOR atmDispenser = new RunCOR();
		while (!quit) {
			int amount = 0;
			System.out.println("\nEnter amount to dispense ('0' to quit): ");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			
			if (amount == 0) {
				quit = true;
			} 
			else if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
			} 
			else {
				atmDispenser.c1.dispense(new Currency(amount));
			}
		}
		System.out.println("\nEnd program.");
	}
}
