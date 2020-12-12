package br.ufrn.imd.local.patricia;

import java.math.BigInteger;
import java.util.ArrayList;

public class Tree {
    /*
     MÉTODOS:
     searchPrefix: Recebe uma sequência de caracteres
     e procura pelas palavras presentes na árvore que têm essa sequência
     de caracteres como prefixo.
     search: Recebe uma palavra, transforma ela em uma string de números
     binários e verifica se existe algum nó com essa key.
     getInsertPoint: Percorre a árvore recursivamente até achar o primeiro
     nó folha ou um nó de decisão que possua index maior do que o passado
     como parâmetro do método.
     diffIndex: Recebe duas strings de números binários e acha o index
     de diferença entre elas.
     getNode: Busca o nó folha mais próximo da key informada como parâmetro.
     keyToBinary: Recebe uma palavra e transforma em uma string de números
     binários.
     binaryToKey: Recebe uma string de números binários e transforma em uma
     palavra com nossos caracteres.
     */
    private Node root;

    private void searchPrefix(Node node, String value,ArrayList<String> list){
        if (node.isLeaf()){
            list.add(binaryToKey(node.getKey()));
        }else{
            searchPrefix(node.getLeft(),value,list);
            searchPrefix(node.getRight(),value,list);
        }
    }
    public ArrayList<String> searchPrefix(String value){
        ArrayList<String> returnArray = new ArrayList<String>();
        if (root == null || value == ""){
            return returnArray;
        }
        String key = keyToBinary(value);
        Node node = getNode(root,key);
        if (node.getKey().startsWith(key)){
            Node insert = getInsertPoint(root,key,key.length());
            searchPrefix(insert,key,returnArray);
        }
        return returnArray;
    }
    public boolean insert(String value){
        if (value == ""){
            return false;
        }
        String key = keyToBinary(value);
        if (root == null){
            root = new Node(key);
            root.setIndex(key.length());
        }else{
            Node node = getNode(root,key);
            if (node.isLeaf() && (node.getKey().startsWith(key) || key.startsWith(node.getKey()))){
                return false;
            }
            int diff = diffIndex(key,node.getKey());
            Node insert = getInsertPoint(root,key,diff);
            Node newNode = new Node(key);
            newNode.setIndex(key.length());
            Node current =  new Node(insert);
            insert.setKey(null);
            insert.setIndex(diff);
            if (key.charAt(diff) == '1'){
                insert.setRight(newNode);
                insert.setLeft(current);
            }else{
                insert.setRight(current);
                insert.setLeft(newNode);
            }
        }
        return true;
    }
    public boolean search(String value){
        if (root == null){
            return false;
        }else{
            String key = keyToBinary(value);
            Node node = getNode(root,key);
            return key.equals(node.getKey());
        }
    }
    private Node getInsertPoint(Node node, String key,int index){
        if (node.isLeaf() || index <= node.getIndex()){
            return node;
        }else{
            int decision = node.getIndex();
            return getInsertPoint(key.charAt(decision) == '0' ? node.getLeft() : node.getRight(),key,index);
        }
    }
    private int diffIndex(String key1, String key2) {
        int n = Math.min(key1.length(),key2.length());
        for (int i = 0; i < n; i++){
            if (key1.charAt(i) != key2.charAt(i)){
                return i;
            }
        }
        return n-1;
    }

    private Node getNode(Node node, String key){
        if (node.isLeaf()){
            return node;
        }else{
            int decision = node.getIndex();
            if (decision >= key.length() || key.charAt(decision) == '0'){
                return getNode(node.getLeft(),key);
            }else{
                return getNode(node.getRight(),key);
            }
        }
    }
    public String keyToBinary(String value){
        byte[] bytes = value.getBytes();
        BigInteger integer = new BigInteger(bytes);
        return integer.toString(2);
    }
    public String binaryToKey(String value){
        BigInteger integer = new BigInteger(value,2);
        byte[] bytes = integer.toByteArray();
        return new String(bytes);
    }
    private String toString(Node node, int indent){
        if (node == null){
            return "";
        }
        String prefix = "\n";
        for (int i = 0; i < indent; i++){
            prefix += "\t";
        }
        return toString(node.getRight(), indent + 1) + prefix + node.toString() + toString(node.getLeft(), indent + 1);    }
    public String toString(){
        return toString(root,0) + "\n";
    }
}
