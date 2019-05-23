/*
 * PetSOS
 * Aplicativo para localicação de animais domésticos perdidos
 * Projeto de Programação Orientada a Objetos I
 */

/**
 * @author Brunna Dalzini
 * @author Maikysuel Braga
 * @author Rafaela Pessin
*/ 

package pets.telas;

import pets.modelo.Contato;
import pets.modelo.Dono;
import pets.modelo.RedeSocial;
import pets.persistenciaArquivo.PersistenciaArquivo;

/**
 *
 * @author 20162bsi0490
 */
public class CadastroDono extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDono2
     */
    public CadastroDono() {
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

        whatsapp = new javax.swing.JLabel();
        campoWhatsapp = new javax.swing.JFormattedTextField();
        twitter = new javax.swing.JLabel();
        campoTwitter = new javax.swing.JTextField();
        instagram = new javax.swing.JLabel();
        campoInstagram = new javax.swing.JTextField();
        facebook = new javax.swing.JLabel();
        campoFacebook = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        numTelefone = new javax.swing.JLabel();
        campoNumTelefone = new javax.swing.JFormattedTextField();
        campoNumCelular = new javax.swing.JFormattedTextField();
        numCelular = new javax.swing.JLabel();
        dadosDono = new javax.swing.JLabel();
        botaoFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        whatsapp.setText("WhatsApp");

        try {
            campoWhatsapp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        twitter.setText("Twitter");

        instagram.setText("Instagram");

        facebook.setText("Facebook");

        email.setText("E-mail");

        numTelefone.setText("Telefone");

        try {
            campoNumTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        numCelular.setText("Celular");

        dadosDono.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        dadosDono.setText("Contato");

        botaoFinalizar.setText("Finalizar");
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dadosDono)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numTelefone)
                                .addGap(27, 27, 27)
                                .addComponent(campoNumTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numCelular)
                                .addGap(18, 18, 18)
                                .addComponent(campoNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(facebook))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail)
                                    .addComponent(campoFacebook)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instagram)
                                    .addComponent(twitter)
                                    .addComponent(whatsapp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoInstagram)
                                    .addComponent(campoTwitter)
                                    .addComponent(campoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(botaoFinalizar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dadosDono)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numTelefone)
                    .addComponent(campoNumTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCelular)
                    .addComponent(campoNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facebook)
                    .addComponent(campoFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instagram)
                    .addComponent(campoInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twitter)
                    .addComponent(campoTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whatsapp)
                    .addComponent(campoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(botaoFinalizar)
                .addGap(28, 28, 28))
        );

        campoNumTelefone.getAccessibleContext().setAccessibleDescription("");
        campoNumTelefone.getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        
        Contato contatoDono = new Contato(this.campoNumTelefone.getText(), this.campoNumCelular.getText(), this.campoEmail.getText());
        RedeSocial redeSocial = new RedeSocial(this.campoFacebook.getText(), this.campoTwitter.getText(), this.campoInstagram.getText(), this.campoWhatsapp.getText());
        
        Dono novoDono = new Dono(contatoDono, redeSocial);
        
        //Dono novoDono = new Dono(this.campoNumTelefone.getText(), this.campoNumCelular.getText(), this.campoEmail.getText(), this.campoFacebook.getText(), this.campoTwitter.getText(), this.instagram.getText(), this.campoWhatsapp.getText());
        
        /*Dono novoDono = new Dono(this.campoNome.getText(), this.campoRua.getText(), this.campoNumero.getText(), this.campoBairro.getText(), this.campoMunicipio.getText(), this.campoCep.getText(), this.campoCep.getText(),
        this.campoNumTelefone.getText(), this.campoNumCelular.getText(), this.campoEmail.getText(), 
        this.campoFacebook.getText(), this.campoTwitter.getText(), this.instagram.getText(), this.campoWhatsapp.getText());*/

        // vai salvar os dados do formulário do animal na persistencia de arquivo
        PersistenciaArquivo persistencia = new PersistenciaArquivo();
        
        persistencia.salvarDadosDono(novoDono);
    }//GEN-LAST:event_botaoFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
              
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFacebook;
    private javax.swing.JTextField campoInstagram;
    private javax.swing.JFormattedTextField campoNumCelular;
    private javax.swing.JFormattedTextField campoNumTelefone;
    private javax.swing.JTextField campoTwitter;
    private javax.swing.JFormattedTextField campoWhatsapp;
    private javax.swing.JLabel dadosDono;
    private javax.swing.JLabel email;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel instagram;
    private javax.swing.JLabel numCelular;
    private javax.swing.JLabel numTelefone;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel whatsapp;
    // End of variables declaration//GEN-END:variables
}
