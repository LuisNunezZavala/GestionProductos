package vista;

public class IngresarProducto {
	public static Producto ingresarProducto(String nombre, double precio, int cantidad) {
		return new Producto(nombre, precio, cantidad);
	}

}

