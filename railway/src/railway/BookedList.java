/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author admin
 */
public class BookedList extends javax.swing.JFrame {
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;
    ResultSet rs = null;
    PreparedStatement ps =null;
    String user = "root";
    String pass = "root";
    public int userId;
    public int pnR;
    /**
     * Creates new form BookedList
     */
    public BookedList(int user_id) {
        initComponents();
        userId=user_id;
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", user, pass);
            myStmt = myConn.createStatement();
            System.out.println("Done");
            
            String sql="Select * from passenger where user_id='"+userId+"'";
            ps=myConn.prepareStatement(sql);
            myRs=ps.executeQuery();
            String[] tableColumnsName = {"Train No","Train Name","Source","Destination","PNR No"}; 
            DefaultTableModel aModel = (DefaultTableModel) list.getModel();
            aModel.setColumnIdentifiers(tableColumnsName);
            System.out.println(aModel.getRowCount());
            while(myRs.next()){
                Object[] objects = new Object[5];
                int trainId=myRs.getInt("train_id");
                objects[0]=trainId;
                String newsql="Select * from train where train_id='"+trainId+"'";
                ps=myConn.prepareStatement(newsql);
                rs=ps.executeQuery();
                rs.next();
                objects[1]=rs.getString("train_name");
                objects[2]=rs.getString("source");
                objects[3]=rs.getString("destination");
                objects[4]=myRs.getInt("pnr");
                aModel.addRow(objects);
            }
            list.setModel(aModel);
            
        }catch (Exception exc) {
           JOptionPane.showMessageDialog(null, exc);
        } 
        
        
        //ResultSet rs = 
//        statement.executeQuery("select col1,col2,col3 from mytable");
//
//     // Loop through the ResultSet and transfer in the Model
//     java.sql.ResultSetMetaData rsmd = rs.getMetaData();
//     int colNo = rsmd.getColumnCount();
//     while(rs.next()){
//      Object[] objects = new Object[colNo];
//      // tanks to umit ozkan for the bug fix!
//      for(int i=0;i<colNo;i++){
//       objects[i]=rs.getObject(i+1);
//       }
//      aModel.addRow(objects);
//     }
//     aTable.setModel(aModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        book = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BOOKING HISTORY");

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        book.setText("NEW BOOKING");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book)
                            .addComponent(logout))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Main m=new Main();
        dispose();
        m.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        Lookup l=new Lookup(userId);
        dispose();
        l.setVisible(true);
    }//GEN-LAST:event_bookActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
       try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", user, pass);
            myStmt = myConn.createStatement();
            System.out.println("Done");
            int index=list.getSelectedRow();
            TableModel model=list.getModel();
            int pnr = Integer.parseInt(model.getValueAt(index, 4).toString());
            BookedInfo b=new BookedInfo(pnr);
            dispose();
            b.setVisible(true);
//           
            
        }catch(Exception ex){
            System.out.println(ex);
        }        
    }//GEN-LAST:event_listMouseClicked

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
            java.util.logging.Logger.getLogger(BookedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new BookedList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
