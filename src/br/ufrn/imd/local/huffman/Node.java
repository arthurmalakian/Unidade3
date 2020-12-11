package br.ufrn.imd.local.huffman;

public class Node {
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
    public String toString(){
        return isLeaf() ? String.format("[%d,%c]",freq,key) : String.format("(%d)",freq);
    }
}
