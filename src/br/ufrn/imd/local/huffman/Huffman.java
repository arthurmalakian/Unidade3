package br.ufrn.imd.local.huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    /*
    ATRIBUTOS:
       * Node root = Raiz da arvore
       * Map<Character,String> codes = Mapa de códigos para cada caractere que será definido
    MÉTODOS:
       * public Huffman(String txt) = Construtor que tem como parametro uma string, nesse construtor são criados
        os nós da arvore e os códigos dos caracteres.
       * private void makeCodes(Node node, String current) = cria os códigos dos caracteres a partir dos nós da arvore
       * private Map<Character,Integer> count(String txt) = verifica a reincidencia de cada caractere no texto e retorna
        um map com o caractere como chave e o numero de reincidencias do mesmo como atributo
       * public String getCode(char c) = pega o código do caractere a partir do map dos codes.
       * public Character getChar(String key) = Retorna um caractere a partir do mapa de codigos




     */
    private Node root;
    private Map<Character,String> codes;

    public Huffman(String txt){
        Map<Character,Integer> freqChar = count(txt);

        int i = 0;
        Node[] leafs = new Node[freqChar.size()];
        for (Map.Entry<Character,Integer> entry : freqChar.entrySet()){
            Node node = new Node(entry.getKey(),entry.getValue());
            leafs[i++] = node;
        }
        HuffmanComparator comparator = new HuffmanComparator();
        PriorityQueue<Node> heap = new PriorityQueue(leafs.length,comparator);
        for (Node n : leafs){
            heap.add(n);
        }
        while (heap.size() > 1){
            Node a = heap.remove();
            Node b = heap.remove();
            Node parent = new Node(a,b);
            parent.setFreq(a.getFreq()+b.getFreq());
            heap.add(parent);
        }
        root = heap.remove();
        codes = new HashMap<>();
        makeCodes(root,"");
    }

    private void makeCodes(Node node, String current) {
        if (node.isLeaf()){
            codes.put(node.getKey(),current);
        }else{
            makeCodes(node.getLeft(),current+"0");
            makeCodes(node.getRight(),current+"1");
        }
    }

    private Map<Character,Integer> count(String txt){
        Map<Character,Integer> freq = new HashMap<>();
        for (char c : txt.toCharArray()){
            if (!freq.containsKey(c)){
                freq.put(c,0);
            }
            int f = freq.get(c);
            freq.put(c,f+1);
        }
        return freq;
    }
    public String getCode(char c){
        return codes.get(c);
    }
    public Character getChar(String key){
        for (Map.Entry<Character,String> xampso : codes.entrySet()){
            if (xampso.getValue().equals(key)){
                return xampso.getKey();
            }
        }
        return null;
    }
    /*
    public Node getChar (Node current,String key,int index){
        if(current.isLeaf()){
            return current;
        }else if(index >= key.length()){
            return null;
        }else{
            if (key.charAt(index) == '0'){
                return getChar(current.getLeft(),key,index);
            }else{
                return getChar(current.getRight(),key,index);
            }
        }
    }

     */

    private String toString(Node node,int indent){
        if (node == null){
            return "";
        }
        String prefix = "\n";
        for (int i = 0; i < indent; i++){
            prefix += "\t";
        }
        return toString(node.getRight(), indent + 1) + prefix + node.toString() + toString(node.getLeft(), indent + 1);
    }
    public String toString(){
        return toString(root,0);
    }
}
