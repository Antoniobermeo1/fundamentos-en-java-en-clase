package clase1;

public class Numeromayor {

	public static void main(String[] args) {
	     int n1= 10;
	     int n2= 1;
	     int n3= 9;
	     
	     String mensaje="";
	     
		if(n1>n2 && n1>n3) {
	    	 System.out.println(n1+"es el mayor");
	     }
	     else if (n2>n1 && n2>n3) {
	    	 System.out.println(n2+"es el mayor");
	     }
	     else {
	    	 mensaje=n3+"es el mayor";
	     }
		System.out.println(mensaje);
		System.out.println();

	}

}
