public class ColaDinamica {
    Nodo Inicio, Fin;

    ColaDinamica() {
        Inicio = null;
        Fin = null;
    }

    void in(int dato) {
        Nodo temp = new Nodo(dato);
        if (Inicio == null) {
            Inicio = temp;
            Fin = temp;
        } else {
            Fin.siguiente = temp;
            Fin = temp;
        }
    }

    Nodo out() {
        Nodo aux = Inicio;
        if (Inicio != null)
            Inicio = Inicio.siguiente;
        return aux;
    }
}
