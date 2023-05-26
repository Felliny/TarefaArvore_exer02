package Controller;

import model.Arvore;

public class Arvore02 {

    public Arvore02() {
        super();
    }

    public void geraArvore(int[] vetor){
        Arvore arvore= new Arvore();

        int tamanho= vetor.length;

        for (int i = 0; i < tamanho; i++) {
            arvore.insert(vetor[i]);
        }


        try {
            arvore.remove(7);
            arvore.remove(6);
            System.out.println("Prefix: ");
            arvore.prefixSearch();
            System.out.println("\n");
            System.out.println("Infix: ");
            arvore.infixSearch();
            System.out.println("\n");
            System.out.println("Posfix: ");
            arvore.postfixSearch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
