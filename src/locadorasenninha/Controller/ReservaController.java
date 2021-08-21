package locadorasenninha.Controller;

import locadorasenninha.Model.Carro;
import locadorasenninha.Model.Cliente;
import locadorasenninha.Model.Funcionario;
import locadorasenninha.Model.Locadora;

import java.util.Calendar;

public class ReservaController {
    public boolean VerificaGerarReserva(Calendar dataEmissao, Calendar dataRetirada, Calendar dataDevolucao, String status, Carro carro, Cliente cliente, Funcionario funcionario, double valorTotalDiaria, double valorTotalAtraso, double valorTotalGeral, int numeroReserva) throws Exception {
        if (numeroReserva > 1 && numeroReserva < 99999)
        {
            if (dataEmissao != null && dataRetirada != null && dataDevolucao != null)
            {
                if (carro != null)
                {
                    if (cliente != null)
                    {
                        if (funcionario != null)
                        {
                            return Locadora.gerarReserva(dataEmissao, dataRetirada, dataDevolucao, status, carro, cliente, funcionario, valorTotalDiaria, valorTotalAtraso, valorTotalGeral, numeroReserva); //chama a funcao gerarReserva da Locadora (nao sei pq pede pra ser static)
                            /*gerarReserva(Calendar dataEmissao, Calendar dataRetirada, Calendar dataDevolucao, String status, Carro carro, Cliente cliente, Funcionario funcionario, double valorTotalDiaria, double valorTotalAtraso, double valorTotalGeral, int numeroReserva)*/
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean VerificaCancelarReserva(int numeroReserva)
    {
        if (numeroReserva > 0 && numeroReserva < 99999)
        {
            return Locadora.cancelarReserva(numeroReserva); //Pede static
        }
        return false;
    }

    public boolean VerificaVerificarReserva(String cpf)
    {
        if (cpf != null && cpf.length() == 11)
        {
            return Locadora.verificarReserva(cpf); //Pede static
        }
        return false;
    }
}