package Questao01;

import java.util.Scanner;

public class testeEstudante {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int op = 0;
            boolean ativo = true;
            while (ativo){
                System.out.println("-------------<Sistema de aluno>-------------");
                System.out.println("1 - Criar estudante");
                System.out.println("2 - Calcular media");
                System.out.println("3 - Obter numero de matricula");
                System.out.println("4 - Obter endereço");
                System.out.println("5 - sair");
                op = sc.nextInt();
                sc.nextLine();

                switch (op){
                    case 1:
                        System.out.println("");
                        System.out.println("Digite o nome do estudante. ");
                        String nome = sc.nextLine();

                        System.out.println("Digite a matricula do estudante. ");
                        String matricula = sc.nextLine();

                        System.out.println("Digite o endereco do estudante. ");
                        String endereco = sc.nextLine();

                        double[] notas = new double[4];
                        for (int i = 0; i<4 ; i++){
                            System.out.println("Digite a nota "+(i+1)+":");
                            notas[i] = sc.nextDouble();
                        }
                        Estudante estudante = new Estudante(nome,matricula,endereco,notas);
                        break;

                    case 2:
                        estudante.calcularMedia();

                    case 5:
                        ativo = false;
            }
            }


    }
}
