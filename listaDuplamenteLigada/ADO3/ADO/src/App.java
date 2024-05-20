public class App {
    public static void main(String[] args) throws Exception {
        LIsta lista = new LIsta();

        lista.push(8);
        lista.push(88);
        lista.push(45);
        lista.exibir();
        System.out.println(lista.size());
        lista.top();
        lista.pop();
        lista.exibir();
        lista.top();
        System.out.println(lista.size());
    }
}
