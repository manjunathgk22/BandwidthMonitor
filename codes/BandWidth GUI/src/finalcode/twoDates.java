/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * twoDates.java
 *
 * Created on Apr 10, 2010, 2:34:53 PM
 */

package frontend;
import javax.swing.*;
/**
 *
 * @author USER1
 */
public class twoDates extends javax.swing.JFrame {
public String day12,day13,month12,month13,year12,year13;
public static String reqDate1,reqDate2;
    /** Creates new form twoDates */
    public twoDates() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        day10 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        month10 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        year10 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        day11 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        month11 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        year11 = new javax.swing.JComboBox();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("TRAFFIC REPORT BETWEEN GIVEN TWO DATES");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("  Day");

        day10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "day1","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day10ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Month");

        month10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "month1","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month10ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Year");

        year10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "year1","2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        year10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year10ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Choose From Date");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Choose To Date");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("  Day");

        day11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "day2","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day11ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Month");

        month11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "month2","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month11ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("Year");

        year11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "year2","2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        year11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year11ActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jToggleButton2.setForeground(new java.awt.Color(153, 0, 153));
        jToggleButton2.setText("OK");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jToggleButton1.setForeground(new java.awt.Color(153, 0, 153));
        jToggleButton1.setText("BACK");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(day10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(month10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(month11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(99, 99, 99)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(day10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(month10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(year10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(month11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(year11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(day11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void day10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day10ActionPerformed
        // TODO add your handling code here:
          Object  team=day10.getSelectedItem();
 day12=team.toString();
}//GEN-LAST:event_day10ActionPerformed

    private void day11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day11ActionPerformed
        // TODO add your handling code here:
          Object  team=day11.getSelectedItem();
 day13=team.toString();
    }//GEN-LAST:event_day11ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
               // TODO add your handling code here:
 if ((day10.getSelectedItem().equals("day1"))) {
            JOptionPane.showMessageDialog(null, "Day1 is not selected");
        } else {
            if ((month10.getSelectedItem().equals("month1"))) {
                JOptionPane.showMessageDialog(null, "Month1 is not selected");
            } else {
                if ((year10.getSelectedItem().equals("year1"))) {
                    JOptionPane.showMessageDialog(null, "Year1 is not selected");
                } else {
                if ((day11.getSelectedItem().equals("day2"))) {
            JOptionPane.showMessageDialog(null, "Day2 is not selected");
        } else {
            if ((month11.getSelectedItem().equals("month2"))) {
                JOptionPane.showMessageDialog(null, "Month2 is not selected");
            } else {
                if ((year11.getSelectedItem().equals("year2"))) {
                    JOptionPane.showMessageDialog(null, "Year2 is not selected");
                } else {

reqDate1=day12;
reqDate2=day13;
if(month12.equals("January"))
    
{reqDate1=year12+"01"+reqDate1;
//reqDate2=reqDate2+"/01/"+year13;
}
else if(month12.equals("February"))
    reqDate1=year12+"02"+reqDate1;
else if(month12.equals("March"))
    reqDate1=year12+"03"+reqDate1;
else if(month12.equals("April"))
    reqDate1=year12+"04"+reqDate1;
else if(month12.equals("May"))
    reqDate1=year12+"05"+reqDate1;
else if(month12.equals("June"))
    reqDate1=year12+"06"+reqDate1;
else if(month12.equals("July"))
    reqDate1=year12+"07"+reqDate1;
else if(month12.equals("August"))
    reqDate1=year12+"08"+reqDate1;
else if(month12.equals("September"))
    reqDate1=year12+"09"+reqDate1;
else if(month12.equals("October"))
    reqDate1=year12+"10"+reqDate1;
else if(month12.equals("November"))
    reqDate1=year12+"11"+reqDate1;
else if(month12.equals("December"))
    reqDate1=year12+"12"+reqDate1;



if(month13.equals("January"))

{//reqDate1=reqDate1+"/01/"+year12;
reqDate2=year13+"01"+reqDate2;
}
else if(month13.equals("February"))
    reqDate2=year13+"02"+reqDate2;
else if(month13.equals("March"))
    reqDate2=year13+"03"+reqDate2;
else if(month13.equals("April"))
    reqDate2=year13+"04"+reqDate2;
else if(month13.equals("May"))
    reqDate2=year13+"05"+reqDate2;
else if(month13.equals("June"))
    reqDate2=year13+"06"+reqDate2;
else if(month13.equals("July"))
    reqDate2=year13+"07"+reqDate2;
else if(month13.equals("August"))
    reqDate2=year13+"08"+reqDate2;
else if(month13.equals("September"))
    reqDate2=year13+"09"+reqDate2;
else if(month13.equals("October"))
    reqDate2=year13+"10"+reqDate2;
else if(month13.equals("November"))
    reqDate2=year13+"11"+reqDate2;
else if(month13.equals("December"))
    reqDate2=year13+"12"+reqDate2;
System.out.println(reqDate1);
System.out.println(reqDate2);
setVisible(false);
new displayReport2Date().setVisible(true);
       
}//GEN-LAST:event_jToggleButton2ActionPerformed
            }
        }
                }
            }
        }
    }
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new reportsOnDate().setVisible(true);
}//GEN-LAST:event_jToggleButton1ActionPerformed

    private void month10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month10ActionPerformed
        // TODO add your handling code here:
          Object  team=month10.getSelectedItem();
 month12=team.toString();
    }//GEN-LAST:event_month10ActionPerformed

    private void year10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year10ActionPerformed
        // TODO add your handling code here:
          Object  team=year10.getSelectedItem();
 year12=team.toString();
    }//GEN-LAST:event_year10ActionPerformed

    private void month11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month11ActionPerformed
        // TODO add your handling code here:
          Object  team=month11.getSelectedItem();
 month13=team.toString();
    }//GEN-LAST:event_month11ActionPerformed

    private void year11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year11ActionPerformed
        // TODO add your handling code here:
          Object  team=year11.getSelectedItem();
 year13=team.toString();
    }//GEN-LAST:event_year11ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new twoDates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox day10;
    private javax.swing.JComboBox day11;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JComboBox month10;
    private javax.swing.JComboBox month11;
    private javax.swing.JComboBox year10;
    private javax.swing.JComboBox year11;
    // End of variables declaration//GEN-END:variables

}
