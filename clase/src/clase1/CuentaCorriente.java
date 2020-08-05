package clase1;

public class CuentaCorriente {
	
	public static int contador;



	
	
	public double saldo;
	public double getSaldo(){
		return saldo;
	}
	public void retirar(double dinero) {
		saldo-=dinero;
	}
    public void deposito(double dinero) {
	saldo+=dinero;
     }
	public static void sumarContador() {
		// TODO Auto-generated method stub
		
	}

}
