package br.ufrn.imd.local.huffman;

public class Node {
    /*
    ATRIBUTOS:
        char key = chave a ser guardada no nó
        int freq = frequencia de repetição da chave
        Node left = nó filho esquerdo
        Node right = nó filho direito
    MÉTODOS:
        public Node(Node left, Node right) = Construtor que inicializa o nó com dois nós filhos.
        public Node(char key,int freq) = Construtor que inicializa o nó com o valor da chave e da frequencia
        public boolean isLeaf() = retorna se o nó é uma folha ou não
        demais: getters & setters.
     */
    private char key;
    private int freq;
    private Node left;
    private Node right;

    public Node(Node left, Node right){
        this.left = left;
        this.right = right;
    }
    public Node(char key,int freq){
        this.key = key;
        this.freq = freq;
    }
    public boolean isLeaf(){
        return left == null && right == null;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String toString(){
        return "todo";
    }

}
