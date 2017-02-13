package problem4;


public class Problem4modified {


	public boolean isCreditIncreasable (double invoice, double credit, double balance, double interest) {
		
		boolean a=false;
		if (invoice>1000.00)
			if (credit >=5000.00)
				if (balance<=2000.00)
					if (interest < 0.18)
						a=true;
		return a;
	}
}


