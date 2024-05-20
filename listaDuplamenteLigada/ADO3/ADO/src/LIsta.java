// import org.example.modelo.Pessoa;

public class LIsta {

    private Celula inicio, atual, aux;
    int cont = 0;

    public boolean empty() {
        return inicio == null;
    }

    public void push(int num) {
        if (empty()) {
            inicio = new Celula(null, null, num);
            aux = inicio;
            cont++;
        } else {
            atual = new Celula(aux, null, num);
            aux.setProx(atual);
            aux = atual;
            cont++;
        }
    }

    public void exibir() {
        Celula e = inicio;
        while (e != null) {
            System.out.print(e.getNum() + " ");
            e = e.getProx();

        }
        System.out.println();
    }

    public int size() {
        return cont;
    }

    // public void exibirAoContrario() {
    // Celula c = atual;
    // while (c != null) {
    // System.out.println(c.getNum());
    // c = c.getAnt();
    // }
    // }

    // public Celula pesquisar(int id, Celula e) {
    // Pessoa pessoa;
    // while (e != null) {
    // pessoa = (Pessoa) e.getDados();
    // if (id == pessoa.getId()) {
    // return e;
    // }
    // e = e.getProx();
    // }
    // return null;
    // }

    // public Pessoa pesquisar(int id) {
    // Pessoa pessoa;
    // Celula e = inicio;
    // while (e != null) {
    // pessoa = (Pessoa) e.getDados();
    // if (id == pessoa.getId()) {
    // return pessoa;
    // }
    // e = e.getProx();
    // }
    // return null;
    // }

    // public boolean remover(int id) {
    // Celula p = pesquisar(id, inicio);
    // if (p != null) {
    // if (p == inicio) {
    // inicio = p.getProx();
    // p.setProx(null);
    // inicio.setAnt(null);
    // } else if (p == atual) {
    // atual = p.getAnt();
    // aux = atual;
    // atual.setProx(null);
    // p.setAnt(null);
    // } else {
    // p.getAnt().setProx(p.getProx());
    // p.getProx().setAnt(p.getAnt());
    // p.setAnt(null);
    // p.setProx(null);
    // }
    // return true;
    // }
    // return false;
    // }

    public void top() {
        Celula c = atual;
        if (c == atual) {
            System.out.println(c.getNum());
        }
    }

    public void pop() {
        Celula c = atual;
        if (c == atual) {
            c.getNum();
        }
        if (c != null) {
            if (c == inicio) {
                inicio = c.getProx();
                c.setProx(null);
                inicio.setAnt(null);
                cont--;
            } else if (c == atual) {
                atual = c.getAnt();
                aux = atual;
                atual.setProx(null);
                c.setAnt(null);
                cont--;
            }
            // return true;
        }

    }

}
