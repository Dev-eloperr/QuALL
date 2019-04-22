/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import javax.swing.JOptionPane;
import java.util.TimerTask;

/**
 *
 * @author Dev Kathuria
 */
public class Game extends javax.swing.JFrame {
    String uname;
    /**
     * Creates new form Game
     */
    public Game(String uname) {
        this.uname = uname;
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Grp1 = new javax.swing.ButtonGroup();
        lblRemaining = new javax.swing.JLabel();
        lblQues = new javax.swing.JLabel();
        rb4 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        lblLevel = new javax.swing.JLabel();
        lblPts = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timer_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lblRemaining.setBackground(new java.awt.Color(102, 204, 255));
        lblRemaining.setFont(new java.awt.Font("Sitka Heading", 3, 18)); // NOI18N
        lblRemaining.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemaining.setText("Remaining Questions:");
        lblRemaining.setToolTipText("");
        lblRemaining.setOpaque(true);
        getContentPane().add(lblRemaining);
        lblRemaining.setBounds(830, 570, 260, 40);

        lblQues.setBackground(new java.awt.Color(0, 0, 0));
        lblQues.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lblQues.setForeground(new java.awt.Color(102, 204, 255));
        lblQues.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQues.setText("Q. <This is the question>");
        lblQues.setOpaque(true);
        getContentPane().add(lblQues);
        lblQues.setBounds(160, 170, 860, 140);

        rb4.setBackground(new java.awt.Color(0, 0, 0));
        Grp1.add(rb4);
        rb4.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        rb4.setForeground(new java.awt.Color(102, 204, 255));
        rb4.setText("<Option4>");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        getContentPane().add(rb4);
        rb4.setBounds(690, 430, 200, 60);

        rb2.setBackground(new java.awt.Color(0, 0, 0));
        Grp1.add(rb2);
        rb2.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        rb2.setForeground(new java.awt.Color(102, 204, 255));
        rb2.setText("<Option2>");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2);
        rb2.setBounds(690, 340, 200, 60);

        rb1.setBackground(new java.awt.Color(0, 0, 0));
        Grp1.add(rb1);
        rb1.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        rb1.setForeground(new java.awt.Color(102, 204, 255));
        rb1.setSelected(true);
        rb1.setText("<Option1>");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(310, 340, 200, 60);

        rb3.setBackground(new java.awt.Color(0, 0, 0));
        Grp1.add(rb3);
        rb3.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        rb3.setForeground(new java.awt.Color(102, 204, 255));
        rb3.setText("<Option3>");
        getContentPane().add(rb3);
        rb3.setBounds(310, 430, 200, 60);

