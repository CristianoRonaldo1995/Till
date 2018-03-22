package week2final;

public class displayDetails {
	
	double i;
	double bills = 0;
	double paids = 0;
	double[] money = {50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

	public double details(double bill, double paid) {
		
		bills = bill;
		paids = paid;
		
		paids = (int) (paid - bill);
		/**
		double fifty = i / money[0] ;
		double twenty = i / money[1] ;
		double ten = i / money[2] ;
		**/
		i = paids;
		
			 while( i >= money[0] ) {
				 
				 System.out.println("Fifty");
				
				 i = i - money[0];
				 
			 }
				 while( i >= money[1] && i < money[0]) {
					 System.out.println("Twenty");
					 i = i - money[1];
				 }
					 while( i >= money[2] && i < money[1]) {
						 System.out.println("Ten");
						 i = i - money[2];
					 }
						 while( i >= money[3] && i < money[2]) {
							 System.out.println("Five");
							 i = i - money[3];
						 }
							 while( i >= money[4] && i < money[3]) {
								 System.out.println("Two");
								 i = i - money[4];
							 }
								 while( i >= money[5] && i < money[4]) {
									 System.out.println("One");
									 i = i - money[5];
								 }
									 while( i >= money[6] && i < money[5]) {
										 System.out.println("Fifty Pence");
										 i = i - money[6];
									 }
										 while( i >= money[7] && i < money[6]) {
											 System.out.println("Twenty Pence");
											 i = i - money[7];
										 }
											 while( i >= money[8] && i < money[7]) {
												 System.out.println("Ten Pence");
												 i = i - money[8];
											 }
												 while( i >= money[9] && i < money[8]) {
													 System.out.println("Five Pence");
													 i = i - money[9];
												 }
													 while( i >= money[10] && i < money[9]) {
														 System.out.println("Two Pence");
														 i = i - money[10];
													 }
														 
														 while( i >= money[11] && i < money[12]) {
															 System.out.println("One Pence");
															 i = i - money[11];
														 }


				 
	
			 
						 
		return paid;
	}

}