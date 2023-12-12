/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Clinica {
    private String nome;
    private String endereco;
    private String cnpj;
    private double valorConsultaSimples;
    private double valorConsultaCheckup;
    ArrayList<Consulta> consultas = new ArrayList();
    private int tipoConsulta;

    public Clinica(String nome, String endereco, String cnpj, double valorConsultaSimples, double valorConsultaCheckup) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        
        if (valorConsultaSimples >= 0) {
            this.valorConsultaSimples = valorConsultaSimples;
        } else {
            throw new EValorInvalidoException();
        }        
        
        if (valorConsultaCheckup >= 0) {
            this.valorConsultaCheckup = valorConsultaCheckup;
        } else {
            throw new EValorInvalidoException();
        }         
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getValorConsultaSimples() {
        return valorConsultaSimples;
    }

    public double getValorConsultaCheckup() {
        return valorConsultaCheckup;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setValorConsultaSimples(double valorConsultaSimples) {
        if (valorConsultaSimples >= 0) {
            this.valorConsultaSimples = valorConsultaSimples;
        } else {
            throw new EValorInvalidoException();
        }  
    }

    public void setValorConsultaCheckup(double valorConsultaCheckup) {
        if (valorConsultaCheckup >= 0) {
            this.valorConsultaCheckup = valorConsultaCheckup;
        } else {
            throw new EValorInvalidoException();
        }     
    }
    
    public double getValorTotal(){
        return getValorConsultaSimples()+ getValorConsultaCheckup();
    }
    
    public double getRealizarAtendimento(int tipoConsulta, Paciente paciente, int atendimentoId, ArrayList<Consulta> consultas) throws EAtendimentoNaoRegistradoException{
        
        if (this.tipoConsulta == 1) {
            return getValorConsultaSimples();
        } else if (tipoConsulta == 2){
            return getValorConsultaCheckup();
        } else {
            throw new EAtendimentoNaoRegistradoException();
        }
    }    
    

}
