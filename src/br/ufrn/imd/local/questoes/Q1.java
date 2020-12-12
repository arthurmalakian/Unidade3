package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.patricia.Tree;

public class Q1 {
    /*
     Para a implementação desta árvore PATRICIA, estamos
     utilizando nós que guardam um index de comparação, caso
     sejam um nó de decisão, ou uma key, caso seja um nó de valor.
     Além disso, um nó pode possuir um nó filho à esquerda e um nó
     filho à direita.

     Esta key é uma String do valor binário (ex: "10010101100") da
     palavra que foi inserida.
     O processo de busca e de inserção nesta árvore é baseado no valor
     binário das palavras. Assim, para percorrer pelos nós da árvore,
     é utilizado o caractere da key que estiver na posição do index
     de comparação apresentado em um nó de decisão.
     Por exemplo:
     Se o nó atual é um nó de decisão e possui index = 12, então
     devemos acessar a nossa key (seja ela do nó a ser inserido ou
     da palavra sendo buscada) na posição 12.
     Caso o valor nessa posição seja igual a 0, devemos prosseguir
     pelo nó da esquerda. Caso contrário, prosseguimos pelo nó da direita.
     */
    public void start(){
        Tree patricia = new Tree();
        patricia.insert("rato");
        patricia.insert("roeu");
        patricia.insert("roupa");
        patricia.insert("rei");
        patricia.insert("roma");
        System.out.println(patricia.search("rato"));
        System.out.println(patricia.search("roeu"));
        System.out.println(patricia.search("roupa"));
        System.out.println(patricia.search("rei"));
        System.out.println(patricia.search("roma"));
        System.out.println(patricia.toString());
    }
}
