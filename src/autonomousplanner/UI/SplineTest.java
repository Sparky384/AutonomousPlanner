
package autonomousplanner.UI;

import autonomousplanner.Util;
import autonomousplanner.geometry.ParametricQuintic;
import autonomousplanner.geometry.Quintic;
import autonomousplanner.geometry.SegmentGroup;

/**
 * A debugging tool to see how the splines look.
 * @author Jared
 */
public class SplineTest extends javax.swing.JFrame {

    /**
     * Creates new form SplineTest
     */
    public SplineTest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Test Parametric Quintic");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Test Normal Quintic");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double x0 = Util.messageBoxDouble("x0", "");
        double x1 = Util.messageBoxDouble("x1", "");
        double y0 = Util.messageBoxDouble("y0", "");
        double y1 = Util.messageBoxDouble("y1", "");
        double h0 = Util.messageBoxDouble("h0", "");
        double h1 = Util.messageBoxDouble("h1", "");
        ParametricQuintic quintic = new ParametricQuintic(0, 0, 0, 0, 0, 0);
        quintic.setExtremePoints(x0, y0, x1, y1);
        quintic.setEndDYDX(h1);
        quintic.setStartDYDX(h0);
        quintic.calculateSegments(200);
         new Player(quintic.getSegments(), new SegmentGroup(), new SegmentGroup());
      //  Util.makeGraph(quintic.getSegments(), "xy", "y");
       // Util.makeGraph(quintic.getParametricData(false), "xt plot", "x(t)");
        //Util.makeGraph(quintic.getParametricData(true), "yt plot", "y(t)");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    // TODO add your handling code here:
        double x0 = Util.messageBoxDouble("x0", "");
        double x1 = Util.messageBoxDouble("x1", "");
        double y0 = Util.messageBoxDouble("y0", "");
        double y1 = Util.messageBoxDouble("y1", "");
        double h0 = Util.messageBoxDouble("h0", "");
        double h1 = Util.messageBoxDouble("h1", "");
        Quintic quintic = new Quintic(x0, y0, h0, x1, y1, h1);
        quintic.setExtremePoints(x0, y0, x1, y1);
        quintic.setEndDYDX(h1);
        quintic.setStartDYDX(h0);
        quintic.calculateSegments(200);
       // Util.makeGraph(quintic.getSegments(), "xy", "y");
                new Player(quintic.getSegments(), new SegmentGroup(), new SegmentGroup());

        //Util.makeGraph(quintic.getParametricData(false), "xt plot", "x(t)");
        //Util.makeGraph(quintic.getParametricData(true), "yt plot", "y(t)");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SplineTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplineTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplineTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplineTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplineTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
