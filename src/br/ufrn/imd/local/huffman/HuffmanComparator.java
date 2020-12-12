package br.ufrn.imd.local.huffman;

import java.util.Comparator;

public class HuffmanComparator implements Comparator<Node> {
    /*
        Essa classe serve como comparador para a heap utilizada no algorítimo de huffman
     */
    public int compare(Node node1, Node node2) {
        if (node1.getFreq() < node2.getFreq())
            return 1;
        else if (node1.getFreq() > node2.getFreq())
            return -1;
        return 0;
    }
}

