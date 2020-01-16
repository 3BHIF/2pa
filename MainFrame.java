/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cities;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author lessi
 */
public class MainFrame extends javax.swing.JFrame {
    public City stadt = new City();
    public LinkedList<Integer> vals = new LinkedList<>();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        stadtLabel = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        valuePanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        gefundenLabel = new javax.swing.JLabel();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        inputPanel.setLayout(new java.awt.GridLayout());

        stadtLabel.setText("Stadtname");
        inputPanel.add(stadtLabel);
        inputPanel.add(input);

        runButton.setText("Stadt suchen");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });
        inputPanel.add(runButton);

        getContentPane().add(inputPanel, java.awt.BorderLayout.NORTH);

        valuePanel.setLayout(new java.awt.GridLayout());
        valuePanel.add(jTextField1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        valuePanel.add(jButton1);
        valuePanel.add(jLabel1);

        getContentPane().add(valuePanel, java.awt.BorderLayout.SOUTH);

        outputPanel.setLayout(new java.awt.GridLayout());

        gefundenLabel.setText("Gefunden:");
        outputPanel.add(gefundenLabel);

        output.setBackground(new java.awt.Color(255, 204, 0));
        outputPanel.add(output);

        getContentPane().add(outputPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        runButton();
    }                                         

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        stadt.initMap();
    }                                 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String inp = jTextField1.getText();
        Integer value = Integer.parseInt(inp);
        
        jLabel1.setText(calcAVG(value) + "");
    }                                        

    public void runButton() {
        String stadtGesucht = input.getText();
        String outputStr = stadtGesucht + "\n";
        
        outputStr += stadt.getValues(stadtGesucht);
        output.setText(outputStr);
    }
    
    public Integer calcAVG(Integer value) {
        vals.add(value);
        int size = vals.size();
        int sum = 0;
        
        for (Iterator it  = vals.iterator(); it.hasNext();) {
            Integer zahl = (Integer) it.next();
            sum += zahl;
        }
        
        return sum / size;
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel gefundenLabel;
    private javax.swing.JTextField input;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel output;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel stadtLabel;
    private javax.swing.JPanel valuePanel;
    // End of variables declaration                   
}

