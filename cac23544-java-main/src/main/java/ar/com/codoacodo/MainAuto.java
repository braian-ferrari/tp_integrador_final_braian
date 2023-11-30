package ar.com.codoacodo;

public class MainAuto {
	
	public static void main(String[] args) {

		//instanciar un objeto de la clase Auto
		Auto clio = new Auto("renault",
				"clio",
				"azul",
				2020,
				"abc123",
				2f);
		
		clio.encender();
		//clio.encender();
		
		clio.acelerar();
		clio.acelerar();
		clio.acelerar();
		
		//clio.frenar();
		//clio.frenar();
	}

}
