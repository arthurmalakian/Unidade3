package br.ufrn.imd.local.questoes;

import br.ufrn.imd.local.huffman.Huffman;

import java.io.*;
/*
    Nessa questão utilizamos um arquivo de input com um texto aleatório o qual o lemos caractere por caractere
    e adicionamos a arvore de huffman assim cada caractere corresponde a um código único que não é prefixo de
    nenhum outro.
    Lemos novamente o arquivo de input e inserimos no arquivo de output substituindo seus caracteres pelo código
    que obtemos.
    Para descomprimir utilizamos o mapa de códigos e concatenamos os caracteres do arquivo comprimido até formar
    um código de caracteres existentes na arvore de ruffman assim substituindo de volta pelos caracteres
    correspondentes.
 */
public class Q3 {
    File file;
    Huffman huffman;
    public Q3(String path) throws IOException {
        file = new File(path);
        if (!file.exists()){
            System.out.println("Arquivo não existe.");
        }
        FileReader reader = new FileReader(file);
        BufferedReader buffreader = new BufferedReader(reader);
        String string;
        StringBuilder strb = new StringBuilder();
        while ((string = buffreader.readLine()) != null){
            strb.append(string);
        }
        huffman = new Huffman(strb.toString());
    }
    public void compress() throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader buffreader = new BufferedReader(reader);
        FileOutputStream fos = new FileOutputStream("./huffman/out/output.txt");
        PrintStream prtstr = new PrintStream(fos,true);
        String line;
        while ((line = buffreader.readLine()) != null){
            for (char c : line.toCharArray()){
                if (huffman.getCode(c) != null || huffman.getCode(c) == " "){
                    prtstr.print(huffman.getCode(c));
                }
            }
        }
        reader.close();
        buffreader.close();
        fos.close();
        prtstr.close();
    }
    public void decompress(String path) throws IOException {
        FileReader reader = new FileReader(new File(path));
        BufferedReader buffreader = new BufferedReader(reader);
        FileOutputStream fos = new FileOutputStream("./huffman/out/output-depresso.txt");
        PrintStream prtstr = new PrintStream(fos,true);
        String line;
        String test = "";
        while ((line = buffreader.readLine()) != null){
            for (char c : line.toCharArray()){
                test+= c;
                if (huffman.getChar(test) != null){
                    prtstr.print(huffman.getChar(test));
                    test = "";
                }
            }
        }
        reader.close();
        buffreader.close();
        fos.close();
        prtstr.close();
    }
}
