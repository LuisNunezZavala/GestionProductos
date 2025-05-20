package vista;

import java.util.ArrayList;

public class ListarProducto {
	public static void listarProducto(ArrayList<Productos> lista) {
		for (Productos productos : lista) {
			System.out.println(productos);
		}
	}

}