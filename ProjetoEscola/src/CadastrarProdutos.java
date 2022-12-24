import javax.swing.JOptionPane;

public class CadastrarProdutos extends javax.swing.JFrame {
    
    public void removendoInformacoes() {
        produto.setText("");
        idProduto.setText("");
    }
    
    public CadastrarProdutos() {
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
        produto = new javax.swing.JTextField();
        idProduto = new javax.swing.JTextField();
        cadastrarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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
        jPanel1.add(JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 20));

        JLabel3.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JLabel3.setText("Id:");
        jPanel1.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));
        jPanel1.add(produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 30));
        jPanel1.add(idProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, 30));

        cadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarUsuario.setText("Cadastrar");
        cadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 230, 30));

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Produtos");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 30, 620, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
        String nome = produto.getText();
        int id = Integer.parseInt(idProduto.getText());
        
        Produto produto = new Produto(id, nome);
        ProdutoDAO produtoBanco = new ProdutoDAO();

        produtoBanco.inserirProduto(produto);
        
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        
        removendoInformacoes();
        
        dispose();
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

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
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JRadioButton at;
    private javax.swing.JButton cadastrarUsuario;
    private javax.swing.JComboBox<String> cidadeUsuario;
    private javax.swing.JFormattedTextField cpfUsuario;
    private javax.swing.JTextField idProduto;
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
    private javax.swing.JTextField produto;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JFormattedTextField telefoneUsuario;
    // End of variables declaration//GEN-END:variables
}