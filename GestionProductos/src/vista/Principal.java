package vista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int opcion = -1;

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
				break;
			case 2:
				break;
			case 3:
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
