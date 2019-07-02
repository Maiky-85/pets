/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets.telasMob;


//import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Image;
import java.util.List;
//import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.SwingConstants;
//import org.netbeans.lib.awtextra.AbsoluteLayout;
import pets.persistenciaArquivo.PersistenciaArquivo;


/**
 *
 * @author B. Dalzini
 */
public class InicialV2 extends javax.swing.JFrame {

    /**
     * Creates new form InicialV2
     */
    public InicialV2() {
        initComponents();
        
        this.setPosX(jLabel2.getX());
        File arq = new File("animal.csv");
        
        if(arq.exists()){
            FileReader fr = null;
            try {
                fr = new FileReader(arq);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br = new BufferedReader(fr);

            //List <String> dados = new ArrayList();
            //List<String[]> dadosAnimal = new ArrayList();

            String linha; 

            try {
                while ((linha = br.readLine()) != null) {
                    String[] values = linha.split(";");
                    //System.out.println(Arrays.toString(values));
                    dadosAnimal.add(values);
                    
                    
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(dadosAnimal.size());
            
            if (dadosAnimal.size() > 1){         
                jLabel2.setPreferredSize(new Dimension(43, 43));
                jLabel2.setSize(43,43);

                this.setAtualClicked(jLabel2);
                
                loadImage(dadosAnimal.get(1)[0], jLabel2);

                try {
                    testeLoadInfo(1);

                } catch (IOException ex) {
                    Logger.getLogger(InicialV2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //System.out.println(jLabel2.getName());
                criaLabelsIcons();
            }
            
            
      }
        else{
           
        }
        
                        /*
                if(dadosAnimal.size() > 1){
                //continuaTesteLoadInfo(dadosAnimal);
                
                loadImage(dadosAnimal.get(1)[0], labelFoto);
                
                this.campoNome.setText(dadosAnimal.get(1)[1]);
                this.campoTipo.setText(dadosAnimal.get(1)[2]);
                this.campoCor.setText(dadosAnimal.get(1)[3]);
                this.campoRaca.setText(dadosAnimal.get(1)[4]);
                this.campoPorte.setText(dadosAnimal.get(1)[6]);
                
                }
                else{
                
                }
            */
        
        //loadImage();
        /*
        try {
            testeLoadInfo();
        } catch (IOException ex) {
            
        }*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoPontos = new javax.swing.JButton();
        botaoMenu = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botaoEditar = new javax.swing.JButton();
        botaoDeletar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelRaca = new javax.swing.JLabel();
        labelPorte = new javax.swing.JLabel();
        campoNome = new javax.swing.JLabel();
        campoTipo = new javax.swing.JLabel();
        campoCor = new javax.swing.JLabel();
        campoRaca = new javax.swing.JLabel();
        campoPorte = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        bgFoto = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(301, 534));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(301, 534));
        jPanel2.setPreferredSize(new java.awt.Dimension(301, 534));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoPontos.setBackground(new java.awt.Color(255, 255, 255));
        botaoPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/sairicon2.png"))); // NOI18N
        botaoPontos.setToolTipText("Sair da conta");
        botaoPontos.setBorder(null);
        botaoPontos.setBorderPainted(false);
        botaoPontos.setContentAreaFilled(false);
        botaoPontos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPontos.setPreferredSize(new java.awt.Dimension(35, 35));
        botaoPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontosActionPerformed(evt);
            }
        });
        jPanel2.add(botaoPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

        botaoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/menuicon3.png"))); // NOI18N
        botaoMenu.setToolTipText("Menu");
        botaoMenu.setBorder(null);
        botaoMenu.setContentAreaFilled(false);
        botaoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });
        jPanel2.add(botaoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 40));

        botaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/add4.png"))); // NOI18N
        botaoAdicionar.setToolTipText("Adicionar um animal");
        botaoAdicionar.setBorder(null);
        botaoAdicionar.setBorderPainted(false);
        botaoAdicionar.setContentAreaFilled(false);
        botaoAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, 50));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(330, 70));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jScrollPane1.setViewportView(jPanel5);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 230, 55));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");
        jPanel4.setAlignmentY(0.0F);

        botaoEditar.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        botaoEditar.setForeground(new java.awt.Color(153, 153, 153));
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(null);
        botaoEditar.setBorderPainted(false);
        botaoEditar.setContentAreaFilled(false);
        botaoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoDeletar.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        botaoDeletar.setForeground(new java.awt.Color(153, 153, 153));
        botaoDeletar.setText("Deletar");
        botaoDeletar.setBorder(null);
        botaoDeletar.setBorderPainted(false);
        botaoDeletar.setContentAreaFilled(false);
        botaoDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelNome.setForeground(new java.awt.Color(102, 102, 102));
        labelNome.setText("Nome:");

        labelTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(102, 102, 102));
        labelTipo.setText("Tipo:");

        labelCor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelCor.setForeground(new java.awt.Color(102, 102, 102));
        labelCor.setText("Cor:");

        labelRaca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelRaca.setForeground(new java.awt.Color(102, 102, 102));
        labelRaca.setText("Raça:");

        labelPorte.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelPorte.setForeground(new java.awt.Color(102, 102, 102));
        labelPorte.setText("Porte:");

        campoNome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoNome.setForeground(new java.awt.Color(102, 102, 102));
        campoNome.setText("?");

        campoTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoTipo.setForeground(new java.awt.Color(102, 102, 102));
        campoTipo.setText("?");

        campoCor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoCor.setForeground(new java.awt.Color(102, 102, 102));
        campoCor.setText("?");

        campoRaca.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoRaca.setForeground(new java.awt.Color(102, 102, 102));
        campoRaca.setText("?");

        campoPorte.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        campoPorte.setForeground(new java.awt.Color(102, 102, 102));
        campoPorte.setText("?");

        labelFoto.setBackground(new java.awt.Color(102, 102, 102));
        labelFoto.setToolTipText("Foto");
        labelFoto.setOpaque(true);
        labelFoto.setPreferredSize(new java.awt.Dimension(78, 78));

        bgFoto.setBackground(new java.awt.Color(255, 255, 255));
        bgFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 4, new java.awt.Color(255, 186, 120)));
        bgFoto.setOpaque(true);
        bgFoto.setPreferredSize(new java.awt.Dimension(86, 80));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botaoEditar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botaoDeletar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCor)
                    .addComponent(labelTipo)
                    .addComponent(labelRaca)
                    .addComponent(labelNome)
                    .addComponent(labelPorte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoRaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(botaoEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDeletar)
                .addGap(22, 22, 22))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addGap(4, 4, 4)
                        .addComponent(labelTipo)
                        .addGap(4, 4, 4)
                        .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRaca)
                            .addComponent(campoRaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPorte))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(campoNome)
                        .addGap(4, 4, 4)
                        .addComponent(campoTipo)
                        .addGap(3, 3, 3)
                        .addComponent(campoCor)
                        .addGap(24, 24, 24)
                        .addComponent(campoPorte)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets/telasMob/mapa.png"))); // NOI18N
        mapa.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel2.add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 300, 235));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testes/principal.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        //        CadastroAnimal cadastroAnimal = new CadastroAnimal();
        //        cadastroAnimal.setVisible(true);

        CadastroAnimalV2 cadastroAnimalV2 = new CadastroAnimalV2();
        cadastroAnimalV2.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        String nome = JOptionPane.showInputDialog("Nome do animal");
        PersistenciaArquivo deletar = new PersistenciaArquivo();
        try {
            deletar.deletarDadosAnimal(nome,"animal.csv"); //Deletar animal do parâmetro nome
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void loadImage(String fileName, JLabel label){
        
        //teste
        //File folderInput = new File("fotos/a1.JPG");
        File file = new File("fotos/", fileName);
        TesteResizeFoto tamanho = new TesteResizeFoto();
        label.setIcon(tamanho.ResizeImage(file.getAbsolutePath(), label));
    }
    
    private void continuaTesteLoadInfo(List<String[]> dados){
        
        campoNome.setText(dados.get(1)[1]);
        
    }
    
  
    
    private void testeLoadInfo(int pos) throws FileNotFoundException, IOException{
        
        
        if(dadosAnimal.size() > 1){
            //continuaTesteLoadInfo(dadosAnimal);

            loadImage(dadosAnimal.get(pos)[0], labelFoto);

            this.campoNome.setText(dadosAnimal.get(pos)[1]);
            this.campoTipo.setText(dadosAnimal.get(pos)[2]);
            this.campoCor.setText(dadosAnimal.get(pos)[3]);
            this.campoRaca.setText(dadosAnimal.get(pos)[4]);
            this.campoPorte.setText(dadosAnimal.get(pos)[6]);

        }
        
        
        
        /*
        File arq = new File("animal.csv");
        
        if(arq.exists()){
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);

            //List <String> dados = new ArrayList();
            List<String[]> dadosAnimal = new ArrayList();

            String linha; 

            while ((linha = br.readLine()) != null) {
                String[] values = linha.split(";");
                //System.out.println(Arrays.toString(values));
                dadosAnimal.add(values);
                
                
                
            }
            System.out.println(dadosAnimal.size());

            if(dadosAnimal.size() > 1){
                //continuaTesteLoadInfo(dadosAnimal);
                
                loadImage(dadosAnimal.get(1)[0], labelFoto);
                
                this.campoNome.setText(dadosAnimal.get(1)[1]);
                this.campoTipo.setText(dadosAnimal.get(1)[2]);
                this.campoCor.setText(dadosAnimal.get(1)[3]);
                this.campoRaca.setText(dadosAnimal.get(1)[4]);
                this.campoPorte.setText(dadosAnimal.get(1)[6]);
                
            }
            else{

            }
        }
        else{
           
        }*/

        
    }
    
    private int getPosX(){
        return this.posX;
    }
    
    private void setPosX(int posX){
        this.posX += posX;
    }
   
    private JLabel getAtualClicked(){
        
        return this.atualClicked;
    }
    
    private void setAtualClicked(JLabel label){
        
        this.atualClicked = label;
        
    }
    
    private void novoLabelClicked(java.awt.event.MouseEvent evt){
        
        JLabel novoT = new JLabel();
        novoT = (JLabel) evt.getSource();
        
        
        resizeLabelSelecionado(this.atualClicked, 35, 35);
        
        this.setAtualClicked(novoT);
        
        resizeLabelSelecionado(novoT, 43, 43);
        
        
        
        try {
            testeLoadInfo(1);
        } catch (IOException ex) {
            
        }
        
    }
    
    private void criaLabelsIcons(){
        
        if(dadosAnimal.size() > 2){
            
            
            for(int i = 2; dadosAnimal.size() > i; i++){
                
                if(i == 2){
                    this.setPosX(60);
                }
                else{
                    this.setPosX(52);
                }
                
                JLabel novoLabel = new javax.swing.JLabel();
                
                novoLabel.setOpaque(true);
                novoLabel.setPreferredSize(new java.awt.Dimension(35, 35));
                novoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        novoLabelClicked(evt);
                    }
                });
                jPanel5.add(novoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(this.getPosX(), 5, -1, -1));

                novoLabel.setBounds(this.getPosX(), 5, 35, 35);
                
                loadImage(dadosAnimal.get(i)[0], novoLabel);
                
                
                
                
            
            
            }
            
            
            
        }
        
        
    }
    
    
    private void resizeLabelSelecionado(JLabel label, int x, int y){
        System.out.println("click");
        label.setPreferredSize(new Dimension(x, y));
        label.setSize(x, y);
    }
    
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        
        resizeLabelSelecionado(this.atualClicked, 35, 35);
        
        this.setAtualClicked(jLabel2);
        
        resizeLabelSelecionado(jLabel2, 43, 43);
        
        
        //BufferedImage folderImage = ImageIO.read(folderInput);
        //ImageIcon im = new ImageIcon(folderImage);
        //jLabel2.setIcon(im);
        
        //loadImage();
        
        try {
            //mostrar info
            testeLoadInfo(1);
        } catch (IOException ex) {
            
        }
        
        
        
         
        
    }//GEN-LAST:event_jLabel2MouseClicked

    
    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
    }//GEN-LAST:event_jLabel2MouseExited

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        Menu menu;
        try {
            menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Inicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontosActionPerformed
        int nome = JOptionPane.showConfirmDialog(null, "Deseja sair?");
        if (nome==0){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoPontosActionPerformed

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
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgFoto;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoPontos;
    private javax.swing.JLabel campoCor;
    private javax.swing.JLabel campoNome;
    private javax.swing.JLabel campoPorte;
    private javax.swing.JLabel campoRaca;
    private javax.swing.JLabel campoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPorte;
    private javax.swing.JLabel labelRaca;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel mapa;
    // End of variables declaration//GEN-END:variables

    private List<String[]> dadosAnimal = new ArrayList();
    private int posX = 0;
    private JLabel atualClicked = null;

}
