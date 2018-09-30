/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av.trabalho.orientação.a.objetos;

/**
 *
 * @author João André
 */
public class Professor extends Pessoa {
    private double salario;
    private String formacao;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public Professor(String nome, long cpf, double salario, String formacao) {
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
        setFormacao(formacao);
    }
}
