package exercicio;

import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<Float>();

        while (true) {
            System.out.format("Digite a nota do %d° aluno: ", notas.size()+1);
            float nota = teclado.nextFloat();

            notas.add(nota);
            teclado.nextLine();
            
            System.out.print("Deseja continuar ? ");
            String escolha = teclado.nextLine().toUpperCase();
            if (escolha.contains("N")) {
                break;
            }
        }

        
        float media = mediaNotas(notas);
        System.out.format("A média das notas foi de %.1f pontos de %d alunos", media, notas.size());

        teclado.close();
    }

    public static float mediaNotas(ArrayList<Float> array) {
        float total = 0;
        for (float item : array) {
            total += item;
        }
        return total / array.size();
    }
}
