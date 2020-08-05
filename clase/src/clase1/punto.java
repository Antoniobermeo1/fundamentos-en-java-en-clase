package clase1;

public class punto {
	
		public double x;
		public double y;
		
		public double distancia(punto Punto) {
			double distancia=Math.sqrt(Math.pow((x-Punto.x),2)+Math.pow((y-Punto.y),2));
	        return distancia;
		}
		public punto suma(punto Punto) {
			punto result = new punto();
			result.x=x+Punto.x;
			result.y=y+Punto.y;
			return result;
		
	
	
	
	
	}
}
