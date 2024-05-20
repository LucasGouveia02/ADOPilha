package org.example.lista;

// import org.example.modelo.Pessoa;

public class Lista {

    private Celula inicio, atual, aux;
    int cont = 0;

    public boolean empty() {
        return inicio == null;
    }

    public void push(int num) {
        if (empty()) {
            inicio = new Celula(null, null, num);
            atual = inicio;
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
        Celula e = atual;
        while (e != null) {
            System.out.println(e.getNum());
            e = e.getAnt();
        }
    }

    public int size() {
        return cont;
    }

    public Celula top() {
        return atual;
    }

    public boolean pop() {
        Celula p = top();
        if (p != null) {
            if (p == inicio) {
                inicio = p.getProx();
                atual = null;
                cont--;
            } else if (p == atual) {
                atual = p.getAnt();
                aux = atual;
                atual.setProx(null);
                p.setAnt(null);
                cont--;
            }
            return true;
        }
        return false;
    }

}
