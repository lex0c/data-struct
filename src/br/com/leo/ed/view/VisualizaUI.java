package br.com.leo.ed.view;

@SuppressWarnings("serial")
public class VisualizaUI extends javax.swing.JFrame {

    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextArea txtaInicial;
    private javax.swing.JTextArea txtaOrdenado;
	
    public VisualizaUI(){
        initComponents();
    }
                         
    private void initComponents(){

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaInicial = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaOrdenado = new javax.swing.JTextArea();
        btnFechar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        lblMetodo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vetores");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Vetor Inicial:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Vetor Ordenado:");

        txtaInicial.setEditable(false);
        txtaInicial.setColumns(20);
        txtaInicial.setRows(5);
        jScrollPane1.setViewportView(txtaInicial);

        txtaOrdenado.setEditable(false);
        txtaOrdenado.setColumns(20);
        txtaOrdenado.setRows(5);
        jScrollPane2.setViewportView(txtaOrdenado);

        lblTipo.setText("---");
        lblMetodo.setText("---");
        
        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblTipo)
                    .addComponent(lblMetodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    //Getters and Setters
    public javax.swing.JButton getBtnFechar(){
    	return btnFechar;
    }
    
    public javax.swing.JTextArea getTxtaInicial(){
    	txtaInicial.setLineWrap(true);
    	return txtaInicial;
    }
    
    public javax.swing.JTextArea getTxtaOrdenado(){
    	txtaOrdenado.setLineWrap(true);
    	return txtaOrdenado;
    }
    
    public javax.swing.JLabel getLblMetodo(){
    	return lblMetodo;
    }
    
    public javax.swing.JLabel getLblTipo(){
    	return lblTipo;
    }
    
}