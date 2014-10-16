/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Map;

/**
 *
 * @author Raphael
 */
class Aluno {
    private String nome;
    private Integer qtdMaterias;
    private Map<Integer,Float> notasMaterias;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdMaterias() {
        return qtdMaterias;
    }

    public void setQtdMaterias(Integer qtdMaterias) {
        this.qtdMaterias = qtdMaterias;
    }

    public Map<Integer,Float> getNotasMaterias() {
        return notasMaterias;
    }

    public void setNotasMaterias(Map<Integer,Float> notasMaterias) {
        this.notasMaterias = notasMaterias;
    }
    
    
}
