package br.ufrn.imd.local;

import br.ufrn.imd.local.questoes.Q1;
import br.ufrn.imd.local.questoes.Q2;
import br.ufrn.imd.local.questoes.Q3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        Q3 q3 = new Q3("./huffman/in/input.txt");
        //q1.start();
        //q2.start();
        q3.compress();
        q3.decompress("./huffman/out/output.txt");
    }
}
