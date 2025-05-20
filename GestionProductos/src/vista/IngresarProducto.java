package vista;

public class IngresarProducto {
	public static Productos ingresarProducto(String nombre, double precio, int cantidad) {
		return new Productos(nombre, precio, cantidad);
	}

}

