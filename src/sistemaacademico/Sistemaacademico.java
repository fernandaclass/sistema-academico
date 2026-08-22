package sistemaacademico;

import java.util.Locale;
import java.util.Scanner;


public class Sistemaacademico {
 
    public static void main(String[] args) {
        Locale ptBR = Locale.forLanguageTag("pt-BR");
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(ptBR);
        final double MEDIA_MINIMA = 6.0;
        
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Matr��cula: ");
        String matricula = entrada.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2) / 2.0;

        boolean notasValidas =
            nota1 >= 0 && nota1 <= 10
            && nota2 >= 0 && nota2 <= 10;
        
        if (!notasValidas) {
            System.out.println("Notas inválidas.");
        }

        String classificacaoMedia;
        
        if (!notasValidas) {
            classificacaoMedia = "Notas inválidas";
        } else if (media >= 6.0) {
            classificacaoMedia = "Aprovado";
        }   else if (media >= 4.0) {
            classificacaoMedia = "Recuperação";
        }   else {
            classificacaoMedia = "Reprovado";
        }
           
       
        
        System.out.printf(
        ptBR, "%n--- FICHA ACAD��MICA ---%n");

        System.out.printf(ptBR, "Nome: %s%n", nome);
        System.out.printf(ptBR, "Matr��cula: %s%n", matricula);
        System.out.printf(ptBR, "Notas: %.2f e %.2f%n", nota1, nota2);
        System.out.printf(ptBR, "M��dia: %.2f%n", media);
        System.out.printf(ptBR, "Notas v��lidas: %b%n", notasValidas);
        System.out.printf(ptBR, "Classifica����o: %s%n", classificacaoMedia);

        entrada.close();
    }
    
}
