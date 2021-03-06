
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import br.com.fiap.controller.CtrlDeletarAluno;
import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.dao.GrupoDAO;
import br.com.fiap.entity.Aluno;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiago
 */
public class FormListarAluno extends javax.swing.JFrame {

    private String[][] matrizAluno;
    private int codAluno;

    public FormListarAluno() {
        initComponents();
        setLocationRelativeTo(this);
        lblDashboard.setForeground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlunos = new javax.swing.JTable();
        btnNovoAluno = new javax.swing.JButton();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnALterarAluno = new javax.swing.JButton();
        btnDeletarAluno = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acme Rocket");
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(723, 420));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel3.setText("Aluno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-04 51x51.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        tabAlunos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RM", "NOME", "GRUPO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabAlunos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 640, 220));

        btnNovoAluno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnNovoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Mais 20x20.png"))); // NOI18N
        btnNovoAluno.setText("Novo");
        btnNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 100, 40));

        lblDashboard.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel9.setText("Alunos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        btnALterarAluno.setText("Alterar");
        btnALterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALterarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnALterarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, 40));

        btnDeletarAluno.setText("Remover");
        btnDeletarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 40));

        pack();
    }// </editor-fold>                        

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {                                          
        //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }                                         

    private void btnNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //CHAMANDO FORMULARIO PARA O NOVO ALUNO 
        FormSalvarAluno fna = new FormSalvarAluno();
        this.dispose();
        fna.setVisible(true);
    }                                            

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        atualizarTabela();
    }                                 

    private void btnDeletarAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                                

        int linha = tabAlunos.getSelectedRow();

        if (linha != -1) {

            if (this.codAluno != -1) {
                int codigoAluno = Integer.parseInt(String.valueOf(tabAlunos.getValueAt(linha, 0)));
                CtrlDeletarAluno ctrlAluno = new CtrlDeletarAluno();
                if (ctrlAluno.confirmaExclusao()) {    
                ctrlAluno.excluirAluno(codigoAluno);
                atualizarTabela();
                }
                //JOptionPane.showMessageDialog(this, "Selecione um período da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um aluno da lista para deletar", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
            }
        }

    }                                               

    private void btnALterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        int linha = tabAlunos.getSelectedRow();
        if (linha != -1) {
            FormSalvarAluno fng = new FormSalvarAluno();
            int obj = Integer.parseInt(String.valueOf(tabAlunos.getValueAt(linha, 0)));
            fng.setCodAluno(obj);
            this.dispose();
            fng.setVisible(true);
        }
    }                                               

    public void atualizarTabela() {

        AlunoDAO daoAluno = new AlunoDAO();
        GrupoDAO daoGrupo = new GrupoDAO();

        List<Aluno> lista = daoAluno.listar();
        matrizAluno = new String[lista.size()][3];
        Aluno aluno;

        String[] colunas = {"RM", "NOME", "GRUPO"};
        for (int i = 0; i < lista.size(); i++) {

            aluno = lista.get(i);
            matrizAluno[i][0] = String.valueOf(aluno.getCodAluno());
            matrizAluno[i][1] = aluno.getNomComp();
            matrizAluno[i][2] = daoGrupo.buscarNomeGrupo(aluno.getCodGrupo());
        }

        TableModel modeloTabela = new DefaultTableModel(matrizAluno, colunas);
        tabAlunos.setModel(modeloTabela);
    }

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
            java.util.logging.Logger.getLogger(FormListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormListarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnALterarAluno;
    private javax.swing.JButton btnDeletarAluno;
    private javax.swing.JButton btnNovoAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTable tabAlunos;
    // End of variables declaration                   
}
