package org.EstudoJava.JavaCore.String.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args){
        //evitar trabalhar com microdesempenho, pois só irá aumentar a complexidade
        //stringbuilder e stringbuffer é necessário em certas ocasiões, como sistemas grandes
        //impactados pelo desempenho

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        long inicioSb = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        long fimSb = System.currentTimeMillis();

        System.out.println("Tempo gasto para String Builder: " + (fimSb - inicioSb) + "ms");

        long inicioSbf = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long fimSbf = System.currentTimeMillis();

        System.out.println("Tempo gasto para String Buffer: " + (fimSbf - inicioSbf) + "ms");
    }

    private static void concatString(int tamanho){

        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){

        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){

        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
