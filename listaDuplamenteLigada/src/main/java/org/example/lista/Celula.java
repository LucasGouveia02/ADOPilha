package org.example.lista;

public class Celula {

    private Celula ant, prox;
    private int num;

    public Celula() {
    }

    public Celula(Celula ant, Celula prox, int num) {
        this.ant = ant;
        this.prox = prox;
        this.num = num;
    }

    public Celula getAnt() {
        return ant;
    }

    public void setAnt(Celula ant) {
        this.ant = ant;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
