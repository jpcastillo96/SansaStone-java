/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 *
 * @author Gabriel
 */
public class Multiplayer extends javax.swing.JFrame {

    /**
     * Creates new form Registro1
     */
    /******** Funcion: Constructor Multiplayer ********************
    Descripcion: inicializa la ventana donde se efectuara el registro de los dos jugadores del juego.
    Parametros:
    void
    Retorno: apertura de la ventana.
    ************************************************/
    public Multiplayer() {
        initComponents();
    }
    /******** Funcion: getIconImage ********************
    Descripcion: le pone un icono a la ventana
    Parametros:
    * void
    Retorno: void
    ************************************************/
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("tarea_2/imagenes/icono.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        J1 = new javax.swing.JLabel();
        J2 = new javax.swing.JLabel();
        P2 = new javax.swing.JTextField();
        P1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SansaStone™ 2.0");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        J1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        J1.setForeground(new java.awt.Color(255, 204, 204));
        J1.setText("Jugador 1:");
        getContentPane().add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 30));

        J2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        J2.setForeground(new java.awt.Color(255, 204, 204));
        J2.setText("Jugador 2:");
        getContentPane().add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        P2.setBackground(new java.awt.Color(51, 0, 51));
        P2.setForeground(new java.awt.Color(255, 204, 204));
        P2.setCaretColor(new java.awt.Color(255, 204, 204));
        P2.setDisabledTextColor(new java.awt.Color(255, 204, 204));
        P2.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        P2.setSelectionColor(new java.awt.Color(153, 255, 204));
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });
        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 240, 30));

        P1.setBackground(new java.awt.Color(255, 204, 255));
        P1.setForeground(new java.awt.Color(51, 0, 51));
        P1.setCaretColor(new java.awt.Color(51, 0, 51));
        P1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        P1.setSelectionColor(new java.awt.Color(51, 0, 51));
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });
        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 240, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("GO!");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 60, 30));

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Volver");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Multiplayer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarea_2/imagenes/Ultimate-Material-Lollipop-Collection-65.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P2ActionPerformed
    
    /******** Funcion: advertencia ********************
    Descripcion: Alerta por haber ingresado mal los datos.
    Parametros:
    * void
    Retorno: void
    ************************************************/
    private void advertencia(){
            JOptionPane.showMessageDialog(null,"ingrese sus datos","Mensaje",JOptionPane.PLAIN_MESSAGE);
    }
    
    /******** Funcion: jButton1ActionPerformed ********************
    Descripcion: recibe los nombres de los jugadores, crea sus barajas y abre la ventana PeleaCom2 (juego principal)
    Parametros:
        java.awt.event.ActionEvent evt
    Retorno: void
    ************************************************/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user1 = P1.getText();
        String user2 = P2.getText();
            if ((user1.length() != 0) && (user2.length() != 0)){
                Sansano player1 = new Sansano(P1.getText(),3000);
                Sansano player2 = new Sansano(P2.getText(),3000);
                player1.crearMazoAzar();
                player2.crearMazoAzar();
                PeleaCom2 Multi = new PeleaCom2(player1,player2,1); 
                Multi.setLocationRelativeTo(null);
                Multi.setVisible(true);
                this.dispose();
            }
            else{
                advertencia();              
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /******** Funcion: jButton2ActionPerformed ********************
    Descripcion: Regresa al menú principal de selección.
    Parametros:
        java.awt.event.ActionEvent evt
    Retorno: void
    ************************************************/
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Ventana window= new Ventana();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(() -> {
            new Multiplayer().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J2;
    public static javax.swing.JTextField P1;
    public static javax.swing.JTextField P2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
