package locadorasenninha.Controller;

import locadorasenninha.Model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

public class LocadoraController {

    public Locadora locadora;

    public LocadoraController(Locadora locadora) {
        this.locadora = locadora;
    }

//Carro

    public boolean verificaCadastrarCarro(String modelo, String placa, String cor, String chassi, String passageiros,
                                          String bagagem, double taxaDiaria, double taxaAtraso)
    {
        if (modelo != null && modelo.length() > 0 && modelo.length() < 30)
        {
            if (placa != null && placa.length() == 7)
            {
                if (cor != null && cor.length() > 0 && cor.length() < 30)
                {
                    if (bagagem !=null && Integer.parseInt(bagagem) > 0 && Integer.parseInt(bagagem) <= 9999)
                    {
                        if (taxaDiaria > 0 && taxaDiaria <= 9999)
                        {
                            if (taxaAtraso > 0 && taxaAtraso <= 9999)
                            {
                                if(passageiros != null && Integer.parseInt(passageiros) > 0)
                                {
                                    return Locadora.cadastrarCarro(modelo, placa, cor, chassi, passageiros, bagagem, taxaDiaria, taxaAtraso);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean verificaDevolverCarro(Carro carro, Reserva reserva, Cliente cliente)
    {
        if (carro != null && reserva != null && cliente != null)
        {
            locadora.devolverCarro(carro, reserva, cliente);
            return true;
        }
        return false;
    }

//Cliente
    public boolean verificaCadastrarCliente(String nome, String cpf, String dataDeNascimento, String email,
                                    String endereco, String cep, String telefone, String senha){

        if (nome != null && nome.length() > 0 && nome.length() < 100 && cpf != null && cpf.length() == 14
                && dataDeNascimento != null && dataDeNascimento.length() == 10 && email != null
                && email.length() > 0 && email.length() < 100 && endereco != null && endereco.length() > 0
                && endereco.length() < 300 && cep != null && cep.length() == 9 && telefone!= null
                && telefone.length() == 16 &&  senha != null && senha.length() < 30)
        {
            return locadora.cadastrarCliente(nome, cpf, dataDeNascimento, email, endereco, cep, telefone, senha);
        }
        return false;
    }

    public boolean verificaLoginCliente(String cpf, String senha){
        if(cpf != null && cpf.length() == 14 && senha != null && senha.length() < 30){
            return locadora.loginCliente(cpf, senha);
        }
    return false;
}

//Reserva
    public boolean verificaFazerReserva(int numeroReserva, String dataEmissao, String dataRetirada,
                                        String dataDevolucao, Carro carro, Cliente cliente,
                                        Funcionario funcionario, double valorTotalDiaria, double valorTotalAtraso,
                                        double valorTotalGeral) throws ParseException {
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
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

                            Calendar dataEmissaoCal = Calendar.getInstance();
                            Calendar dataRetiradaCal = Calendar.getInstance();
                            Calendar dataDevolucaoCal = Calendar.getInstance();

                            try{
                                dataEmissaoCal.setTime(sdf.parse(dataEmissao));
                                dataRetiradaCal.setTime(sdf.parse(dataRetirada));
                                dataDevolucaoCal.setTime(sdf.parse(dataDevolucao));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            locadora.fazerReserva(numeroReserva, dataEmissaoCal, dataRetiradaCal, dataDevolucaoCal, carro,
                                    cliente, funcionario, valorTotalDiaria, valorTotalAtraso, valorTotalGeral);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean verificaCancelarReserva(Carro carro, Reserva reserva, Cliente cliente){
        if (carro != null && reserva != null && cliente != null)
        {
            locadora.cancelarReserva(carro, reserva, cliente);
            return true;
        }
        return false;
    }

    public boolean verificaDataReserva(String dataRetirada, String dataDevolucao) throws ParseException {
        if (dataRetirada != null && dataRetirada.length() > 0 && dataDevolucao != null && dataDevolucao.length() > 0)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Calendar dataDevolucaoCal = Calendar.getInstance();
            Calendar dataRetiradaCal = Calendar.getInstance();
            try{
                dataDevolucaoCal.setTime(sdf.parse(dataDevolucao));
                dataRetiradaCal.setTime(sdf.parse(dataRetirada));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Calendar atualTime = Calendar.getInstance();
            atualTime.getTime();

            if (dataRetiradaCal.after(atualTime) && dataDevolucaoCal.after(dataRetiradaCal))
            {
                return true;
            }
        }
        return false;
    }

//Funcionario
    public boolean verificaCadastrarFuncionario(String nome, String cpf, String dataDeNascimento,
                                        String endereco, String email, String cep, String telefone, String senha){
        if(nome != null && nome.length() > 0 && nome.length() < 100 && cpf != null && cpf.length() == 14 && dataDeNascimento != null &&
                dataDeNascimento.length() == 10 && endereco != null && endereco.length() > 0 && endereco.length() < 300 && email != null && email.length() > 0 &&
                email.length() < 100 && cep != null && cep.length() == 9 && telefone!= null && telefone.length() == 16
                && senha != null && senha.length() < 30)
        {
            Funcionario funcionario = new Funcionario (nome, cpf, dataDeNascimento, endereco, email, cep, telefone, senha);
            return locadora.cadastrarFuncionario(funcionario);

        }
        return false;
    }

    public boolean verificaLoginFuncionario(String cpf, String senha){
        if(cpf != null && cpf.length() == 14 && senha != null && senha.length() < 30){
            return locadora.loginFuncionario(cpf,senha);
        }
        return false;
    }

    public String[][] atualizaTabelaClientes(){
        return locadora.dadosClientes();
    }

    public String[][] atualizaTabelaFuncionarios(){
        return locadora.dadosClientes();
    }

    public String[][] atualizaTabelaReservas(){
        return locadora.dadosReservas();
    }

    public String[][] atualizaTabelaCarros(){
        return locadora.dadosCarros();
    }        

    public int qtdeClientes(){
        return locadora.qtdeClientes();
    }

    public int qtdeCarros(){
        return locadora.qtdeCarros();
    }

    public int qtdeReservas(){
        return locadora.qtdeReservas();
    }

    public int qtdeFuncionarios(){
        return locadora.qtdeFuncionarios();
    }

    public String[] exibirCliente(String cpf){
        Cliente cliente = null;

        for(int i=0;i<locadora.listaClientes.size();i++){ 
            if((locadora.listaClientes).get(i).getCpf() == cpf){
                cliente = (locadora.listaClientes).get(i); //Retorna o cliente
            }
        }
        String dados[] = new String[8];

        dados[0] = cliente.getNome();
        dados[1] = cliente.getDataDeNascimento();
        dados[2] = cliente.getCpf();
        dados[3] = cliente.getTelefone();
        dados[4] = cliente.getEndereco();
        dados[5] = cliente.getCep();
        dados[6] = cliente.getEmail();
        dados[7] = cliente.getSenha();

        return dados;
    }

    public String[] exibirFuncionario(String cpf){
        Funcionario funcionario = null;

        for(int i=0;i<locadora.listaFuncionarios.size();i++){
            if(Objects.equals((locadora.listaFuncionarios).get(i).getCpf(), cpf)){
                funcionario = (locadora.listaFuncionarios).get(i); //Retorna o cliente
            }
        }
        String dados[] = new String[8];

        dados[0] = funcionario.getNome();
        dados[1] = funcionario.getDataDeNascimento();
        dados[2] = funcionario.getCpf();
        dados[3] = funcionario.getTelefone();
        dados[4] = funcionario.getEndereco();
        dados[5] = funcionario.getCep();
        dados[6] = funcionario.getEmail();
        dados[7] = funcionario.getSenha();

        return dados;
    }

    public String[] exibirReserva(String numeroReserva){
        Reserva reserva = null;

        ArrayList<Reserva> reservas = locadora.getReservas();

        for(int i=0;i<reservas.size();i++){
            if(Objects.equals((reservas).get(i).getNumeroReserva(), numeroReserva)){
                reserva = (reservas).get(i); //Retorna o cliente
            }
        }
        String dados[] = new String[14];

        Carro carro = reserva.getCarro();

        dados[0] = carro.getModelo();
        dados[1] = carro.getPlaca();
        dados[2] = carro.getCor();
        dados[3] = String.valueOf(carro.getTaxaDiaria());
        dados[4] = String.valueOf(carro.getTaxaAtraso());
        dados[5] = carro.getPassageiros();
        dados[6] = carro.getBagagem();
        dados[7] = String.valueOf(reserva.getValorTotalDiaria());
        dados[8] = String.valueOf(reserva.getValorTotalAtraso());
        dados[9] = String.valueOf(reserva.getValorTotalGeral());

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        String dataEmissaoString = formato.format(reserva.getDataEmissao().getTime());
        String dataRetiradaString = formato.format(reserva.getDataRetirada().getTime());
        String dataDevolucaoString = formato.format(reserva.getDataDevolucao().getTime());

        dados[10] = dataEmissaoString;
        dados[11] = dataRetiradaString;
        dados[12] = reserva.getStatus();
        dados[13] = dataDevolucaoString;

        return dados;
    }
}