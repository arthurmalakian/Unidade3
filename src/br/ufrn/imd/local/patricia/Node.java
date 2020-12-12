package br.ufrn.imd.local.patricia;

public class Node {

    private String key;
    private int index;
    private Node left;
    private Node right;


    public Node (int index){
        this.index = index;
    }
    public Node (String key){
        this.key = key;
    }
    public Node (Node node){
        this.key = node.getKey();
        this.index = node.getIndex();
        this.left = node.getLeft();
        this.right = node.getRight();
    }

    public boolean isLeaf(){
        return getLeft() == null && getRight() == null;
    }

    public boolean hasLeft(){
        return getLeft() != null;
    }

    public boolean hasRight(){
        return getRight() != null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
        return "["+key != null ? getKey() : "" + index != null ? String.valueOf(getIndex()) : ""+"]";
    }
}
