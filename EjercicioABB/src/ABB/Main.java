package ABB;
import java.util.ArrayList;

public class Main {

	public static void main(String[]args) {
	 
    // Creamos los productos
    Producto p1 = new Producto(15, "Tercas");
    Producto p2 = new Producto(9, "Tercas");
    Producto p3 = new Producto(20, "Tercas");
    Producto p4 = new Producto(6, "Tercas");
    Producto p5 = new Producto(14, "Tercas");
    Producto p6 = new Producto(13, "Tercas");
    Producto p7 = new Producto(17, "Tercas");
    Producto p8 = new Producto(64, "Tercas");
    Producto p9 = new Producto(72, "Tercas");
    Producto p10 = new Producto(26, "Tercas");
 
    // Creamos nuestro arbol generico parametrizado para productos
    ArbolBinarioBusquedaGenerico<Producto> abb = new ArbolBinarioBusquedaGenerico<Producto>();
 
    // Insertamos los productos
    abb.insertarElemento(p1);
    abb.insertarElemento(p2);
    abb.insertarElemento(p3);
    abb.insertarElemento(p4);
    abb.insertarElemento(p5);
    abb.insertarElemento(p6);
    abb.insertarElemento(p7);
    abb.insertarElemento(p8);
    abb.insertarElemento(p9);
    abb.insertarElemento(p10);
 
    // Imprimimos el número de elementos que tenemos:
    System.out.println("Número de elementos: " + abb.size());
 
    // Obtenemos los números ordenados ascendentemente
    ArrayList<Producto> numerosOrdenadosAscedentemente = abb.obtenerElementosOrdenadosAscendentemente();
    System.out.print("Lista de números ordenados ascendentemente: { ");
 
    for (Producto producto : numerosOrdenadosAscedentemente) {
        System.out.print(producto + " ");
    }
    System.out.print("}\n");
 
    // Obtenemos los números ordenados descendentemente
    ArrayList<Producto> numerosOrdenadosDescedentemente = abb.obtenerElementosOrdenadosDescendentemente();
    System.out.print("Lista de números ordenados descendentemente: { ");
 
    for (Producto producto : numerosOrdenadosDescedentemente) {
        System.out.print(producto + " ");
    }
    System.out.print("}\n");
 
    // Realizamos diferentes búsquedas
    if (abb.buscarElemento(new Producto(20, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(72, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(56, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(6, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(9, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    // imprimimos estadisticas
    System.out.println("Numero de iteraciones en la última búsqueda: " + abb.getNumeroIteracionesUltimaBusqueda());
    System.out
            .println("Numero de iteraciones medio en las búsquedas: " + abb.getNumeroIteracionesMedioEnBusquedas());
 
    // Eliminamos nodos
    // Eliminamos la raiz
    abb.eliminarElemento(new Producto(15, ""));
    // Eliminamos nodos
    abb.eliminarElemento(new Producto(13, ""));
    abb.eliminarElemento(new Producto(14, ""));
    abb.eliminarElemento(new Producto(64, ""));
 
    // Buscamos los elementos eliminado
    if (abb.buscarElemento(new Producto(15, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(13, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(14, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    if (abb.buscarElemento(new Producto(64, "")) != null) {
        System.out.println("Elemento encontrado");
    } else {
        System.out.println("Elemento no encontrado");
    }
 
    // Obtenemos los números ordenados ascendentemente
    numerosOrdenadosAscedentemente = abb.obtenerElementosOrdenadosAscendentemente();
    System.out.print("Lista de números ordenados ascendentemente: { ");
 
    for (Producto producto : numerosOrdenadosAscedentemente) {
        System.out.print(producto + " ");
    }
    System.out.print("}\n");
 
    // Obtenemos los números ordenados descendentemente
    numerosOrdenadosDescedentemente = abb.obtenerElementosOrdenadosDescendentemente();
    System.out.print("Lista de números ordenados descendentemente: { ");
 
    for (Producto producto : numerosOrdenadosDescedentemente) {
        System.out.print(producto + " ");
    }
    System.out.print("}\n");
 
    // Imprimimos el número de elementos que tenemos:
    System.out.println("Número de elementos: " + abb.size());
 
	}
}