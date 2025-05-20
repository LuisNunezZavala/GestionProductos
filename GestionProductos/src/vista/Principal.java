package vista;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int opcion = -1;
		ArrayList<Productos> lista = new ArrayList<Productos>();

		do {

			try {
				System.out
						.println("Menu \n1.- Agregar Producto\n2.- ListarProducto\n3.- Eliminar Producto\n\n0.- Salir");
				opcion = Integer.parseInt(ent.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("Formato numerico erroneo " + ex.getMessage());
				opcion = -1;
			}

			switch (opcion) {
			case 1:
				System.out.println("Ingrese nombre producto");
				String nombre = ent.nextLine();

				System.out.println("Ingrese el precio del producto");
				double precio = Double.parseDouble(ent.nextLine());

				System.out.println("Ingrese la cantida del producto");
				int cantidad = Integer.parseInt(ent.nextLine());

				System.out.println(
						lista.add(IngresarProducto.ingresarProducto(nombre, precio, cantidad)) ? "Registro completado"
								: "Registro erroneo");
				break;
			case 2:
				ListarProducto.listarProducto(lista);
				break;
			case 3:
				System.out.println("Ingrese nombre producto a eliminar");
				nombre = ent.nextLine();
				System.out.println(EliminarProducto.eliminarProducto(nombre, lista) ? "Producto eliminado"
						: "No se ha encontrado producto");
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("La opcion no existe");
			}

		} while (opcion != 0);

	}
}
