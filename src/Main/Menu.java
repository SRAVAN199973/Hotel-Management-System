package Main;

public class Menu {
		public static void optionsMenu() 
		{
			System.out.println("\n        WELCOME MR.PRABHAT CHAURASIYA(EMPID REP001)");
			for(int i=0;i<2;i++) {
				if(i==1)
					System.out.println("\t\t                HOTEL OLD TOWN ");
				for(int j=0;j<35;j++)
				System.out.print("=:=");
				System.out.println();
			}
			System.out.println("\t\t1. CHECK AVAILABILITY OF ROOMS");
			System.out.println("\t\t2. CUSTOMER REGISTRATION");
			System.out.println("\t\t3. BOOKING OF ROOMS");
			System.out.println("\t\t4. GRAND TOTAL BILL ");
			System.out.println("\t\t5. SERVICES PROVIDED TO CUSTOMER");
			System.out.println("\t\t6. BOOKING INFORMATION");
			System.out.println("\n\t\t Press \"7\" for exit...\n");
			for(int i=0;i<2;i++) {
				for(int j=0;j<35;j++)
				System.out.print("=:=");
				System.out.println();
			}
			System.out.print("Enter Your Choice: ");
	}

}
