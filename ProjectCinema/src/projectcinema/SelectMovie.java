/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcinema;

import javax.swing.ImageIcon;
import projectcinema.Logica.LogicaCinema;
import projectcinema.Logica.LogicaTicketsMenu;

/**
 *
 * @author Sofi
 */
public class SelectMovie extends javax.swing.JFrame {

    /** Creates new form SelectMovie */
    public SelectMovie() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupMovieLang = new javax.swing.ButtonGroup();
        lblSelectMovie = new javax.swing.JLabel();
        cmbMovies = new javax.swing.JComboBox<>();
        lblSchedule = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblRoom = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        ckbVIP = new javax.swing.JCheckBox();
        ckb3D = new javax.swing.JCheckBox();
        ckb2D = new javax.swing.JCheckBox();
        rbtnSub = new javax.swing.JRadioButton();
        rbtnDob = new javax.swing.JRadioButton();
        btnExitSelectMovie = new javax.swing.JButton();
        btnContinueSelectMovie = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtpSinopsis = new javax.swing.JTextPane();
        lblMoviePic = new javax.swing.JLabel();
        lblRoomType = new javax.swing.JLabel();
        btnVIP = new javax.swing.JRadioButton();
        btn3D = new javax.swing.JRadioButton();
        btn2D = new javax.swing.JRadioButton();
        lblWallpaperMovies = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSelectMovie.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lblSelectMovie.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectMovie.setText("Seleccione la pelicula");
        getContentPane().add(lblSelectMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        cmbMovies.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        cmbMovies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Spiderman", "IronMan", "Batman" }));
        cmbMovies.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMoviesItemStateChanged(evt);
            }
        });
        cmbMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMoviesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 240, -1));

        lblSchedule.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lblSchedule.setForeground(new java.awt.Color(255, 255, 255));
        lblSchedule.setText("Seleccione el Horario");
        getContentPane().add(lblSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mañana", "Tarde", "Noche" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 240, -1));

        lblRoom.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lblRoom.setForeground(new java.awt.Color(255, 255, 255));
        lblRoom.setText("Seleccione la Sala");
        getContentPane().add(lblRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        lblLocation.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblLocation.setText("Localidad");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        cmbLocation.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "San Pedro", "Multiplaza Escazu", "Plaza Mayor", "Paseo de las Flores" }));
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });
        getContentPane().add(cmbLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 240, -1));

        ckbVIP.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        ckbVIP.setForeground(new java.awt.Color(255, 255, 255));
        ckbVIP.setText("VIP");
        ckbVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVIPActionPerformed(evt);
            }
        });
        getContentPane().add(ckbVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 70, -1));

        ckb3D.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        ckb3D.setForeground(new java.awt.Color(255, 255, 255));
        ckb3D.setText("3D");
        ckb3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb3DActionPerformed(evt);
            }
        });
        getContentPane().add(ckb3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, -1));

        ckb2D.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        ckb2D.setForeground(new java.awt.Color(255, 255, 255));
        ckb2D.setText("2D");
        ckb2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb2DActionPerformed(evt);
            }
        });
        getContentPane().add(ckb2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        groupMovieLang.add(rbtnSub);
        rbtnSub.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        rbtnSub.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSub.setText("Subtitulada");
        getContentPane().add(rbtnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, -1, -1));

        groupMovieLang.add(rbtnDob);
        rbtnDob.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        rbtnDob.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDob.setText("Doblada");
        getContentPane().add(rbtnDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, -1, -1));

        btnExitSelectMovie.setFont(new java.awt.Font("Hobo Std", 1, 12)); // NOI18N
        btnExitSelectMovie.setText("SALIR");
        btnExitSelectMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitSelectMovieActionPerformed(evt);
            }
        });
        getContentPane().add(btnExitSelectMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, -1, -1));

        btnContinueSelectMovie.setFont(new java.awt.Font("Hobo Std", 1, 12)); // NOI18N
        btnContinueSelectMovie.setText("CONTINUAR");
        btnContinueSelectMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueSelectMovieActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinueSelectMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, -1, -1));

        jScrollPane3.setViewportView(txtpSinopsis);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 460, 160));

        lblMoviePic.setText("jLabel1");
        getContentPane().add(lblMoviePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 370, 400));

        lblRoomType.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        lblRoomType.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 520, 40));

        btnVIP.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        btnVIP.setForeground(new java.awt.Color(255, 255, 255));
        btnVIP.setText("VIP");
        getContentPane().add(btnVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, -1, -1));

        btn3D.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        btn3D.setForeground(new java.awt.Color(255, 255, 255));
        btn3D.setText("3D");
        getContentPane().add(btn3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, -1, -1));

        btn2D.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        btn2D.setForeground(new java.awt.Color(255, 255, 255));
        btn2D.setText("2D");
        getContentPane().add(btn2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, -1, -1));

        lblWallpaperMovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginPics/WallpaperCinema2.jpg"))); // NOI18N
        lblWallpaperMovies.setText("jLabel1");
        getContentPane().add(lblWallpaperMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1921, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnExitSelectMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitSelectMovieActionPerformed
        Login window = new Login();
        window.show();
        this.dispose();
    }//GEN-LAST:event_btnExitSelectMovieActionPerformed

    private void btnContinueSelectMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueSelectMovieActionPerformed
        TicketsMenu2 obj = new TicketsMenu2();
        obj.setVisible(true);
        //LogicaTicketsMenu log = new LogicaTicketsMenu();
        //log.back();
    }//GEN-LAST:event_btnContinueSelectMovieActionPerformed

    private void cmbMoviesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMoviesItemStateChanged
        
        LogicaCinema logica = new LogicaCinema();
        String sinopsis = logica.Movie(cmbMovies.getSelectedIndex());
        txtpSinopsis.setText(sinopsis);
        ImageIcon option = logica.Picture(cmbMovies.getSelectedIndex());
        lblMoviePic.setIcon(option);
    }//GEN-LAST:event_cmbMoviesItemStateChanged

    private void cmbMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMoviesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMoviesActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLocationActionPerformed

    private void ckbVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVIPActionPerformed
        LogicaCinema logica = new LogicaCinema();
        String roomType = logica.vip();
        lblRoomType.setText(roomType);
    }//GEN-LAST:event_ckbVIPActionPerformed

    private void ckb3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb3DActionPerformed
        LogicaCinema logica = new LogicaCinema();
        String roomType = logica.trdD();
        lblRoomType.setText(roomType);
        String lblMovieType= "3D";
    }//GEN-LAST:event_ckb3DActionPerformed

    private void ckb2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb2DActionPerformed
        LogicaCinema logica = new LogicaCinema();
        String roomType = logica.sndD();
        lblRoomType.setText(roomType);
        String lblMovieType= "2D";
    }//GEN-LAST:event_ckb2DActionPerformed

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
            java.util.logging.Logger.getLogger(SelectMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn2D;
    private javax.swing.JRadioButton btn3D;
    private javax.swing.JButton btnContinueSelectMovie;
    private javax.swing.JButton btnExitSelectMovie;
    private javax.swing.JRadioButton btnVIP;
    private javax.swing.JCheckBox ckb2D;
    private javax.swing.JCheckBox ckb3D;
    private javax.swing.JCheckBox ckbVIP;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbMovies;
    private javax.swing.ButtonGroup groupMovieLang;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMoviePic;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblRoomType;
    private javax.swing.JLabel lblSchedule;
    private javax.swing.JLabel lblSelectMovie;
    private javax.swing.JLabel lblWallpaperMovies;
    private javax.swing.JRadioButton rbtnDob;
    private javax.swing.JRadioButton rbtnSub;
    private javax.swing.JTextPane txtpSinopsis;
    // End of variables declaration//GEN-END:variables

}
