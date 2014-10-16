/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
         
        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        
        for(Integer i=0; i < 5; i++){
            System.out.println("Digite o codigo da materia e em seguida seus creditos");
            
            Scanner scanner = new Scanner(System.in);
            Integer codigoMateria;
            Integer creditoMateria;
            
            codigoMateria = scanner.nextInt();
            creditoMateria = scanner.nextInt();
            
            disciplinas.add(new Disciplina(codigoMateria, creditoMateria));
        }
        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
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
