import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import vista.Productos;

class Pruebas {

	ArrayList<Productos> lista = new ArrayList<Productos>();
	@Test
	void IngresarProducto() {
		
		lista.add(vista.IngresarProducto.ingresarProducto("papa", 3.2, 2));
		assertEquals(lista.isEmpty(), false); //dara falso si no se pudo ingresar el producto
	}
	
	@Test
	void EliminarProducto() {
		lista.add(vista.IngresarProducto.ingresarProducto("papa", 3.2, 2));
		boolean eliminar = vista.EliminarProducto.eliminarProducto("papa", lista);
		assertEquals(eliminar, true); //dara true si se pudo eliminar el producto
	}
	
	

}
