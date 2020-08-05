package clase1;

public class main3 {
	public static void main(String[] args) {
          punto pt1=new punto();
          pt1.x=1;
          pt1.y=2;
          
          punto pt2=new punto();
          pt2.x=10;
          pt2.y=5;
          
          
          double distancia = pt1.distancia(pt2);
          System.out.println(distancia);
          
          pt1.x=1;
          pt1.y=2;
          pt2.x=3;
          pt2.y=3;
          punto r=pt1.suma(pt2);
          System.out.println(r.x+","+r.y);
	}       
}
