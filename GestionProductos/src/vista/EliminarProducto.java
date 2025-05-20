package vista;

import java.util.ArrayList;

public class EliminarProducto {
	public boolean eliminarProducto(String nombre, ArrayList<Productos> lista) {
    for (Productos producto : lista) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            lista.remove(producto);
            return true; 
        }
    }
    return false; 
}

}
