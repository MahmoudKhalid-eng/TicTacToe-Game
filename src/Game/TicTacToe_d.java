
package Game;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TicTacToe_d extends javax.swing.JFrame {
    
    private String start_game="X";
    private int xCount=0,oCount=0; 
    public TicTacToe_d() {
        initComponents();
        setSize(1300,600);
        setLocationRelativeTo(null);
        
    }
    private void gameScore(){
        pxScore.setText(String.valueOf(xCount));
        poScore.setText(String.valueOf(oCount));
        
    }
    private void tie(){
        if(jButton1.getText()!=""
                &&jButton2.getText()!=""
                &&jButton3.getText()!=""
                &&jButton4.getText()!=""
                &&jButton5.getText()!=""
                &&jButton6.getText()!=""
                &&jButton7.getText()!=""
                &&jButton8.getText()!=""
                &&jButton9.getText()!=""

                ){
            JOptionPane.showMessageDialog(this,"Draw","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    private void choosePlayer(){
        if(start_game.equalsIgnoreCase("X")){
            start_game="O";
        }
        else{
            start_game="X";
        }
    }
    private void win(){
        
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
        
        if(b1=="X"&&b2=="X"&&b3=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
        }
        
        if(b4=="X"&&b5=="X"&&b6=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
        }
        if(b7=="X"&&b8=="X"&&b9=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(b1=="X"&&b4=="X"&&b7=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if(b2=="X"&&b5=="X"&&b8=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        if(b3=="X"&&b6=="X"&&b9=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(b1=="X"&&b5=="X"&&b9=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(b3=="X"&&b5=="X"&&b7=="X"){
            JOptionPane.showMessageDialog(this,"Player X won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            xCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if(b1=="O"&&b2=="O"&&b3=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
        }
        
        if(b4=="O"&&b5=="O"&&b6=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            
            oCount++;
            gameScore();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
        }
        if(b7=="O"&&b8=="O"&&b9=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(b1=="O"&&b4=="O"&&b7=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if(b2=="O"&&b5=="O"&&b8=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        if(b3=="O"&&b6=="O"&&b9=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(b1=="O"&&b5=="O"&&b9=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if(b3=="O"&&b5=="O"&&b7=="O"){
            JOptionPane.showMessageDialog(this,"Player O won","Tic Tac Toe"
                    ,JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        pxScore = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        poScore = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X : ");
        jPanel13.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        pxScore.setFont(new java.awt.Font("Tahoma", 2, 40)); // NOI18N
        pxScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel18.add(pxScore, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel21);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player O :");
        jPanel9.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        poScore.setFont(new java.awt.Font("Tahoma", 2, 40)); // NOI18N
        poScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(poScore, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton10.setText("New Game");
        jButton10.setActionCommand("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel22);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel25);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       jButton1.setText("");
       jButton2.setText("");
       jButton3.setText("");
       jButton4.setText("");
       jButton5.setText("");
       jButton6.setText("");
       jButton7.setText("");
       jButton8.setText("");
       jButton9.setText("");
       jButton1.setBackground(Color.LIGHT_GRAY);
       jButton2.setBackground(Color.LIGHT_GRAY);
       jButton3.setBackground(Color.LIGHT_GRAY);
       jButton4.setBackground(Color.LIGHT_GRAY);
       jButton5.setBackground(Color.LIGHT_GRAY);
       jButton6.setBackground(Color.LIGHT_GRAY);
       jButton7.setBackground(Color.LIGHT_GRAY);
       jButton8.setBackground(Color.LIGHT_GRAY);
       jButton9.setBackground(Color.LIGHT_GRAY);
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Press yes if you want to Exit","Tic Tac Toe"
        ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);{
            System.exit(0);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.RED);
        }
        else{
            jButton1.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.RED);
        }
        else{
            jButton4.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.RED);
        }
        else{
            jButton7.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.RED);
        }
        else{
            jButton2.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jButton3.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.RED);
        }
        else{
            jButton3.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.RED);
        }
        else{
            jButton5.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.RED);
        }
        else{
            jButton8.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.RED);
        }
        else{
            jButton6.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(start_game);
        if(start_game.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.RED);
        }
        else{
            jButton9.setForeground(Color.BLUE);
        }
        choosePlayer();
        win();
        tie();
    }//GEN-LAST:event_jButton9ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_d().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel poScore;
    private javax.swing.JLabel pxScore;
    // End of variables declaration//GEN-END:variables
}
