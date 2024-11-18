package Questao01;

public class Estudante {

    private String nome;
    private String matricula;
    private String endereco;
    private double[] notas;

    public Estudante(String nome, String matricula, String endereco, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.notas = notas;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public String calcularMedia(){
        double soma = 0;
        for (double nota: notas){
            soma+=nota;
        }
        double media = soma/4;
        if (media >=7){
            return "Aprovado com media " + media;
        }else{
            return "Rreprovado com media " + media;
        }
    }


}
