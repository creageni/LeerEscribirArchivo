/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leerescribirdocumento;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class LeerEscribirDocumento extends javax.swing.JFrame {

 
    public LeerEscribirDocumento() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtEscrbir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtLeer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        direccionA = new javax.swing.JTextField();
        nombreA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Ejercicio XV");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escribir");

        jLabel2.setText("Leer");

        jButton1.setText("Escribir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Leer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Ejercicio XVII");

        jLabel3.setText("Direccion");

        jLabel4.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEscrbir)
                            .addComponent(txtLeer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccionA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreA))
                .addContainerGap(21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEscrbir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Metodo que se llama al dar click al boton Escribir
        //Obtenemos los campos de los TextField  direccionA y nombreA  
        String nombre=nombreA.getText();
        String direccion=direccionA.getText();
        
        //Declaramos archivo de la clase File que me dara una descripcion del archivo
        //instanciamos ocn el constructor con los argumentos: patch(direccion) y nombre de archivo
        File archivo= new File(direccion,nombre);
        
        try {
            //Declaramos e instanciamos a escritor a partir de clase FileWriter y el constructor
            //Enviamos el argumento de entrada archivo
            FileWriter escritor=new FileWriter(archivo);
            //Obtenemos la cadena de texto en el TextField txtEscribir
            String datos= txtEscrbir.getText();
            //Escribimos la cadena de texto en el archivo
            escritor.write(datos);
            //Cerramos el FileWriter
            escritor.close();
            //Limpiamos Los textField
            
            txtEscrbir.setText("");
            txtLeer.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Metodo que se llama al dar click al boton Leer
        //Obtenemos los campos de los TextField  direccionA y nombreA  
        String nombre=nombreA.getText();
        String direccion=direccionA.getText();
        //Declaramos archivo de la clase File que me dara una descripcion del archivo
        //instanciamos ocn el constructor con los argumentos: patch(direccion) y nombre de archivo
        File archivo= new File(direccion,nombre);
        try {
            //Declaramos e instanciamos a lector a partir de clase FileReader y el constructor
            //Enviamos el argumento de entrada archivo
            FileReader lector = new FileReader(archivo);
            //Declaramos e instanciamos a buffer a partir de la Clase StringBuffer
            //buffer alamacenara caracter por caracter para luego generar el String
            StringBuffer  buffer = new StringBuffer();
            //Entero caracter para obtener cada dato del lector
            int caracter=0;
            //Asignamos el dato de lector. read() a caracter 
            //Al llamar el metodo read() se avanza una posicion en el archivo, la lectura se realiza caracter por caracter
            //El ciclo while continua mientrras caracter sea diferente de -1
            
            while((caracter=lector.read())!=-1){
                //agregamos al buffer el caracter
                //cast-> convertir un objeto de un tipo a otro
                //convertimos una variable de tipo int a una de tipo char
                buffer.append((char)caracter);
            }
            
            //Generamos el String apartir del buffer
            String datos=buffer.toString();
            //Imprimimos datos en el TextFiel txtLeer 
            txtLeer.setText(datos);
            //cerranis ek FileReader lector
            lector.close();
            
            
        } catch (FileNotFoundException ex) {
          txtLeer.setText("Objeto no Existe");
        } catch (IOException ex) {
            Logger.getLogger(LeerEscribirDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeerEscribirDocumento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccionA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreA;
    private javax.swing.JTextField txtEscrbir;
    private javax.swing.JTextField txtLeer;
    // End of variables declaration//GEN-END:variables
}
