package clase1;

public class positivoynegativo {

	public static void main(String[] args) {
		int[] numeros = new int[] {
			1,-4,-6,-7,4,6,9,0,3,300};
		
		System.out.println(numeros.length);
	int cero=0;
	int mas=0;
	int menos=0;
	int sumaPositivos=0, sumaNegativos=0;
		
	for(int i = 0;i<numeros.length;i++) {
		if(numeros[i]==0) {
		 cero++;
		}else if(numeros[i]>0){
			mas++;
			sumaPositivos += numeros[i];
			
		}else {
			menos++;
			sumaNegativos=0;
		}
		
		
		
	}
	System.out.println("hay"+ cero +"0");
	System.out.println("hay" + mas +"numeros positivos");
	System.out.println("hay"+menos+"numeros negativos");
	System.out.println("la suma de los numeros positivos son:"+sumaPositivos);
	System.out.println("la suma de los numeros negativos son:"+sumaNegativos);

	}

}
