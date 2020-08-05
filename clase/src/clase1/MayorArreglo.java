package clase1;

public class MayorArreglo {

	public static void main(String[] args) {
		int[] numeros = new int[] {
				10,-4,-6,-7,400,6,9,0,3,300};
		
		int c=numeros[0];
		int posicion = 0;
	
		for(int i=0;i<numeros.length;i++){
			
			if(c<numeros[i]) {
			    c=numeros[i];
			    posicion=i;
			}
			
		}
		 System.out.println(c);	
	     System.out.println(posicion);
	}

}
