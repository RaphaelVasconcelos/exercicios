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
    private Integer codigo;
    private Double cr;
    private Map<Integer,Double> notasMaterias;

    Aluno(String nome, Integer codigoAluno, Map<Integer, Double> notasMaterias) {
        this.nome = nome;
        this.codigo = codigoAluno;
        this.notasMaterias = notasMaterias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Integer,Double> getNotasMaterias() {
        return notasMaterias;
    }

    public void setNotasMaterias(Map<Integer,Double> notasMaterias) {
        this.notasMaterias = notasMaterias;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cr
     */
    public Double getCr() {
        return cr;
    }

    /**
     * @param cr the cr to set
     */
    public void setCr(Double cr) {
        this.cr = cr;
    }
}
