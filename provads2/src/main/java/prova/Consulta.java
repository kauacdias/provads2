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
public class Consulta {
    private Paciente paciente;
    private LocalDate data;
    private Clinica clinica;
    protected double valor;

    public Consulta(Paciente paciente, LocalDate data, Clinica clinica, double valor) {
        this.paciente = paciente;
              
        if (data != null) {
            this.data = data;
        } else {
            throw new EValorInvalidoException();
        }
        
        this.clinica = clinica;
        
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new EValorInvalidoException();
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getData() {
        return data;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public double getValor() {
        return valor;
    }
    
    
    
    
}
