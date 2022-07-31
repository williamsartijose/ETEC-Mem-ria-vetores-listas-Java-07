package Problemas;

public class LacoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"William", "Leandro", "Tomres"};
		
		for ( int i=0; i < vect.length; i++){
			System.out.println(vect[i]);
			
		}
		
		System.out.println("==========Exemplo com laço For Each ===========");
        
		for ( String obj : vect ) {
			System.out.println(obj);
		}
	}

}
