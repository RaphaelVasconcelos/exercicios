/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Raphael
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercicio1();

        exercicio2(); 
        
        exercicio3();
    }

    private static void exercicio3() {
        List<Disciplina> disciplinas = cadastraDisciplina();
        
        List<Aluno> alunos = cadastraAlunos();
        
        calculaNotas(alunos, disciplinas);
        
        imprimeCr(alunos);
    }

    private static List<Disciplina> cadastraDisciplina() {        
        List<Disciplina> disciplinas = new ArrayList<>();
        for(Integer i=0; i < 2; i++){
            System.out.println("Digite o codigo da materia e em seguida seus creditos");
            
            Scanner scanner = new Scanner(System.in);
            Integer codigoMateria;
            Integer creditoMateria;
            
            codigoMateria = scanner.nextInt();
            creditoMateria = scanner.nextInt();
            
            disciplinas.add(new Disciplina(codigoMateria, creditoMateria));
        }
        return disciplinas;
    }

    private static List<Aluno> cadastraAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String nome = "";
        while(!nome.equals("fim")){
            System.out.println("Digite o nome do aluno");
            Scanner scanner = new Scanner(System.in);
            nome = scanner.nextLine();
            if(!nome.equals("fim")){
                System.out.println("Digite o codigo do aluno");
                Integer codigoAluno = scanner.nextInt();
            
                System.out.println("Digite quantas materias cursadas do aluno");
                Integer quantidadeDeMateria = scanner.nextInt();
                Map<Integer, Double> notasMaterias = new HashMap<Integer, Double>();
            
                for(Integer i = 0; i < quantidadeDeMateria; i++){
                    System.out.println("Digite o codigo da materia e depois a nota do aluno");
                    Integer codigoMateria = scanner.nextInt();
                    Double notaAluno = scanner.nextDouble();
                    notasMaterias.put(codigoMateria, notaAluno);
                }
            
                alunos.add(new Aluno(nome, codigoAluno, notasMaterias));
            }
        }
        return alunos;
    }

    private static void calculaNotas(List<Aluno> alunos, List<Disciplina> disciplinas) {
        for(Aluno aluno : alunos){
            Integer cargaHoraria = 0;
            Double notas = 0.0;
            for(Entry<Integer, Double> disciplinaEnota : aluno.getNotasMaterias().entrySet()){
                for(Disciplina disciplina : disciplinas){
                    if(disciplinaEnota.getKey() == disciplina.getCodigo()){
                        cargaHoraria+= disciplina.getCredito();
                        notas+= disciplinaEnota.getValue()* disciplina.getCredito();
                    }
                }          
            }
            aluno.setCr(notas / cargaHoraria);
        }
    }

    private static void imprimeCr(List<Aluno> alunos) {
        for(Aluno aluno : alunos ){
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Cr: " + aluno.getCr());
        }
    }

    private static void exercicio2() {
        List<Integer> numeros = criaVetor(10);
        
        Collections.sort(numeros);
        Integer imparCont = 0;
        imparCont = verificaNumero(numeros, imparCont);
        System.out.println(imparCont);   
    }

    private static Integer verificaNumero(List<Integer> numeros, Integer imparCont) {
        for(Integer numero : numeros){
            if(numero % 2 == 0){
                System.out.println(numero);
            }else{
                imparCont++;
            }
        }
        return imparCont;   
    }

    private static List<Integer> criaVetor(Integer tamanhoVetor) {
        List<Integer> numeros = new ArrayList<>();
        for(Integer i=0; i < tamanhoVetor; i++){
            System.out.println("Novo Numero");
            Scanner scanner = new Scanner(System.in); 
            numeros.add(scanner.nextInt());
        }
        return numeros;
    }

    private static void exercicio1() {
        System.out.println("digite 2 numeros");
        Scanner scanner = new Scanner(System.in);
        Integer numero1;
        numero1 = scanner.nextInt();
        Integer numero2;
        numero2 = scanner.nextInt();
        
        verificaMaior(numero1, numero2);
    }

    private static void verificaMaior(Integer numero1, Integer numero2) {
        if(numero1 > numero2){
            System.out.println("O maior numero: " + numero1);
        }else{
            System.out.println("O maior numero: " + numero2);
        }
    }
    
}
