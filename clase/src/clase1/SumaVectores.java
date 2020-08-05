package clase1;

public class SumaVectores {

	public static void main(String[] args) {
		int[] V1 = new int[] {
				10,-4,-6,-7,50,6,9,0,3,100};

		int[] V2 = new int[] {
				15,-4,-5,-7,40,6,0,0,3,200};
		int tV1=0, tV2=0;
       for(int i=0;i<V1.length;i++){
			
			 tV1+=V1[i];
			 tV2+=V2[i];
			 
			
			
	}
      if(tV1>tV2) {
		System.out.println("es mayor el vector 1:"+tV1);
      }
      else if (tV2>tV1) {
    	  System.out.println("es mayor el vector 2:"+ tV2);
      }
     }
    }
