import javax.swing.JOptionPane;

public class ContratarServicos extends javax.swing.JFrame {
    
    public void removendoInformacoes() {
        nomeServico.setText("");
        idServico.setText("");
        descriçãoServico.setText("");
        valorServico.setText("");
    }
    
    public ContratarServicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollBar1 = new javax.swing.JScrollBar();
        jRadioButton1 = new javax.swing.JRadioButton();
        cpfUsuario = new javax.swing.JFormattedTextField();
        telefoneUsuario = new javax.swing.JFormattedTextField();
        JLabel4 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        cidadeUsuario = new javax.swing.JComboBox<>();
        JLabel5 = new javax.swing.JLabel();
        at = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        senhaUsuario = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLabel = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        nomeServico = new javax.swing.JTextField();
        idServico = new javax.swing.JTextField();
        cadastrarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        JLabel7 = new javax.swing.JLabel();
        descriçãoServico = new javax.swing.JTextField();
        valorServico = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        try {
            cpfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefoneUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLabel4.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JLabel4.setText("Telefone:");

        JLabel2.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JLabel2.setText("CPF:");

        cidadeUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arapiraca", "Batalha", "Campo Alegre", "Coité do Noia", "Coruripe", "Craibas", "Delmiro Gouveia", "Jacaré dos Homens", "Jaramataia", "Junqueiro", "Maceió", "Maragogi", "Marechal Deodoro", "Pallet", "Palmeira do Índios", "Pão de Açúcar", "Penedo", "Piranhas", "Rio Largo", "São Miguel dos Campos", "Taquarana", "Teotônio Vilela", "Traipu", "União dos Palmares" }));
        cidadeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeUsuarioActionPerformed(evt);
            }
        });

        JLabel5.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JLabel5.setText("Cidade:");

        at.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        at.setForeground(new java.awt.Color(255, 255, 255));
        at.setText("Atendente");
        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuarioCadastro.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(32, 27, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel.setForeground(new java.awt.Color(255, 255, 255));
        JLabel.setText("Produto:");
        jPanel1.add(JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        JLabel3.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JLabel3.setText("Id:");
        jPanel1.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));
        jPanel1.add(nomeServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 180, 30));
        jPanel1.add(idServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, 30));

        cadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarProduto.setText("Cadastrar");
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 230, 30));

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Produtos");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 30, 620, -1));

        JLabel1.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel1.setText("Descrição:");
        jPanel1.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, 20));

        JLabel7.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel7.setForeground(new java.awt.Color(255, 255, 255));
        JLabel7.setText("Preço:");
        jPanel1.add(JLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, 20));
        jPanel1.add(descriçãoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 180, 30));
        jPanel1.add(valorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        String nome = nomeServico.getText();
        int id = Integer.parseInt(idServico.getText());
        String descrição = descriçãoServico.getText();
        double valor = Double.parseDouble(valorServico.getText());
        
        Servico servico = new Servico(id, nome, descrição, valor);
        ServicoDAO servicoBanco = new ServicoDAO();

        servicoBanco.inserirServico(servico);
        
        JOptionPane.showMessageDialog(null, "Serviço contratado com sucesso!");
        
        removendoInformacoes();
        
        dispose();
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        
    }//GEN-LAST:event_atActionPerformed

    private void cidadeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JRadioButton at;
    private javax.swing.JButton cadastrarProduto;
    private javax.swing.JComboBox<String> cidadeUsuario;
    private javax.swing.JFormattedTextField cpfUsuario;
    private javax.swing.JTextField descriçãoServico;
    private javax.swing.JTextField idServico;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeServico;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JFormattedTextField telefoneUsuario;
    private javax.swing.JTextField valorServico;
    // End of variables declaration//GEN-END:variables
}