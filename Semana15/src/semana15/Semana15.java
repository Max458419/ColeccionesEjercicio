/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana15;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author ORTEL
 */
public class Semana15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Double> inventario = new HashMap<>();
        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("--- GESTIÓN DE TIENDA ---");

        do {
            System.out.println("\n1. Agregar producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Buscar precio de un producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = leer.nextLine();
                    System.out.print("Precio: ");
                    double precio = leer.nextDouble();
                    inventario.put(nombre, precio);
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Productos ---");
                    if (inventario.isEmpty()) {
                        System.out.println("El inventario está vacío.");
                    } else {
                        for (Map.Entry<String, Double> entry : inventario.entrySet()) {
                            System.out.println("Producto: " + entry.getKey() + " | Precio: $" + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String busca = leer.nextLine();
                    if (inventario.containsKey(busca)) {
                        System.out.println("El precio de " + busca + " es: $" + inventario.get(busca));
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    // 4. Operación básica: Eliminar
                    System.out.print("Nombre del producto a eliminar: ");
                    String eliminar = leer.nextLine();
                    if (inventario.remove(eliminar) != null) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("No se encontró el producto.");
                    }
                    break;
            }
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
    }
}
    
    

