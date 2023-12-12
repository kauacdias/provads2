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
public class Checkup extends Consulta{
    private double valorAdicional;
    
    public Checkup(Paciente paciente, LocalDate data, Clinica clinica, double valor) {
        super(paciente, data, clinica, valor);
        
        if (valorAdicional > 0) {
            this.valorAdicional = valorAdicional;
        } else {
            throw new EValorInvalidoException();
        }
    }

    public double getValorAdicional() {
        if ("PlanSenai".equals(super.getPaciente().getPlanoDeSaude())) {
            this.valorAdicional = this.valorAdicional - this.valorAdicional*0.15;
        }
        return valorAdicional;
    }

    public double getConsultaValor() {
        return super.getValor() + valorAdicional;
    }
    
        
}
