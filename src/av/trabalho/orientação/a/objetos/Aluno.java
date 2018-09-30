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
public class Aluno extends Pessoa  {
    private int ra, periodo;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public Aluno(String nome, long cpf, int ra, int periodo) {
        setNome(nome);
        setCpf(cpf);
        setRa(ra);
        setPeriodo(periodo);
    }
}
