package controller;

public class Controller {
	public double somaSequencia(int n) {
		double n1=n;
		//finaliza quando n recebido � 0
		if(n<=0) {
			return 0;
		}else {
			//compara o valor anterior e soma com a posi��o atual da sequencia
			return somaSequencia(n-1)+(1/n1);
		}
	}
}
