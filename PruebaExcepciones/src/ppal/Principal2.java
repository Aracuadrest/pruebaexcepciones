package ppal;

import java.util.ArrayList;

public class Principal2 {
	
	public static ArrayList<Integer> listaNumeros;
	
	public static int getElemento (int pos)  {
		int num=0;
		try {
		num=listaNumeros.get(pos);
		System.out.println("En el método getElemento");
		}catch (IndexOutOfBoundsException e) {
			num=-1;
		}
		return num;
			
	}
	

	public static void main(String[] args) {
		
		listaNumeros = new ArrayList<>();
		listaNumeros.add(3);
		listaNumeros.add(5);
		listaNumeros.add(-2);
		listaNumeros.add(1);
		listaNumeros.add(9);
		listaNumeros.add(-3);
		
		System.out.println("El numero que ocupa la posición 8 es: "+getElemento(8));
		
	}

}
