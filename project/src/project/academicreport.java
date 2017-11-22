/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author 1205088
 */
public class academicreport extends javax.swing.JFrame {

    /**
     * Creates new form academicreport
     */
    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    PreparedStatement pst=null;
    Statement stmt=null;
    public academicreport() {
        initComponents();
        conn = projectconnect.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok_txt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        report_txt = new javax.swing.JButton();
        class_txt = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        semister_txt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ok_txt.setText("Refresh");
        ok_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_txtActionPerformed(evt);
            }
        });

        report_txt.setText("Report");
        report_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_txtActionPerformed(evt);
            }
        });

        class_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class6", "Class7", "Class8", "Class9", "Class10", " " }));

        jLabel5.setBackground(new java.awt.Color(225, 119, 14));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Semister :");

        semister_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semister 1", "Semister 2", "Final", " ", " " }));

        jLabel2.setBackground(new java.awt.Color(86, 75, 26));
        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel2.setText("Report Box");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(225, 119, 14));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Student ID : ");

        jLabel3.setBackground(new java.awt.Color(225, 119, 14));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Class  :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(report_txt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semister_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(class_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(semister_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(class_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(report_txt)))
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(86, 75, 26));
        jLabel4.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jLabel4.setText("  Refresh Database ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(ok_txt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(330, 330, 330))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(ok_txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_txtActionPerformed
        // TODO add your handling code here:
        try{
            
            String sql=null;
            // String classtype=(String)class_txt.getSelectedItem();
            sql="update Class7 set SID";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        }

    }//GEN-LAST:event_ok_txtActionPerformed

    private void report_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_txtActionPerformed
        try {
            // TODO add your handling code here:
            String str1= ID_txt.getText();
            String str2=(String) class_txt.getSelectedItem();
            String str3=(String) semister_txt.getSelectedItem();
            String sql=null;

            String sname="Sazzad Hossain";
            Document document = new Document () ;
            try {
                PdfWriter.getInstance(document, new FileOutputStream(str1+"'s Academic report.pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(academicreport.class.getName()).log(Level.SEVERE, null, ex);
            }
            int str=Integer.parseInt(str1);

            sql = "select bangla1.MCQ,bangla1.Written,bangla1.Total,bangla1.Grade,bangla2.MCQ,bangla2.Written,bangla2.Total,bangla2.Grade,english1.MCQ,english1.Written,english1.Total,english1.Grade,english2.MCQ,english2.Written,english2.Total,english2.Grade,generalmath.MCQ,generalmath.Written,generalmath.Total,generalmath.Grade,generalscience.MCQ,generalscience.Written,generalscience.Total,generalscience.Grade,ict.MCQ,ict.Written,ict.Total,ict.Grade,islam.MCQ,islam.Written,islam.Total,islam.Grade,sociology.MCQ,sociology.Written,sociology.Total,sociology.Grade,agriculture.MCQ,agriculture.Written,agriculture.Total,agriculture.Grade,lifecareer.MCQ,lifecareer.Written,lifecareer.Total,lifecareer.Grade,bangla1.SName from bangla1,bangla2,english1,english2,lifecareer,generalmath,generalscience,ict,islam,sociology,agriculture where '"+str+"'=bangla1.SID and '"+str+"' = lifecareer.SID and '"+str+"' = Agriculture.SID and '"+str+"' = generalscience.SID and '"+str+"' = sociology.SID and '"+str+"' = islam.SID and '"+str+"' = generalmath.SID and '"+str+"' = ict.SID and '"+str+"' = english2.SID and '"+str+"' = bangla2.SID and '"+str+"'=english1.SID";

            try {
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                //pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(academicreport.class.getName()).log(Level.SEVERE, null, ex);
            }
            sql="select max(bangla1.Total),max(bangla2.Total),max(english1.Total),max(english2.Total),max(generalmath.Total),max(generalscience.Total),max(ict.Total),max(islam.Total),max(sociology.Total),max(agriculture.Total),max(lifecareer.Total) from bangla1,bangla2,english1,english2,generalmath,generalscience,ict,islam,sociology,agriculture,lifecareer";
            try {
                pst=conn.prepareStatement(sql);
                rs1=pst.executeQuery();
                //pst.close();
                if(str2=="Class6")
                {
                    if(str3=="Semister 1")sql="select SName,Roll,TotalMark1,Grade1 from Class6 where Class6.SID='"+str+"'";
                    else if(str3=="Semister 2")sql="select SName,Roll,TotalMark2,Grade2 from Class6 where Class6.SID='"+str+"'";
                    else if(str3=="Final")sql="select SName,Roll,TotalMark3,Grade3 from Class6 where Class6.SID='"+str+"'";
                }
                else if(str2=="Class7")

                {
                    if(str3=="Semister 1")sql="select SName,Roll,TotalMark1,Grade1 from Class7 where Class7.SID='"+str+"'";
                    else if(str3=="Semister 2")sql="select SName,Roll,TotalMark2,Grade2 from Class7 where Class7.SID='"+str+"'";
                    else if(str3=="Final")sql="select SName,Roll,TotalMark3,Grade3 from Class7 where Class7.SID='"+str+"'";
                }
                else if(str2=="Class8")
                {
                    if(str3=="Semister 1")sql="select SName,Roll,TotalMark1,Grade1 from Class8 where Class8.SID='"+str+"'";
                    else if(str3=="Semister 2")sql="select SName,Roll,TotalMark2,Grade2 from Class8 where Class8.SID='"+str+"'";
                    else if(str3=="Final")sql="select SName,Roll,TotalMark3,Grade3 from Class8 where Class8.SID='"+str+"'";
                }
                else if(str2=="Class9")
                {

                }
                else if(str2=="Class10")
                {

                }
                //else if(str2=="Class8")sql="select Class8.SName from Class8 where Class10.SID='"+str+"'";
                //else if(str2=="Class9")sql="select Class9.SName from Class9 where Class10.SID='"+str+"'";
                //else if(str2=="Class10")sql="select Class10.SName from Class10 where Class10.SID='"+str+"'";

                pst=conn.prepareStatement(sql);
                rs2=pst.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(academicreport.class.getName()).log(Level.SEVERE, null, ex);
            }

            document.open();
            document.add(new Paragraph("                                 Snanaghat High School,Madaripur,Dhaka "));
            document.add(new Paragraph("                                     \n\n"));
            document.add(new Paragraph("                    Examination :  "+semister_txt.getSelectedItem()+"\n\n"));
            PdfPTable pdf=new PdfPTable(6);
            PdfPCell pdfcell=new PdfPCell(new Paragraph("\\nStudent ID : "+str1+"  Name : "+"  "+rs2.getString(1)+" \nRoll No : "+rs2.getString(2)+" \nTotalMark : "+rs2.getString(3)+"\n"));
            pdfcell.setColspan(6);
            pdfcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            pdfcell.setBorderColor(BaseColor.RED);
            pdfcell.setBackgroundColor(BaseColor.WHITE);
            pdf.addCell(pdfcell);
            pdf.addCell("Subject");
            pdf.addCell("MCQ");
            pdf.addCell("Written");
            pdf.addCell("Total");
            pdf.addCell("Grade");
            pdf.addCell("Maximum");
            pdf.addCell("Bangla Frist Paper");//,FontFactory.getFont(FontFactory.TIMES_ROMAN, 18, BaseColor.WHITE));
        try {

            pdf.addCell(rs.getString(1));
            pdf.addCell(rs.getString(2));
            pdf.addCell(rs.getString(3));
            pdf.addCell(rs.getString(4));
            pdf.addCell(rs1.getString(1));
            pdf.addCell("Bangla Second Paper");
            pdf.addCell(rs.getString(5));
            pdf.addCell(rs.getString(6));
            pdf.addCell(rs.getString(7));
            pdf.addCell(rs.getString(8));
            pdf.addCell(rs1.getString(2));
            pdf.addCell("English Frist Paper");
            pdf.addCell(rs.getString(9));
            pdf.addCell(rs.getString(10));
            pdf.addCell(rs.getString(11));
            pdf.addCell(rs.getString(12));
            pdf.addCell(rs1.getString(3));
            pdf.addCell("English Second Paper");
            pdf.addCell(rs.getString(13));
            pdf.addCell(rs.getString(14));
            pdf.addCell(rs.getString(15));
            pdf.addCell(rs.getString(16));
            pdf.addCell(rs1.getString(4));
            pdf.addCell("Mathematics");
            pdf.addCell(rs.getString(17));
            pdf.addCell(rs.getString(18));
            pdf.addCell(rs.getString(19));
            pdf.addCell(rs.getString(20));
            pdf.addCell(rs1.getString(5));
            pdf.addCell("Science");
            pdf.addCell(rs.getString(21));
            pdf.addCell(rs.getString(22));
            pdf.addCell(rs.getString(23));
            pdf.addCell(rs.getString(24));
            pdf.addCell(rs1.getString(6));
            pdf.addCell("ICT");
            pdf.addCell(rs.getString(25));
            pdf.addCell(rs.getString(26));
            pdf.addCell(rs.getString(27));
            pdf.addCell(rs.getString(28));
            pdf.addCell(rs1.getString(7));

            pdf.addCell("Religion");
            pdf.addCell(rs.getString(29));
            pdf.addCell(rs.getString(30));
            pdf.addCell(rs.getString(31));
            pdf.addCell(rs.getString(32));
            pdf.addCell(rs1.getString(8));
            pdf.addCell("Sociology");
            pdf.addCell(rs.getString(33));
            pdf.addCell(rs.getString(34));
            pdf.addCell(rs.getString(35));
            pdf.addCell(rs.getString(36));
            pdf.addCell(rs1.getString(9));
            pdf.addCell("Agriculture");
            pdf.addCell(rs.getString(37));
            pdf.addCell(rs.getString(38));
            pdf.addCell(rs.getString(39));
            pdf.addCell(rs.getString(40));
            pdf.addCell(rs1.getString(10));
            pdf.addCell("Career");
            pdf.addCell(rs.getString(41));
            pdf.addCell(rs.getString(42));
            pdf.addCell(rs.getString(43));
            pdf.addCell(rs.getString(44));
            pdf.addCell(rs1.getString(11));
            document.add(pdf);
        } catch (SQLException ex) {
            Logger.getLogger(academicreport.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.add(new Paragraph("           Final Grade :  "+rs2.getString(4)));
        document.add(new Paragraph("           Totalmark :  "+rs2.getString(3)));

        document.close();
        } catch (DocumentException ex) {
            Logger.getLogger(academicreport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(academicreport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_report_txtActionPerformed

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
            java.util.logging.Logger.getLogger(academicreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(academicreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(academicreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(academicreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new academicreport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_txt;
    private javax.swing.JComboBox<String> class_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ok_txt;
    private javax.swing.JButton report_txt;
    private javax.swing.JComboBox<String> semister_txt;
    // End of variables declaration//GEN-END:variables
}
