package br.com.leo.ed.view;

@SuppressWarnings("serial")
public class EditaUI extends javax.swing.JFrame {

    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnEntendi;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtElemento;
    private javax.swing.JTextField txtPosicao;
    private javax.swing.JTextArea txtaSaida;
	
    public EditaUI(){
        initComponents();
    }
                         
    private void initComponents(){

        jLabel1 = new javax.swing.JLabel();
        txtPosicao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtElemento = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSaida = new javax.swing.JTextArea();
        btnDetalhes = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnEntendi = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Editar Vetor");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Posição:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Elemento:");

        txtaSaida.setEditable(false);
        txtaSaida.setColumns(20);
        txtaSaida.setRows(5);
        jScrollPane1.setViewportView(txtaSaida);

        btnAlterar.setText("Alterar");
        btnDetalhes.setText("Detalhes");
        btnFechar.setText("Fechar");
        btnEntendi.setText("Entendi");
        btnHelp.setText("?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntendi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetalhes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalhes)
                    .addComponent(btnFechar)
                    .addComponent(btnEntendi)
                    .addComponent(btnHelp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                      

    //Getters and Setters
    public javax.swing.JButton getBtnAlterar(){
    	return btnAlterar;
    }
    
    public javax.swing.JButton getBtnDetalhes(){
    	return btnDetalhes;
    }
    
    public javax.swing.JButton getBtnEntendi(){
    	return btnEntendi;
    }
    
    public javax.swing.JButton getBtnFechar(){
    	return btnFechar;
    }
    
    public javax.swing.JButton getBtnHelp(){
    	return btnHelp;
    }
    
    public javax.swing.JTextField getTxtElemento(){
    	return txtElemento;
    }
    
    public javax.swing.JTextField getTxtPosicao(){
    	return txtPosicao;
    }
    
    public javax.swing.JTextArea getTxtaSaida(){
    	txtaSaida.setLineWrap(true);
    	return txtaSaida;
    }
     
}