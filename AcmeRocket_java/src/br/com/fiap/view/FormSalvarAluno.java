
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.view;

import br.com.fiap.controller.CtrlListarGrupo;
import br.com.fiap.controller.CtrlSalvarAluno;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Grupo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class FormSalvarAluno extends javax.swing.JFrame {

    private int codAluno = -1;

    public void setCodAluno(int codigoAluno) {
        this.codAluno = codigoAluno;
    }

    public FormSalvarAluno() {
        initComponents();
        setLocationRelativeTo(this);
        lblDashboard.setForeground(Color.blue);
        lblAlunos.setForeground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cmbGrupo = new javax.swing.JComboBox<String>();
        btnCancelarAluno = new javax.swing.JButton();
        txtRm = new javax.swing.JTextField();
        lbRm = new javax.swing.JLabel();
        btnSalvarAluno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAlunos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(723, 420));
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

        jLabel6.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel6.setText("RM:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel7.setText("Nome:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel8.setText("Grupo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 320, -1));

        cmbGrupo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Selecione um Grupo"}));
        cmbGrupo.setMinimumSize(new java.awt.Dimension(129, 21));
        cmbGrupo.setPreferredSize(new java.awt.Dimension(129, 21));
        cmbGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 320, 20));

        btnCancelarAluno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnCancelarAluno.setText("Cancelar");
        btnCancelarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarAlunoMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 100, -1));

        txtRm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtRm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 100, -1));
        getContentPane().add(lbRm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 100, 20));

        btnSalvarAluno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        btnSalvarAluno.setText("Salvar");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 100, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jLabel2.setText("Novo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 11, -1, -1));

        lblDashboard.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 9, -1, -1));

        lblAlunos.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblAlunos.setText("Alunos");
        lblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlunosMouseClicked(evt);
            }
        });
        getContentPane().add(lblAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 11, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fiap/images/Icones-Seta 16x16.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 9, -1, -1));

        pack();
    }// </editor-fold>                        


    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {
        int rm = 0;

        String nomeAluno = txtNome.getText();
        String codGrupo = String.valueOf(cmbGrupo.getSelectedItem());
        String rmT = txtRm.getText();
        CtrlSalvarAluno controle = new CtrlSalvarAluno();
         CtrlListarGrupo ctrlGrupo = new CtrlListarGrupo();
         
        try{
           if (codAluno == -1) {

                if (txtRm.getText().equals("")) {
                     rm = Integer.parseInt(lbRm.getText());
                }else{
                     rm = Integer.parseInt(txtRm.getText());
                }

                if (rmT.equalsIgnoreCase("")) {
                    rm = 0;
                } else {
                    rm = Integer.parseInt(rmT);
                }

                controle.inserirAluno(nomeAluno, rm, ctrlGrupo.buscarIdComboGrupo(codGrupo));

             } else {
                controle.editarAluno(codAluno, nomeAluno, ctrlGrupo.buscarIdComboGrupo(codGrupo));

                if (codAluno == -1) {

                    controle.inserirAluno(nomeAluno, rm, ctrlGrupo.buscarIdComboGrupo(codGrupo));

                } else {
                    controle.editarAluno(rm, nomeAluno, ctrlGrupo.buscarIdComboGrupo(codGrupo));
                }
             }
          }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "O campo *RM deve conter um numero interio");
         }

    }

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {
        //CHAMANDO FORMULARIO PRINCIPAL
        FormPrincipal fp = new FormPrincipal();
        this.dispose();
        fp.setVisible(true);
    }

    private void lblAlunosMouseClicked(java.awt.event.MouseEvent evt) {
        //CHAMANDO FORMULARIO ALUNOS(LISTA)
        FormListarAluno fa = new FormListarAluno();
        this.dispose();
        fa.setVisible(true);
    }

    private void btnCancelarAlunoMouseClicked(java.awt.event.MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar ?", "Selecione uma opção", JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
            FormListarAluno lf = new FormListarAluno();
            //lf.setVisible(true);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        if (codAluno == -1) {
            CtrlSalvarAluno ctrlAluno = new CtrlSalvarAluno();
            ArrayList<Grupo> listaGrupo = ctrlAluno.carregarRegistrosGrupo();

            for (Grupo g : listaGrupo) {
                cmbGrupo.addItem(g.getNomGrupo());
            }

        } else {

            CtrlSalvarAluno ctrlAluno = new CtrlSalvarAluno();
            Aluno a = ctrlAluno.carregarAluno(codAluno);
            ArrayList<Grupo> lista = ctrlAluno.carregarRegistrosGrupo();

            if (a == null) {
                this.voltarParaLista();
            }

            txtRm.setText(String.valueOf(a.getCodAluno()).toString());

            txtRm.setEditable(false);
            //lbRm.setText(String.valueOf(a.getCodAluno()).toString());

            for (Grupo t : lista) {
                cmbGrupo.addItem(t.getNomGrupo());
            }

            txtNome.setText(a.getNomComp());
            cmbGrupo.setSelectedItem(ctrlAluno.carregarComboGrupo(a.getCodGrupo()));

        }

        /**
         * COLOCANDO OS DADOS DO ALUNO DO BANCO NO COMBOBOX
         *
         * List<Grupo> listaEvento = new ArrayList(); GrupoDAO daoEvento = new
         * GrupoDAO(); listaEvento = daoEvento.listar(); for (Grupo g :
         * listaEvento) { cmbGrupo.addItem(g.getNomGrupo()); }
         */
    }

    private void cmbGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGrupoActionPerformed

    private void voltarParaLista() {//
        this.dispose();
        FormListarAluno a = new FormListarAluno();
        // a.setVisible(true);
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
            java.util.logging.Logger.getLogger(FormSalvarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSalvarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSalvarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSalvarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSalvarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelarAluno;
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbRm;
    private javax.swing.JLabel lblAlunos;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRm;
    // End of variables declaration                   
}
