package aplicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import prova.Clinica;
import prova.Consulta;
import prova.EAtendimentoNaoRegistradoException;
import prova.Paciente;

public class Main {
    public static void main(String[] args) throws EAtendimentoNaoRegistradoException {
        Clinica clinica = new Clinica("Senai Saúde", "Av. Dendezeiros, 188, Bonfim", "000000000", 75, 150);
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("----------- Clínica " + clinica.getNome() + "----------------------");
            System.out.println(" ");
            System.out.println("Atendimento, digite 1");
            System.out.println("Consultar média de valores, digite 2");
            System.out.println("Alteração de valores, digite 3");
            System.out.println("Cancelar operação, digite 4");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Tipo de consulta desejado? Simples (1); Checkup(2)");
                    int tipoConsulta = teclado.nextInt();
                    Paciente paciente = new Paciente("123456789", "Kaua", LocalDate.now(), "Senai");
                    Consulta consulta = new Consulta(paciente, LocalDate.MAX, clinica, opcao);
                    ArrayList<Consulta> consultas = null;
                    clinica.getRealizarAtendimento(tipoConsulta, paciente, tipoConsulta, consultas);
                }

                case 2 -> clinica.getValorTotal();

                case 3 -> {
                    System.out.println("Qual tipo de consulta será alterado? Simples (1); Checkup(2)");
                    int opcaoConsulta = teclado.nextInt();
                    switch (opcaoConsulta) {
                        case 1 -> {
                            System.out.println("Informe o novo valor para consulta simples:");
                            int novoValor = teclado.nextInt();
                            clinica.setValorConsultaSimples(novoValor);
                    }

                        case 2 -> {
                            System.out.println("Informe o novo valor para consulta checkup:");
                            int novoValorCheckup = teclado.nextInt();
                            clinica.setValorConsultaCheckup(novoValorCheckup);
                    }
                    }
                }
            }
        }
    }
}