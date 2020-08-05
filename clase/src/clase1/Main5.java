package clase1;

public class Main5 {
	void sumarContadorMain() {
		CuentaCorriente.contador +=100;
	}
	static void sumarContadorMain1() {
		CuentaCorriente.contador +=100;
	}


	public static void main(String[] args) {
		Main5 main= new Main5();
		main.sumarContadorMain();
		
		Main5.sumarContadorMain1();
		sumarContadorMain1();
		
		
		CuentaCorriente.sumarContador();
	    CuentaCorriente cta=new CuentaCorriente();
	    System.out.println(CuentaCorriente.contador);
        cta.saldo=100;
        CuentaCorriente cta1=new CuentaCorriente();
        cta1.saldo=100;
	}

}
