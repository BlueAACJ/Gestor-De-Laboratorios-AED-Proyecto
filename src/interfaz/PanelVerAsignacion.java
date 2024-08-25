package interfaz;

import TransferirDatos.ModeloDeTransferencia;

/**
 *
 * @author Usuario
 */
public class PanelVerAsignacion extends javax.swing.JPanel {
       
    /*
        Este panel nos seriviá para visualizar las asignaciones en otras palabras de lo que trata el ejercicio
        y las mostraremos en un TexArea
    
        Para ello usamos la clase ModeloDeTransferencia, la importamos y luego creamos un atributo del tipo 
        ModeloDeTransferencia y le nombramos como asignacion
    
        inicializamos el valor de asignacion en el constructor del formulario y le pasamos los valores que le dimos 
        en el formulario PanelLab3 y luego mostramos los datos usando la funcion get que creamos en la clase ModeloDeTransferencia
    */
    
    ModeloDeTransferencia asignacion; //creamos un atributo del tipo ModeloDeTransferencia que es la clase que creamos para 
                                      //transferir datos de tipo string entre formularios
    
    public PanelVerAsignacion(ModeloDeTransferencia asignacion) {
        
        this.asignacion = asignacion;
        initComponents();
        
        jTextArea1.setText("");
        jTextArea1.setText(asignacion.getAsignacion()); //Mostramos en jTextArea los valores del atributo asignacion
                                                        //usando su funcion get
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(232, 232, 232));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
