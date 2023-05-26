package View;

import Controller.Arvore02;

public class Main {
    public static void main(String[] args) {
        Arvore02 p= new Arvore02();
        int[] vetor= {7, 8, 3, 4, 2, 1, 6, 5};

        p.geraArvore(vetor);
    }
}
