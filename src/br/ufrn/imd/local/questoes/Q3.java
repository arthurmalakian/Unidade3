package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.huffman.Huffman;

import java.io.File;

public class Q3 {
    File file;
    public Q3(String path){
        file = new File(path);
        if (!file.exists()){
            System.out.println("Arquivo não existe.");
        }
    }
    public File compress(){
        File newFile;
        if (!file.exists()){
            System.out.println("Impossivel realizar a compressão pois o arquivo não existe.");
            return null;
        }
        String str = file.toString();
        Huffman huffman = new Huffman(str);
        huffman.
    }
    public void decompress(File file){

    }
}
