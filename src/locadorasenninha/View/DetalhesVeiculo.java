package locadorasenninha.View;

import javax.swing.JOptionPane;


public class DetalhesVeiculo extends javax.swing.JFrame {

    /**
     * Creates new form DetalhesVeiculo
     */
    public DetalhesVeiculo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelLocadora = new javax.swing.JPanel();
        labelLocadora = new javax.swing.JLabel();
        labelDetalhesVeiculo = new javax.swing.JLabel();
        painelSuporteDetalhesVeiculo = new javax.swing.JPanel();
        labelModeloCarroDetalhesVeiculo = new javax.swing.JLabel();
        painelModeloCarroDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelModeloCarroFuncionario = new javax.swing.JLabel();
        painelCorDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelCorFuncionario = new javax.swing.JLabel();
        labelPlacaDetalhesVeiculo = new javax.swing.JLabel();
        painelPlacaDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelPlacaFuncionario = new javax.swing.JLabel();
        labelCorDetalhesVeiculo = new javax.swing.JLabel();
        painelTaxaDiariaDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelTaxaDiariaFuncionario = new javax.swing.JLabel();
        painelTaxaDiariaAtrasoDetalhesVeiculo = new javax.swing.JPanel();
        labelTaxaDiariaAtrasoFuncionario = new javax.swing.JLabel();
        labelTaxaDiariaDetalhesVeiculo = new javax.swing.JLabel();
        labelTaxaDiariaAtrasoDetalhesVeiculo = new javax.swing.JLabel();
        painelValorTotalDiariasDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelValorTotalDiariasFuncionario = new javax.swing.JLabel();
        labelValorTotalDiariasDetalhesVeiculo = new javax.swing.JLabel();
        labelValorTotalAluguelDetalhesVeiculo = new javax.swing.JLabel();
        painelValorTotalDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelTotalAluguelFuncionario = new javax.swing.JLabel();
        painelDataEmissaoDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelDataEmissaoFuncionario = new javax.swing.JLabel();
        labelDataEmissaoDetalhesVeiculo = new javax.swing.JLabel();
        painelImagemCarroDetalhesVeiculo = new javax.swing.JPanel();
        labelImagemCarroDetalhesVeiculo = new javax.swing.JLabel();
        painelCapacidadePassageirosDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelCapacidadePassageirosFuncionario = new javax.swing.JLabel();
        painelCapacidadeBagagemDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelCapacidadeBagagensFuncionario = new javax.swing.JLabel();
        labelCapadidadePassageirosDetalhesVeiculo = new javax.swing.JLabel();
        labelCapacidadeBagagemDetalhesVeiculo = new javax.swing.JLabel();
        labelAtendenteDetalhesVeiculo = new javax.swing.JLabel();
        comboBoxDetalhesVeiculo = new javax.swing.JComboBox<>();
        checkBoxConfirmarDetalhesVeiculo = new javax.swing.JCheckBox();
        buttonRetornarCatalogo = new javax.swing.JButton();
        painelDataDevolucaoDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelDataDevolucaoFuncionario = new javax.swing.JLabel();
        labelDataDevolucaoDetalhesVeiculo = new javax.swing.JLabel();
        painelDataRetiradaDetalhesVeiculo = new javax.swing.JPanel();
        labelPainelDataRetiradaFuncionario = new javax.swing.JLabel();
        labelDataRetiradaDetalhesVeiculo = new javax.swing.JLabel();
        buttonFecharReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

        painelLocadora.setBackground(new java.awt.Color(192, 2, 0));
        painelLocadora.setPreferredSize(new java.awt.Dimension(800, 40));

        labelLocadora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLocadora.setForeground(new java.awt.Color(255, 255, 255));
        labelLocadora.setText("LOCADORA SENNINHA");

