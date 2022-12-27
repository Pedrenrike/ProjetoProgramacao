import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Edilma
 */
public class TelaProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaProduto
     */
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaBotao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaBotaoActionPerformed
        pesquisaTabelaNome(pesquisaProduto.getText());
        
    }//GEN-LAST:event_pesquisaBotaoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisaBotao;
    private javax.swing.JTextField pesquisaProduto;
    private javax.swing.JTable tabelaProdutos;
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
