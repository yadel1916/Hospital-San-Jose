/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalsanjose.views;

import autonoma.hospitalsanjose.models.Hospital;
import autonoma.hospitalsanjose.models.Medicamento;
import autonoma.hospitalsanjose.models.MedicamentoGenerico;
import autonoma.hospitalsanjose.models.MedicamentoMarca;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Katherin
 */
public class AgregarMedicamento extends javax.swing.JDialog {

    private Hospital hospital; 
    private MostrarFarmacia mostrarFarmacia;  
    
    public AgregarMedicamento(java.awt.Frame parent, boolean modal,Hospital hospital,MostrarFarmacia mostrarFarmacia) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try {
           this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/hospitalsanjose/images/pacientes.png")).getImage());
        }catch (Exception e){
            System.out.println("El icono no se pudo cargar");
        }
        this.hospital = hospital;
        this.mostrarFarmacia = mostrarFarmacia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionM = new javax.swing.JTextField();
        btnAgregarMGenerico = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCostoM = new javax.swing.JTextField();
        btnAgregarMMarca = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidadM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(107, 142, 35));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 220));
        jLabel1.setText("AGREGAR MEDICAMENTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 240, 230));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 105, 105));
        jLabel3.setText("Nombre");

        txtNombreM.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(105, 105, 105));
        jLabel4.setText("Descripción");

        txtDescripcionM.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarMGenerico.setBackground(new java.awt.Color(196, 222, 246));
        btnAgregarMGenerico.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAgregarMGenerico.setForeground(new java.awt.Color(105, 105, 105));
        btnAgregarMGenerico.setText("Agregar Medicamento Genérico");
        btnAgregarMGenerico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarMGenerico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMGenericoActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(196, 222, 246));
        btnVolver.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(105, 105, 105));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(105, 105, 105));
        jLabel7.setText("Costo");

        txtCostoM.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarMMarca.setBackground(new java.awt.Color(196, 222, 246));
        btnAgregarMMarca.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAgregarMMarca.setForeground(new java.awt.Color(105, 105, 105));
        btnAgregarMMarca.setText("Agregar Medicamento Marca");
        btnAgregarMMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarMMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMMarcaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(105, 105, 105));
        jLabel8.setText("Fabricante");

        txtFabricante.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(105, 105, 105));
        jLabel9.setText("Cantidad");

        txtCantidadM.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(262, 262, 262))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAgregarMGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnAgregarMMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionM, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCostoM, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDescripcionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCostoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarMGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarMMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMGenericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMGenericoActionPerformed
        try{
            String nombre = this.txtNombreM.getText();
            String descripcion = this.txtDescripcionM.getText();
            double costo = Double.parseDouble(this.txtCostoM.getText());
            int cantidad = Integer.parseInt(this.txtCantidadM.getText()); 
 
            Medicamento m = new MedicamentoGenerico(nombre,descripcion,costo,cantidad);
            if(this.hospital.agregarMedicamento(m)){
                JOptionPane.showMessageDialog(this," El medicamento "+nombre+" fue agregado exitosamente");
                this.mostrarFarmacia.llenarTabla();
                this.dispose();

            }
            else {
                JOptionPane.showMessageDialog(this," Ha ocurrido un error, el medicamento no se pudo agregar ");
                this.dispose();

            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Porfavor ingrese un número en el campo de texto");
            this.txtCostoM.setText("");
            this.txtCantidadM.setText("");
        }

    }//GEN-LAST:event_btnAgregarMGenericoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarMMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMMarcaActionPerformed
        try{
            String nombre = this.txtNombreM.getText();
            String descripcion = this.txtDescripcionM.getText();
            double costo = Double.parseDouble(this.txtCostoM.getText());
            String fabricante = this.txtFabricante.getText();
            int cantidad = Integer.parseInt(this.txtCantidadM.getText()); 
 
            Medicamento m = new MedicamentoMarca(fabricante,costo,nombre,descripcion,cantidad);
            if(this.hospital.agregarMedicamento(m)){
                JOptionPane.showMessageDialog(this," El medicamento "+nombre+" fue agregado exitosamente");
                this.mostrarFarmacia.llenarTabla();
                this.dispose();

            }
            else {
                JOptionPane.showMessageDialog(this," Ha ocurrido un error, el medicamento no se pudo agregar ");
                this.dispose();

            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Porfavor ingrese un número en el campo de texto");
            this.txtCostoM.setText("");
            this.txtCantidadM.setText("");
        }
    }//GEN-LAST:event_btnAgregarMMarcaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMGenerico;
    private javax.swing.JButton btnAgregarMMarca;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCantidadM;
    private javax.swing.JTextField txtCostoM;
    private javax.swing.JTextField txtDescripcionM;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtNombreM;
    // End of variables declaration//GEN-END:variables
}
