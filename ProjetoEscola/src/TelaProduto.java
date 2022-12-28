import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaProduto extends javax.swing.JFrame {
    
    public static double tot;
    
    public TelaProduto() {
        initComponents();
        
        listarProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        pesquisaProduto = new javax.swing.JTextField();
        pesquisaBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comprarBotao = new javax.swing.JButton();
        idProduto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        valorTotal = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Descrição", "Quantidade", "Comissão", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        pesquisaProduto.setToolTipText("Pesquisa do nome do produto");

        pesquisaBotao.setBackground(new java.awt.Color(255, 153, 0));
        pesquisaBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pesquisaBotao.setText("Buscar");
        pesquisaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaBotaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar produto pelo nome:");

        comprarBotao.setText("Comprar");
        comprarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBotaoActionPerformed(evt);
            }
        });

        idProduto.setText("Id");
        idProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idProdutoFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Valor: R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaBotao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comprarBotao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaBotao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comprarBotao)
                            .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaBotaoActionPerformed
        pesquisaTabelaNome(pesquisaProduto.getText());
    }//GEN-LAST:event_pesquisaBotaoActionPerformed

    private void idProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idProdutoFocusGained
        if(idProduto.getText().equals("Id")) {
            idProduto.setText("");
            idProduto.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_idProdutoFocusGained

    private void idProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idProdutoFocusLost
        if(idProduto.getText().equals("")) {
            idProduto.setText("Id");
            idProduto.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_idProdutoFocusLost

    private void comprarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBotaoActionPerformed
        try {
            int id = tabelaProdutos.getSelectedRow();
            
            Produto produto = new Produto();
            produto.setId(id);
            
            idProduto.setText(Integer.toString(id));
            
            
            JOptionPane.showMessageDialog(null, "Produto comprado!");
            TelaUser tU = new TelaUser();

            String s = tabelaProdutos.getModel().getValueAt(produto.getId(), 5).toString();
            String s2 = tabelaProdutos.getModel().getValueAt(produto.getId(), 3).toString();
            String s3 = tabelaProdutos.getModel().getValueAt(produto.getId(), 4).toString();

            double preco = Double.parseDouble(s);
            int quantidade = Integer.parseInt(s2);
            double comissao = Double.parseDouble(s3);

            TelaUser.valorPagar = (preco * quantidade) + comissao;
            
            tot += TelaUser.valorPagar;
            
            valorTotal.setText(Double.toString(tot));
            
        } catch (Exception e) {
            System.out.println("Erro na consulta de usuario: " + e);
        }
    }//GEN-LAST:event_comprarBotaoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprarBotao;
    private javax.swing.JTextField idProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisaBotao;
    private javax.swing.JTextField pesquisaProduto;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField valorTotal;
    // End of variables declaration//GEN-END:variables

    private void listarProdutos() {
        try {
            ProdutoDAO pD = new ProdutoDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
            model.setNumRows(0);
            
            ArrayList<Produto> lista = pD.pesquisarProduto();
            
            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getDescricao(),
                    lista.get(i).getQuantidade(),
                    lista.get(i).getComissao(),
                    lista.get(i).getValor()
                });
            }
            
        } catch (Exception e) {
            System.out.println("Erro no listamento de produtos: " + e);
        }
    }
    
    private void pesquisaTabelaNome(String nome) {
        try {
            Produto produto = new Produto();
            produto.setNome(pesquisaProduto.getText());
            
            ProdutoDAO pD = new ProdutoDAO();
            
            DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
            modelo.setNumRows(0);
            
            for (Produto p : pD.pesquisarProdutoNome(produto)) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getQuantidade(),
                    p.getComissao(),
                    p.getValor()
                });
            }
        } catch (Exception e) {
            System.out.println("Erro na pesquisa por nome (TelaProduto): " + e);
        }
    }
}
