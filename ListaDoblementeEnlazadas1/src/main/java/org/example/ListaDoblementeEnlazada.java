package org.example;

public class ListaDoblementeEnlazada {
        private Nodo primero;
        private Nodo ultimo;

        public ListaDoblementeEnlazada() {
            this.primero = null;
            this.ultimo = null;
        }

        /**
         * si la lista es vacia
         *
         * @return
         */
        public boolean estaVacia() {
            return primero == null;
        }

        public void agregarAlInicio(Object dato) {
            Nodo nuevo = new Nodo(dato);
            if (estaVacia()) {
                primero = ultimo = nuevo;
            } else {
                nuevo.setSiguiente(primero);
                primero.setAnterior(nuevo);
                primero = nuevo;
            }
        }

        public void agregarAlFinal(Object dato) {
            Nodo nuevo = new Nodo(dato);
            if (estaVacia()) {
                primero = ultimo = nuevo;
            } else {
                ultimo.setSiguiente(nuevo);
                nuevo.setAnterior(ultimo);
                ultimo = nuevo;
            }
        }

        public void eliminarAlInicio() {
            if (!estaVacia()) {
                if (primero == ultimo) {
                    primero = ultimo = null;
                } else {
                    primero = primero.getSiguiente();
                    primero.setAnterior(null);
                }
            }
        }

        public void eliminarAlFinal() {
            if (!estaVacia()) {
                if (primero == ultimo) {
                    primero = ultimo = null;
                } else {
                    ultimo = ultimo.getAnterior();
                    ultimo.setSiguiente(null);
                }
            }
        }

        public void InsertarEnmedio() {
            Nodo nuevo = new Nodo("E");
            Nodo actual = primero;
            Nodo anterior = null;
            while (actual != null) {
                if (actual.getDato().equals("E")) {
                    anterior.setSiguiente(nuevo);
                    nuevo.setSiguiente(actual);
                    nuevo.setAnterior(anterior);
                    actual.setAnterior(nuevo);

                }
                anterior = actual;
                actual = actual.getSiguiente();
            }

        }

        public void EliminarEnmedio(){
            Nodo actual = primero;
            Nodo anterior = null;
            while (actual != null) {
                if (actual.getDato().equals("A")) {
                    if (anterior != null)
                        anterior.setSiguiente(actual.getSiguiente());
                }
                    if (actual.getSiguiente() != null){
                        actual.getSiguiente().setAnterior(anterior);
                }

                anterior = actual;
                actual = actual.getSiguiente();
            }

        }

        public void RevertirLista(){
            Nodo actual = primero;
            Nodo anterior = null;
            Nodo siguiente = null;
            while (actual != null) {
                siguiente = actual.getSiguiente();
                actual.setSiguiente(anterior);
                actual.setAnterior(siguiente);
                anterior = actual;
                actual = siguiente;
            }
            primero = anterior;
        }

        public void TamañoLista(){
            Nodo actual = primero;
            int contador = 0;
            while (actual != null) {
                contador++;
                actual = actual.getSiguiente();
            }
            System.out.println("El tamaño de la lista es: " + contador);
        }

        public void EliminarDuplicados(){
            Nodo actual = primero;
            Nodo anterior = null;
            while (actual != null) {
                if (anterior != null && actual.getDato().equals(anterior.getDato())) {
                    anterior.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(anterior);
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }

        public void recorrerLista() {
            Nodo actual = primero;
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
        }

        public void buscarNodo(Object dato) {
            Nodo actual = primero;
            while (actual != null) {
                if (actual.getDato().equals(dato)) {
                    System.out.println("El dato " + dato + " se encuentra en la lista");
                    return;
                }
                actual = actual.getSiguiente();
            }
            System.out.println("El dato " + dato + " no se encuentra en la lista");
        }

        /**
         * Insertar en medio
         * Eliminar en medio
         * Revertir la lista doble
         * Tamaño de la lista
         * Eliminar duplicados
         *
         * LinkedList<>
         */
    }


