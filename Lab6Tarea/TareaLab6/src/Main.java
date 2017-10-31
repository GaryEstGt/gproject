
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedPositionalList<String> lista1=new LinkedPositionalList<String>();
	        Position<String> P0,P1,P2,P3,P4;
	        P0=lista1.addFirst("g");
	        P1=lista1.addAfter(P0,"f");
	        P2=lista1.addAfter(P1,"b");
	        P3=lista1.addAfter(P2,"c");
	        P4=lista1.addAfter(P3,"d");
	        lista1.addAfter(P3,"e");
	        System.out.println(lista1.distance(P0,P4));
	}

}
