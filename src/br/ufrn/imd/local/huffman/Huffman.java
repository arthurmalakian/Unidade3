package br.ufrn.imd.local.huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    public Huffman(String txt){
        Map<Character,Integer> freqChar = count(txt);

        int i = 0;
        Node[] leafs = new Node[freqChar.size()];
        for (Map.Entry<Character,Integer> entry : freqChar.entrySet()){
            Node node = new Node(entry.getKey(),entry.getValue());
            leafs[i++] = node;
        }
        PriorityQueue heap = new PriorityQueue(leafs.length,);
        for (Node n : leafs){
            heap.add(n);
        }
        heap.
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
}
