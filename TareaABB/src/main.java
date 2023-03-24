import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		 
	    //Creamos el Arbol binario de Busqueda
		ArbolBB abb = new ArbolBB();
	     
	    //Insertamos nos nodos
	    abb.insertarElemento(15);
	    abb.insertarElemento(9);
	    abb.insertarElemento(20);
	    abb.insertarElemento(6);
	    abb.insertarElemento(14);
	    abb.insertarElemento(13);
	    abb.insertarElemento(17);
	    abb.insertarElemento(64);
	    abb.insertarElemento(72);
	    abb.insertarElemento(26);
	 
	    //Imprimimos el n�mero de elementos que tenemos:
	    System.out.println("N�mero de elementos: " + abb.size());
	     
	    //Obtenemos los n�meros ordenados ascendentemente
	    ArrayList<Integer> numerosOrdenadosAscedentemente = abb.obtenerElementosOrdenadosAscendentemente();
	    System.out.print("Lista de numeros ordenados ascendentemente: [ ");
	     
	    for (Integer numero: numerosOrdenadosAscedentemente) {
	        System.out.print(numero + " ");
	    }
	    System.out.print("]\n");
	     
	    //Obtenemos los n�meros ordenados descendentemente
	    ArrayList<Integer> numerosOrdenadosDescedentemente = abb.obtenerElementosOrdenadosDescendentemente();
	    System.out.print("Lista de numeros ordenados descendentemente: [ ");
	     
	    for (Integer numero: numerosOrdenadosDescedentemente) {
	        System.out.print(numero + " ");
	    }
	    System.out.print("]\n");
	     
	    //Realizamos diferentes b�squedas
	    if (abb.buscarElemento(20) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(72) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(56) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(6) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(9) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    //imprimimos estadisticas
	    System.out.println("Numero de iteraciones en la �ltima b�squeda: " + abb.getNumeroIteracionesUltimaBusqueda());
	    System.out.println("Numero de iteraciones medio en las b�squedas: " + abb.getNumeroIteracionesMedioEnBusquedas());
	 
	    //Eliminamos nodos
	    //Eliminamos la raiz
	    abb.eliminarElemento(15);
	    //Eliminamos nodos
	    abb.eliminarElemento(13);
	    abb.eliminarElemento(14);
	    abb.eliminarElemento(64);
	     
	    //Buscamos los elementos eliminado
	    if (abb.buscarElemento(15) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(13) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(14) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    if (abb.buscarElemento(64) != null) {
	        System.out.println("Elemento encontrado");
	    }else {
	        System.out.println("Elemento no encontrado");
	    }
	     
	    //Obtenemos los n�meros ordenados ascendentemente
	    numerosOrdenadosAscedentemente = abb.obtenerElementosOrdenadosAscendentemente();
	    System.out.print("Lista de n�meros ordenados ascendentemente: [ ");
	     
	    for (Integer numero: numerosOrdenadosAscedentemente) {
	        System.out.print(numero + " ");
	    }
	    System.out.print("]\n");
	     
	    //Obtenemos los n�meros ordenados descendentemente
	    numerosOrdenadosDescedentemente = abb.obtenerElementosOrdenadosDescendentemente();
	    System.out.print("Lista de n�meros ordenados descendentemente: [ ");
	     
	    for (Integer numero: numerosOrdenadosDescedentemente) {
	        System.out.print(numero + " ");
	    }
	    System.out.print("]\n");
	     
	    //Imprimimos el n�mero de elementos que tenemos:
	    System.out.println("N�mero de elementos: " + abb.size());
	}

}