        javax.swing.GroupLayout painelLocadoraLayout = new javax.swing.GroupLayout(painelLocadora);
        painelLocadora.setLayout(painelLocadoraLayout);
        painelLocadoraLayout.setHorizontalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
        );
        painelLocadoraLayout.setVerticalGroup(
            painelLocadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLocadora, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        labelDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelDetalhesVeiculo.setText("Detalhes do Veículo:");

        painelSuporteDetalhesVeiculo.setBackground(new java.awt.Color(192, 2, 0));

        labelModeloCarroDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelModeloCarroDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelModeloCarroDetalhesVeiculo.setText("Modelo do Carro:");

        painelModeloCarroDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        painelModeloCarroDetalhesVeiculo.setPreferredSize(new java.awt.Dimension(230, 25));

        labelPainelModeloCarroFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelModeloCarroFuncionario.setText("Modelo do Carro");

        javax.swing.GroupLayout painelModeloCarroDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelModeloCarroDetalhesVeiculo);
        painelModeloCarroDetalhesVeiculo.setLayout(painelModeloCarroDetalhesVeiculoLayout);
        painelModeloCarroDetalhesVeiculoLayout.setHorizontalGroup(
            painelModeloCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelModeloCarroDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelModeloCarroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelModeloCarroDetalhesVeiculoLayout.setVerticalGroup(
            painelModeloCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelModeloCarroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelCorDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCorFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCorFuncionario.setText("Cor");

        javax.swing.GroupLayout painelCorDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelCorDetalhesVeiculo);
        painelCorDetalhesVeiculo.setLayout(painelCorDetalhesVeiculoLayout);
        painelCorDetalhesVeiculoLayout.setHorizontalGroup(
            painelCorDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCorDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCorFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCorDetalhesVeiculoLayout.setVerticalGroup(
            painelCorDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCorFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelPlacaDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPlacaDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelPlacaDetalhesVeiculo.setText("Placa:");

        painelPlacaDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelPlacaFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelPlacaFuncionario.setText("Placa");

        javax.swing.GroupLayout painelPlacaDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelPlacaDetalhesVeiculo);
        painelPlacaDetalhesVeiculo.setLayout(painelPlacaDetalhesVeiculoLayout);
        painelPlacaDetalhesVeiculoLayout.setHorizontalGroup(
            painelPlacaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPlacaDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelPlacaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPlacaDetalhesVeiculoLayout.setVerticalGroup(
            painelPlacaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelPlacaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelCorDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCorDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCorDetalhesVeiculo.setText("Cor:");

        painelTaxaDiariaDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTaxaDiariaFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelTaxaDiariaFuncionario.setText("Taxa Diária");

        javax.swing.GroupLayout painelTaxaDiariaDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelTaxaDiariaDetalhesVeiculo);
        painelTaxaDiariaDetalhesVeiculo.setLayout(painelTaxaDiariaDetalhesVeiculoLayout);
        painelTaxaDiariaDetalhesVeiculoLayout.setHorizontalGroup(
            painelTaxaDiariaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTaxaDiariaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaDiariaDetalhesVeiculoLayout.setVerticalGroup(
            painelTaxaDiariaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTaxaDiariaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelTaxaDiariaAtrasoDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelTaxaDiariaAtrasoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelTaxaDiariaAtrasoFuncionario.setText("Taxa Diária");

        javax.swing.GroupLayout painelTaxaDiariaAtrasoDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelTaxaDiariaAtrasoDetalhesVeiculo);
        painelTaxaDiariaAtrasoDetalhesVeiculo.setLayout(painelTaxaDiariaAtrasoDetalhesVeiculoLayout);
        painelTaxaDiariaAtrasoDetalhesVeiculoLayout.setHorizontalGroup(
            painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTaxaDiariaAtrasoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTaxaDiariaAtrasoDetalhesVeiculoLayout.setVerticalGroup(
            painelTaxaDiariaAtrasoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTaxaDiariaAtrasoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelTaxaDiariaDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaDetalhesVeiculo.setText("Taxa Diária:");

        labelTaxaDiariaAtrasoDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTaxaDiariaAtrasoDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelTaxaDiariaAtrasoDetalhesVeiculo.setText("Taxa Diária Atraso:");

        painelValorTotalDiariasDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelValorTotalDiariasFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelValorTotalDiariasFuncionario.setText("Valor Total Diárias");

        javax.swing.GroupLayout painelValorTotalDiariasDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelValorTotalDiariasDetalhesVeiculo);
        painelValorTotalDiariasDetalhesVeiculo.setLayout(painelValorTotalDiariasDetalhesVeiculoLayout);
        painelValorTotalDiariasDetalhesVeiculoLayout.setHorizontalGroup(
            painelValorTotalDiariasDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalDiariasDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelValorTotalDiariasFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelValorTotalDiariasDetalhesVeiculoLayout.setVerticalGroup(
            painelValorTotalDiariasDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelValorTotalDiariasFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelValorTotalDiariasDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValorTotalDiariasDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotalDiariasDetalhesVeiculo.setText("Valor Total Diárias:");

        labelValorTotalAluguelDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValorTotalAluguelDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotalAluguelDetalhesVeiculo.setText("Valor Total do Aluguel:");

        painelValorTotalDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelTotalAluguelFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelTotalAluguelFuncionario.setText("Valor total do Aluguel");

        javax.swing.GroupLayout painelValorTotalDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelValorTotalDetalhesVeiculo);
        painelValorTotalDetalhesVeiculo.setLayout(painelValorTotalDetalhesVeiculoLayout);
        painelValorTotalDetalhesVeiculoLayout.setHorizontalGroup(
            painelValorTotalDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorTotalDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelTotalAluguelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelValorTotalDetalhesVeiculoLayout.setVerticalGroup(
            painelValorTotalDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelTotalAluguelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelDataEmissaoDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelDataEmissaoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelDataEmissaoFuncionario.setText("Data de Emissão");

        javax.swing.GroupLayout painelDataEmissaoDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelDataEmissaoDetalhesVeiculo);
        painelDataEmissaoDetalhesVeiculo.setLayout(painelDataEmissaoDetalhesVeiculoLayout);
        painelDataEmissaoDetalhesVeiculoLayout.setHorizontalGroup(
            painelDataEmissaoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataEmissaoDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataEmissaoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataEmissaoDetalhesVeiculoLayout.setVerticalGroup(
            painelDataEmissaoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataEmissaoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelDataEmissaoDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataEmissaoDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelDataEmissaoDetalhesVeiculo.setText("Data de Emissão:");

        painelImagemCarroDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelImagemCarroDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelImagemCarroDetalhesVeiculo);
        painelImagemCarroDetalhesVeiculo.setLayout(painelImagemCarroDetalhesVeiculoLayout);
        painelImagemCarroDetalhesVeiculoLayout.setHorizontalGroup(
            painelImagemCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelImagemCarroDetalhesVeiculoLayout.setVerticalGroup(
            painelImagemCarroDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelImagemCarroDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelImagemCarroDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelImagemCarroDetalhesVeiculo.setText("Imagem do Carro:");

        painelCapacidadePassageirosDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCapacidadePassageirosFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCapacidadePassageirosFuncionario.setText("Capacidade de Passageiros");

        javax.swing.GroupLayout painelCapacidadePassageirosDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelCapacidadePassageirosDetalhesVeiculo);
        painelCapacidadePassageirosDetalhesVeiculo.setLayout(painelCapacidadePassageirosDetalhesVeiculoLayout);
        painelCapacidadePassageirosDetalhesVeiculoLayout.setHorizontalGroup(
            painelCapacidadePassageirosDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadePassageirosDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCapacidadePassageirosFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCapacidadePassageirosDetalhesVeiculoLayout.setVerticalGroup(
            painelCapacidadePassageirosDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCapacidadePassageirosFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        painelCapacidadeBagagemDetalhesVeiculo.setBackground(new java.awt.Color(255, 255, 255));

        labelPainelCapacidadeBagagensFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        labelPainelCapacidadeBagagensFuncionario.setText("Capacidade de Bagagens");

        javax.swing.GroupLayout painelCapacidadeBagagemDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelCapacidadeBagagemDetalhesVeiculo);
        painelCapacidadeBagagemDetalhesVeiculo.setLayout(painelCapacidadeBagagemDetalhesVeiculoLayout);
        painelCapacidadeBagagemDetalhesVeiculoLayout.setHorizontalGroup(
            painelCapacidadeBagagemDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCapacidadeBagagemDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelCapacidadeBagagensFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelCapacidadeBagagemDetalhesVeiculoLayout.setVerticalGroup(
            painelCapacidadeBagagemDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelCapacidadeBagagensFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelCapadidadePassageirosDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapadidadePassageirosDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCapadidadePassageirosDetalhesVeiculo.setText("Capacidade de Passageiros:");

        labelCapacidadeBagagemDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCapacidadeBagagemDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelCapacidadeBagagemDetalhesVeiculo.setText("Capacidade de Bagagens:");

        labelAtendenteDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAtendenteDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        labelAtendenteDetalhesVeiculo.setText("Atendente:");

        comboBoxDetalhesVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario1", "Funcionario2", "Funcionario3", "Funcionario4" }));

        checkBoxConfirmarDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxConfirmarDetalhesVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxConfirmarDetalhesVeiculo.setText("Confirmar realização da reserva!");
        checkBoxConfirmarDetalhesVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxConfirmarDetalhesVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSuporteDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelSuporteDetalhesVeiculo);
        painelSuporteDetalhesVeiculo.setLayout(painelSuporteDetalhesVeiculoLayout);
        painelSuporteDetalhesVeiculoLayout.setHorizontalGroup(
            painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                    .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(painelDataEmissaoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelDataEmissaoDetalhesVeiculo)
                                        .addComponent(labelCapadidadePassageirosDetalhesVeiculo)
                                        .addComponent(painelCapacidadePassageirosDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelValorTotalAluguelDetalhesVeiculo)
                                                .addComponent(painelValorTotalDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelValorTotalDiariasDetalhesVeiculo)
                                                .addComponent(painelValorTotalDiariasDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                            .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelCapacidadeBagagemDetalhesVeiculo)
                                                .addComponent(painelCapacidadeBagagemDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addComponent(labelAtendenteDetalhesVeiculo)
                                .addComponent(comboBoxDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkBoxConfirmarDetalhesVeiculo))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addComponent(labelImagemCarroDetalhesVeiculo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(painelImagemCarroDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModeloCarroDetalhesVeiculo)
                            .addComponent(painelModeloCarroDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelPlacaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPlacaDetalhesVeiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCorDetalhesVeiculo)
                            .addComponent(painelCorDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painelTaxaDiariaDetalhesVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTaxaDiariaDetalhesVeiculo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelTaxaDiariaAtrasoDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addComponent(labelTaxaDiariaAtrasoDetalhesVeiculo)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        painelSuporteDetalhesVeiculoLayout.setVerticalGroup(
            painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModeloCarroDetalhesVeiculo)
                    .addComponent(labelPlacaDetalhesVeiculo)
                    .addComponent(labelCorDetalhesVeiculo)
                    .addComponent(labelTaxaDiariaDetalhesVeiculo)
                    .addComponent(labelTaxaDiariaAtrasoDetalhesVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPlacaDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCorDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTaxaDiariaDetalhesVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTaxaDiariaAtrasoDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelModeloCarroDetalhesVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapadidadePassageirosDetalhesVeiculo)
                    .addComponent(labelCapacidadeBagagemDetalhesVeiculo)
                    .addComponent(labelImagemCarroDetalhesVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelCapacidadeBagagemDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelCapacidadePassageirosDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addComponent(labelDataEmissaoDetalhesVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(painelDataEmissaoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelSuporteDetalhesVeiculoLayout.createSequentialGroup()
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelValorTotalAluguelDetalhesVeiculo)
                                    .addComponent(labelValorTotalDiariasDetalhesVeiculo))
                                .addGap(6, 6, 6)
                                .addGroup(painelSuporteDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelValorTotalDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(painelValorTotalDiariasDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAtendenteDetalhesVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(checkBoxConfirmarDetalhesVeiculo))
                    .addComponent(painelImagemCarroDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        buttonRetornarCatalogo.setBackground(new java.awt.Color(192, 2, 0));
        buttonRetornarCatalogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRetornarCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        buttonRetornarCatalogo.setText("RETORNAR AO CATÁLOGO");
        buttonRetornarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarCatalogoActionPerformed(evt);
            }
        });

        painelDataDevolucaoDetalhesVeiculo.setBackground(new java.awt.Color(192, 2, 0));

        labelPainelDataDevolucaoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelPainelDataDevolucaoFuncionario.setText("Data de Devolução");

        javax.swing.GroupLayout painelDataDevolucaoDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelDataDevolucaoDetalhesVeiculo);
        painelDataDevolucaoDetalhesVeiculo.setLayout(painelDataDevolucaoDetalhesVeiculoLayout);
        painelDataDevolucaoDetalhesVeiculoLayout.setHorizontalGroup(
            painelDataDevolucaoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataDevolucaoDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataDevolucaoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataDevolucaoDetalhesVeiculoLayout.setVerticalGroup(
            painelDataDevolucaoDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataDevolucaoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelDataDevolucaoDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataDevolucaoDetalhesVeiculo.setForeground(new java.awt.Color(192, 2, 0));
        labelDataDevolucaoDetalhesVeiculo.setText("Data para Devolução:");

        painelDataRetiradaDetalhesVeiculo.setBackground(new java.awt.Color(192, 2, 0));

        labelPainelDataRetiradaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        labelPainelDataRetiradaFuncionario.setText("Data de Retirada");

        javax.swing.GroupLayout painelDataRetiradaDetalhesVeiculoLayout = new javax.swing.GroupLayout(painelDataRetiradaDetalhesVeiculo);
        painelDataRetiradaDetalhesVeiculo.setLayout(painelDataRetiradaDetalhesVeiculoLayout);
        painelDataRetiradaDetalhesVeiculoLayout.setHorizontalGroup(
            painelDataRetiradaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataRetiradaDetalhesVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPainelDataRetiradaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDataRetiradaDetalhesVeiculoLayout.setVerticalGroup(
            painelDataRetiradaDetalhesVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPainelDataRetiradaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        labelDataRetiradaDetalhesVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataRetiradaDetalhesVeiculo.setForeground(new java.awt.Color(192, 2, 0));
        labelDataRetiradaDetalhesVeiculo.setText("Data Prevista para Retirada:");

        buttonFecharReserva.setBackground(new java.awt.Color(192, 2, 0));
        buttonFecharReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonFecharReserva.setForeground(new java.awt.Color(255, 255, 255));
        buttonFecharReserva.setText("FECHAR RESERVA");
        buttonFecharReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSuporteDetalhesVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelDataDevolucaoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataDevolucaoDetalhesVeiculo))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataRetiradaDetalhesVeiculo)
                            .addComponent(painelDataRetiradaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelDetalhesVeiculo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(buttonRetornarCatalogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonFecharReserva)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLocadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDetalhesVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataDevolucaoDetalhesVeiculo)
                    .addComponent(labelDataRetiradaDetalhesVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelDataDevolucaoDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelDataRetiradaDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSuporteDetalhesVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetornarCatalogo)
                    .addComponent(buttonFecharReserva))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRetornarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarCatalogoActionPerformed
        SelecionarCarro novatela = new SelecionarCarro();
        novatela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRetornarCatalogoActionPerformed

    private void buttonFecharReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharReservaActionPerformed
        if (checkBoxConfirmarDetalhesVeiculo.isSelected()){
           JOptionPane.showMessageDialog(null, "Reserva Confirmada!"); 
           ListaReservas novatela = new ListaReservas();
           novatela.setVisible(true);
           this.setVisible(false);    
        }
        else{
           JOptionPane.showMessageDialog(null, "Confirme sua reserva!"); 
        }
            
    }//GEN-LAST:event_buttonFecharReservaActionPerformed

    private void checkBoxConfirmarDetalhesVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxConfirmarDetalhesVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxConfirmarDetalhesVeiculoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhesVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFecharReserva;
    private javax.swing.JButton buttonRetornarCatalogo;
    private javax.swing.JCheckBox checkBoxConfirmarDetalhesVeiculo;
    private javax.swing.JComboBox<String> comboBoxDetalhesVeiculo;
    private javax.swing.JLabel labelAtendenteDetalhesVeiculo;
    private javax.swing.JLabel labelCapacidadeBagagemDetalhesVeiculo;
    private javax.swing.JLabel labelCapadidadePassageirosDetalhesVeiculo;
    private javax.swing.JLabel labelCorDetalhesVeiculo;
    private javax.swing.JLabel labelDataDevolucaoDetalhesVeiculo;
    private javax.swing.JLabel labelDataEmissaoDetalhesVeiculo;
    private javax.swing.JLabel labelDataRetiradaDetalhesVeiculo;
    private javax.swing.JLabel labelDetalhesVeiculo;
    private javax.swing.JLabel labelImagemCarroDetalhesVeiculo;
    private javax.swing.JLabel labelLocadora;
    private javax.swing.JLabel labelModeloCarroDetalhesVeiculo;
    private javax.swing.JLabel labelPainelCapacidadeBagagensFuncionario;
    private javax.swing.JLabel labelPainelCapacidadePassageirosFuncionario;
    private javax.swing.JLabel labelPainelCorFuncionario;
    private javax.swing.JLabel labelPainelDataDevolucaoFuncionario;
    private javax.swing.JLabel labelPainelDataEmissaoFuncionario;
    private javax.swing.JLabel labelPainelDataRetiradaFuncionario;
    private javax.swing.JLabel labelPainelModeloCarroFuncionario;
    private javax.swing.JLabel labelPainelPlacaFuncionario;
    private javax.swing.JLabel labelPainelTaxaDiariaFuncionario;
    private javax.swing.JLabel labelPainelTotalAluguelFuncionario;
    private javax.swing.JLabel labelPainelValorTotalDiariasFuncionario;
    private javax.swing.JLabel labelPlacaDetalhesVeiculo;
    private javax.swing.JLabel labelTaxaDiariaAtrasoDetalhesVeiculo;
    private javax.swing.JLabel labelTaxaDiariaAtrasoFuncionario;
    private javax.swing.JLabel labelTaxaDiariaDetalhesVeiculo;
    private javax.swing.JLabel labelValorTotalAluguelDetalhesVeiculo;
    private javax.swing.JLabel labelValorTotalDiariasDetalhesVeiculo;
    private javax.swing.JPanel painelCapacidadeBagagemDetalhesVeiculo;
    private javax.swing.JPanel painelCapacidadePassageirosDetalhesVeiculo;
    private javax.swing.JPanel painelCorDetalhesVeiculo;
    private javax.swing.JPanel painelDataDevolucaoDetalhesVeiculo;
    private javax.swing.JPanel painelDataEmissaoDetalhesVeiculo;
    private javax.swing.JPanel painelDataRetiradaDetalhesVeiculo;
    private javax.swing.JPanel painelImagemCarroDetalhesVeiculo;
    private javax.swing.JPanel painelLocadora;
    private javax.swing.JPanel painelModeloCarroDetalhesVeiculo;
    private javax.swing.JPanel painelPlacaDetalhesVeiculo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSuporteDetalhesVeiculo;
    private javax.swing.JPanel painelTaxaDiariaAtrasoDetalhesVeiculo;
    private javax.swing.JPanel painelTaxaDiariaDetalhesVeiculo;
    private javax.swing.JPanel painelValorTotalDetalhesVeiculo;
    private javax.swing.JPanel painelValorTotalDiariasDetalhesVeiculo;
    // End of variables declaration//GEN-END:variables
}
