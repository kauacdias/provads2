/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Paciente {
    private String CPF;
    private String nome;
    private LocalDate dataNascimento;
    private String planoDeSaude;

    public Paciente(String CPF, String nome, LocalDate dataNascimento, String planoDeSaude) {
        this.CPF = CPF;
        this.nome = nome;
        
        if (dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new EValorInvalidoException();
        }
        
        this.planoDeSaude = planoDeSaude;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }    
    
}