        btnSubmit.setBackground(new java.awt.Color(102, 204, 255));
        btnSubmit.setFont(new java.awt.Font("Sitka Heading", 3, 20)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(550, 510, 120, 40);

        lblLevel.setBackground(new java.awt.Color(0, 0, 0));
        lblLevel.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        lblLevel.setForeground(new java.awt.Color(102, 204, 255));
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLevel.setText("LEVEL I");
        lblLevel.setOpaque(true);
        getContentPane().add(lblLevel);
        lblLevel.setBounds(470, 90, 150, 30);

        lblPts.setBackground(new java.awt.Color(0, 0, 0));
        lblPts.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        lblPts.setForeground(new java.awt.Color(102, 204, 255));
        lblPts.setText("Points: 0");
        lblPts.setOpaque(true);
        getContentPane().add(lblPts);
        lblPts.setBounds(840, 10, 150, 40);

        lblMax.setBackground(new java.awt.Color(0, 0, 0));
        lblMax.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        lblMax.setForeground(new java.awt.Color(102, 204, 255));
        lblMax.setText("Max Points:");
        lblMax.setOpaque(true);
        getContentPane().add(lblMax);
        lblMax.setBounds(840, 50, 150, 50);

        jLabel4.setBackground(new java.awt.Color(102, 204, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Heading", 3, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QuAll");
        jLabel4.setToolTipText("");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 10, 190, 70);

        timer_Label.setBackground(new java.awt.Color(0, 0, 0));
        timer_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timer_Label.setForeground(new java.awt.Color(0, 204, 204));
        timer_Label.setText("00:00");
        timer_Label.setOpaque(true);
        getContentPane().add(timer_Label);
        timer_Label.setBounds(170, 50, 70, 30);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/backdrop#2.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed
Statement stmt1,stmt3;
 StringBuffer question_s;
    StringBuffer ans_c;
    StringBuffer ans2;
    StringBuffer ans3;
    StringBuffer ans4;
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        try {
            lblRemaining.setText("Remaining Questions: " + rem);
            
            //timerF(0);
            String ans;
            if (rb1.isSelected()) {
                ans = rb1.getText();
            } else if (rb2.isSelected()) {
                ans = rb2.getText();
            } else if (rb3.isSelected()) {
                ans = rb3.getText();
            } else {
                ans = rb4.getText();
            }
            String q = "Select * from questions where ind = " + ind + ";";
            ResultSet rs = stmt.executeQuery(q);
            String key = "";
            String diff = "";
            String q2=new String();
            if(rs.next()){
                key = rs.getString("ansC");
                diff = rs.getString("diff");
            }
            
            if(key.equals(ans)){
                if(diff.equals("easy")){
                    pts += 5;
                }else if(diff.equals("medium")){
                    pts += 10;
                }else if(diff.equals("hard")){
                    pts += 15;
                }
            }
            
            lblPts.setText("Points: " + pts);
            
            if(e>0){
              diff = "easy";
            }else if(m>0){
                diff = "medium";
            }else if(h>0){
                diff = "hard";
            }else{
                diff = "fin";
            }
            
            System.out.println(diff+" is diff");
            if(!diff.equals("fin")){
                String q3 = "Select ind from useQ order by Qused;";
                rs = stmt.executeQuery(q3);

                 stmt1=con.createStatement();
                 stmt3=con.createStatement();
                ArrayList<String> opt = new ArrayList<>();
                String q4;
                while(rs.next()){
                    ind = rs.getInt("ind");
                    q4 = "Select * from questions where ind = " + ind + " and diff = '" + diff + "';";
                    ResultSet rs1 = stmt1.executeQuery(q4);
                    if(rs1.next()){
                        if(diff.equals("easy")){
                            e--;
                        }else if(diff.equals("medium")){
                            m--;
                        }else if(diff.equals("hard")){
                            h--;
                        }
                        rem--;

                      question_s = new StringBuffer(rs1.getString("ques"));
                ans_c = new StringBuffer(rs1.getString("ansC"));
                ans2 = new StringBuffer(rs1.getString("ans2"));
                ans3 = new StringBuffer(rs1.getString("ans3"));
                ans4 = new StringBuffer(rs1.getString("ans4"));
                //question_s.insert(0,rs1.getString("ques"));
                  System.out.println("after news");
                  System.out.println(question_s);
                if(question_s.length()>50){
                    System.out.println("appended");
                    question_s.insert(50, "<br>");
                }
                //ans_c.append(rs1.getString("ansC"));
                if(ans_c.length()>15)
                    ans_c.insert(15, "-<br>");
                //ans2.append(rs1.getString("ans2"));
                if(ans2.length()>15)
                    ans2.insert(15, "<br>");
                //ans3.append(rs1.getString("ans3"));
                if(ans3.length()>15)
                    ans3.insert(15, "<br>");
                //ans4.append(rs1.getString("ans4"));
                if(ans4.length()>15)
                    ans4.insert(15, "<br>");
                  System.out.println("length buster");
                System.out.println("QUESTION: "+question_s+"\n"+ans_c+"\n"+ans2+"\n"+ans3+"\n"+ans4+"\n");
                lblQues.setText("<html>"+question_s+"</html>");
                
                opt.add("<html>"+ans_c+"</html>");
                opt.add("<html>"+ans2+"</html>");
                opt.add("<html>"+ans3+"</html>");
                opt.add("<html>"+ans4+"</html>");

                      Collections.shuffle(opt);
                      rb1.setText(opt.get(0));
                      rb2.setText(opt.get(1));
                      rb3.setText(opt.get(2));
                      rb4.setText(opt.get(3));

                      String q5 = "Update useQ set Qused = Qused + 1 where uname = '"+uname+"' and ind = "+ind+";";
                      stmt.executeUpdate(q5);
                      
                      break;
                  }
              }
        }
            else{
                q = "Select * from details where uname = '" + uname + "';";
                rs = stmt.executeQuery(q);
                int upts = pts;
                int new_pts;
                new_pts=pts;
                if(rs.next()){
                    new_pts+=rs.getInt("points");
                    System.out.println("points thing working?");
                    //System.out.println("Points : "+(upts+" "+rs.getString("points")));
                    upts+= (rs.getInt("points")%50);
                    
                    q2 = "Update details set points = " + new_pts + " where uname = '" + uname + "';";
                    stmt3.executeUpdate(q2);
                    System.out.println("upts is: "+upts);
                    if(upts>=50){
                        //upts = upts - 50;
                        q = "Update details set level = level + 1 where uname = '" + uname + "';";
                        stmt1.executeUpdate(q);
                        int l = rs.getInt("level");
                        JOptionPane.showMessageDialog(null, "LEVEL UPGRADED TO "+(l+1));
                        System.out.println("Lev"+l);
                    }
                }
                setVisible(false);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    Connection con;
    Statement stmt;
    int lev;
    int e=0, m=0, h=0;
    
    int pts = 0;
    int ind;
    
    int rem = 9;
    
   
    
    public void timerF(int s){
          Timer timer = new Timer();
          timer.scheduleAtFixedRate(new TimerTask() {
                int sec=s;
                @Override
                public void run() {
                    sec++;
                    timer_Label.setText(sec+"");
                    
                }
            }, 1000,1000);
          }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            lblRemaining.setText("Remaining Questions: " + rem);
            
          Class.forName("com.mysql.cj.jdbc.Driver");
          con= DriverManager.getConnection("jdbc:mysql://localhost/project?autoReconnect=true&useSSL=false", "root", "toor");
          stmt=con.createStatement();
           timerF(0);
            System.out.println("timer sucks");
          String q1 = "Select level from details where uname = '" + uname + "';";
          
          ResultSet rs = stmt.executeQuery(q1);
          lev = 1;
          
          //to get level
          while(rs.next()){
              lev = rs.getInt("level");
          }
          lblLevel.setText("LEVEL " + lev);
            System.out.println("level is "+lev);
          
          //to get number of easy, medium and hard questions in level
          String q2 = "Select * from noq where level = " + lev + ";";
          rs = stmt.executeQuery(q2);
          
          while(rs.next()){
              e = rs.getInt("easy");
              m = rs.getInt("med");
              h = rs.getInt("hard");
              System.out.println("e is: "+e+"m is: "+m +"h is : "+h);
          }
          
          //calculating maximum points
          int maxPts = e*5 + m*10 + h*15; 
          lblMax.setText("Max Points: " + maxPts);
          
          String diff;
          if(e>0){
              diff = "easy";
          }else if(m>0){
              diff = "medium";
          }else{
              diff = "hard";
          }
          // to get a question
          String q3 = "Select ind from useQ where uname = '"+ uname +"' order by Qused;";
          rs = stmt.executeQuery(q3);

          ArrayList<String> opt = new ArrayList<>();
          String q4;
          Statement stmt1=con.createStatement();
          while(rs.next()){
              ind = rs.getInt("ind");
              q4 = "Select * from questions where ind = " + ind + " and diff = '" + diff + "';";
              ResultSet rs1 = stmt1.executeQuery(q4);
              if(rs1.next()){
                if(diff.equals("easy")){
                    e--;
                }else if(diff.equals("medium")){
                    m--;
                }else if(diff.equals("hard")){
                    h--;
                }
                rem--;  
                System.out.println("aagya");
                question_s = new StringBuffer(rs1.getString("ques"));
                ans_c = new StringBuffer(rs1.getString("ansC"));
                ans2 = new StringBuffer(rs1.getString("ans2"));
                ans3 = new StringBuffer(rs1.getString("ans3"));
                ans4 = new StringBuffer(rs1.getString("ans4"));
                //question_s.insert(0,rs1.getString("ques"));
                  System.out.println("after news");
                  System.out.println(question_s);
                if(question_s.length()>50){
                    System.out.println("appended");
                    question_s.insert(50, "<br>");
                }
                //ans_c.append(rs1.getString("ansC"));
                if(ans_c.length()>15)
                    ans_c.insert(15, "-<br>");
                //ans2.append(rs1.getString("ans2"));
                if(ans2.length()>15)
                    ans2.insert(15, "<br>");
                //ans3.append(rs1.getString("ans3"));
                if(ans3.length()>15)
                    ans3.insert(15, "<br>");
                //ans4.append(rs1.getString("ans4"));
                if(ans4.length()>15)
                    ans4.insert(15, "<br>");
                  System.out.println("length buster");
                System.out.println("QUESTION: "+question_s+"\n"+ans_c+"\n"+ans2+"\n"+ans3+"\n"+ans4+"\n");
                lblQues.setText("<html>"+question_s+"</html>");
                
                opt.add("<html>"+ans_c+"</html>");
                opt.add("<html>"+ans2+"</html>");
                opt.add("<html>"+ans3+"</html>");
                opt.add("<html>"+ans4+"</html>");
                
                Collections.shuffle(opt);
                rb1.setText(opt.get(0));
                rb2.setText(opt.get(1));
                rb3.setText(opt.get(2));
                rb4.setText(opt.get(3));
                
                String q5 = "Update useQ set Qused = Qused + 1 where ind = "+ ind +" and uname = '" +uname+"';";
                stmt.executeUpdate(q5);
                question_s.setLength(0);
                ans_c.setLength(0);
                ans2.setLength(0);
                ans3.setLength(0);
                ans4.setLength(0);
                break;
              }
          }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Game("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grp1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblPts;
    private javax.swing.JLabel lblQues;
    private javax.swing.JLabel lblRemaining;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JLabel timer_Label;
    // End of variables declaration//GEN-END:variables
}
