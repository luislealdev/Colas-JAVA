public class Exe {
    public static void main(String[] args) {
        Cola cola = new Cola(3);
        cola.m_in(1);
        cola.m_in(2);
        cola.m_in(3);

        cola.m_mostrarDatos();
        cola.m_out();
        cola.m_in(10);
        cola.m_mostrarDatos();
    }
}