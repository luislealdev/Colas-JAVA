public class Cola {
    int a_datos[];
    int a_Inicio, a_Final;
    int a_contadorDesocupados;
    Boolean a_error;

    Cola(int p_N) {
        a_datos = new int[p_N];
        if (a_Inicio == a_Final) {
            a_Inicio = a_datos[0];
            a_contadorDesocupados = p_N;
        }
    }

    void m_in(int p_dato) {
        if (a_contadorDesocupados > 0) {
            if (a_Final == a_datos.length)
                a_Final = 0;
            a_datos[a_Final++] = p_dato;
            a_contadorDesocupados--;
        } else
            a_error = true;
    }

    int m_out() {
        if (a_contadorDesocupados != a_datos.length) {
            int aux;
            if (a_Inicio == a_datos.length)
                a_Inicio = 0;
            aux = a_datos[a_Inicio++];
            a_contadorDesocupados++;
            return aux;
        } else
            a_error = true;
        return 0;
    }

    void m_mostrarDatos() {
        int contador;
        for (contador = 0; contador < a_datos.length; contador++) {
            System.out.print(a_datos[contador]);
        }
    }
}