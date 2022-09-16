public class Exe{
    public static void main(String[] args) {
        Cola cola = new Cola(3);
        cola.m_in(1);
        cola.m_in(2);
        cola.m_in(3);

        System.out.println(cola.m_out());
    }
}