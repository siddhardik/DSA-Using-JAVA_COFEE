
public class Polynomial {
	public int degree[] = new int[200];

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
  		this.degree[degree] = coeff;
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for (int i = 0; i < 200; i++) {
			if (degree[i] != 0)
				System.out.print(degree[i] + "x" + (i) + " ");
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		for (int i = 0; i < 200; i++) {
			this.degree[i] = this.degree[i] + p.degree[i];
		}
		return this;

		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
			
			for (int i = 0; i < 200; i++) {
			this.degree[i] = this.degree[i] - p.degree[i];
		}
		return this;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int x[] = new int[200];
		for (int i = 0; i < 200; i++) {
			for (int j = 0; j < 200; j++) {
				int deg = (i) + (j);
				if (deg < 200) {
					x[deg] += this.degree[i] * p.degree[j];
				}
			}
		}
		for (int i = 0; i < 200; i++)
			this.degree[i] = x[i];
		return this;
		
	}

}
