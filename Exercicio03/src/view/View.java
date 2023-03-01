package view;
import controller.Controller;
public class View {

	public static void main(String[] args) {
		Controller c = new Controller();
		int n = 5;
		double resultado = c.somaSequencia(n);
		System.out.println(resultado);
	}

}
