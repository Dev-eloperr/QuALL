/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev Kathuria
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    static String ns = new String();
    public MainFrame(String uname) {
        initComponents();
        userLabel.setText("@"+uname);
        Connection con;
        Statement stmt;
        int level=0;                       
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con= DriverManager.getConnection("jdbc:mysql://localhost/project?autoReconnect=true&useSSL=false", "root", "toor");
          stmt=con.createStatement();
          String q="Select * from details where uname='"+ uname+"';";
          ResultSet rs=stmt.executeQuery(q);
          if(rs.next()){
            nameLabel.setText(rs.getString("name"));
            levelLabel.setText("You are on level: "+rs.getString("level"));
            quesLabel.setText("Points required to level up: "+rs.getString("points"));
            level=Integer.parseInt(rs.getString("level"));
          }
          

        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Fucking hell");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        jProgressBar1.setValue(10*level);
       ns=uname; 
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();
        profLabel = new javax.swing.JPanel();
        pictureLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        quesLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        leaderboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));

        mainTabbedPane.setBackground(new java.awt.Color(0, 0, 0));

        profLabel.setBackground(new java.awt.Color(0, 204, 204));
        profLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        profLabel.setForeground(new java.awt.Color(0, 204, 204));

        pictureLabel.setBackground(new java.awt.Color(0, 204, 204));
        pictureLabel.setForeground(new java.awt.Color(0, 204, 204));
        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/uuserr.png"))); // NOI18N
        pictureLabel.setToolTipText("");

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 51, 153));
        nameLabel.setText("...");

        userLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        userLabel.setForeground(new java.awt.Color(153, 153, 153));
        userLabel.setText("...");

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 0));
        jProgressBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, new java.awt.Color(0, 102, 102), null, null));

        quesLabel.setFont(new java.awt.Font("Segoe UI Symbol", 2, 24)); // NOI18N
        quesLabel.setForeground(new java.awt.Color(51, 0, 153));
        quesLabel.setText("noOfQuestions");

        levelLabel.setFont(new java.awt.Font("Segoe UI Symbol", 2, 24)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(0, 51, 153));
        levelLabel.setText("LevelNo");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Start Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profLabelLayout = new javax.swing.GroupLayout(profLabel);
        profLabel.setLayout(profLabelLayout);
        profLabelLayout.setHorizontalGroup(
            profLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profLabelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(profLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(profLabelLayout.createSequentialGroup()
                        .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(profLabelLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(profLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(profLabelLayout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        profLabelLayout.setVerticalGroup(
            profLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profLabelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(profLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Profile", profLabel);

        leaderboardPanel.setBackground(new java.awt.Color(0, 204, 204));
        leaderboardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        leaderboardPanel.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/leaderr.png"))); // NOI18N

        javax.swing.GroupLayout leaderboardPanelLayout = new javax.swing.GroupLayout(leaderboardPanel);
        leaderboardPanel.setLayout(leaderboardPanelLayout);
        leaderboardPanelLayout.setHorizontalGroup(
            leaderboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderboardPanelLayout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(632, Short.MAX_VALUE))
        );
        leaderboardPanelLayout.setVerticalGroup(
            leaderboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderboardPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(703, Short.MAX_VALUE))
        );

        mainTabbedPane.addTab("Leaderboard", leaderboardPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Game(ns).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new MainFrame("").setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel leaderboardPanel;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JPanel profLabel;
    private javax.swing.JLabel quesLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
