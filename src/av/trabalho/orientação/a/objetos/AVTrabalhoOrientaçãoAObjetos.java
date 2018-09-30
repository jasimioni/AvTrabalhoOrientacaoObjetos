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
public class AVTrabalhoOrientaçãoAObjetos {  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor professor = new Professor("Amanda Souza", (long) 16409504942L, (double) 6800, "Doutorado");
        Aluno     aluno     = new Aluno("Marcos Silva", (long) 16409504942L, (int) 175689458, (int) 3);
    
        System.out.printf("Professor:\nNome: %s\nCPF: %d\nFormação: %s\nSalário: %.2f\n\n", 
                           professor.getNome(), professor.getCpf(), professor.getFormacao(), professor.getSalario());
     
        System.out.printf("Aluno:\nNome: %s\nCPF: %d\nRA: %d\nPeríodo: %d\n\n", 
                           aluno.getNome(), aluno.getCpf(), aluno.getRa(), aluno.getPeriodo());
           
        
    
    }
    
    
    
}
