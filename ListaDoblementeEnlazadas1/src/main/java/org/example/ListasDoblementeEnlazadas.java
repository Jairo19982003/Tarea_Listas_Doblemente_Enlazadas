package org.example;

public class ListasDoblementeEnlazadas {
public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        lista.agregarAlInicio("A");
        lista.agregarAlInicio("B");
        lista.agregarAlFinal("C");
        lista.agregarAlFinal("D");
        lista.agregarAlFinal("E");


        lista.recorrerLista();

       /* lista.buscarNodo("B");
        lista.buscarNodo("E");

        lista.eliminarAlInicio();
        lista.eliminarAlFinal();*/

        //lista.recorrerLista();

        lista.InsertarEnmedio();
        System.out.println("Lista con nodo insertado en medio");
        lista.recorrerLista();

        lista.EliminarEnmedio();
        System.out.println("Lista con nodo eliminado en medio");
        lista.recorrerLista();

        lista.RevertirLista();
        System.out.println("Lista revertida");
        lista.recorrerLista();

        lista.TamañoLista();

        lista.EliminarDuplicados();
        System.out.println("Lista sin duplicados");
        lista.recorrerLista();

    }
}
