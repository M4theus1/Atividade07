package Atividade12;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoCidades {
    public static void main(String[] args) {
        // Criando uma ArrayList de Strings para armazenar os nomes das cidades
        ArrayList<String> cidades = new ArrayList<>();

        // Adicionando 5 nomes de cidades na lista
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add("Belo Horizonte");
        cidades.add("Porto Alegre");

        // Imprimindo a lista antes da ordenação
        System.out.println("Lista antes da ordenação:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // Ordenando a lista em ordem alfabética
        Collections.sort(cidades);

        // Imprimindo a lista depois da ordenação
        System.out.println("\nLista depois da ordenação:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}