package br.com.leo.ed.view;

@SuppressWarnings("serial")
public class BuscaUI extends javax.swing.JFrame {

    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnFechar;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox cbSearchAlgorithms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtCampoPrincipal;
    private javax.swing.JTextArea txtaSaida;
	
    public BuscaUI(){
        initComponents();
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })                       
    private void initComponents(){

        jLabel1 = new javax.swing.JLabel();
        txtCampoPrincipal = new javax.swing.JTextField();
        cbSearchAlgorithms = new javax.swing.JComboBox();
        btnBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSaida = new javax.swing.JTextArea();
        btnFechar = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Procurar");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Buscar:");

        cbSearchAlgorithms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binaria", "Linear" }));

        txtaSaida.setEditable(false);
        txtaSaida.setColumns(20);
        txtaSaida.setRows(5);
        jScrollPane1.setViewportView(txtaSaida);

        btnBusca.setText("Buscar");
        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCampoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSearchAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBusca)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCampoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSearchAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFechar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }                          
    
    //Getters and Setters
    public javax.swing.JButton getBtnBusca(){
    	return btnBusca;
    }
    
    public javax.swing.JButton getBtnFechar(){
    	return btnFechar;
    }
    
    @SuppressWarnings("rawtypes")
	public javax.swing.JComboBox getCbSearchAlgorithms(){
    	return cbSearchAlgorithms;
    }
    
    public javax.swing.JLabel getLblResult(){
    	return lblResult;
    }
    
    public javax.swing.JTextField getTxtCampoPrincipal(){
    	return txtCampoPrincipal;
    }
    
    public javax.swing.JTextArea getTxtaSaida(){
    	txtaSaida.setLineWrap(true);
    	return txtaSaida;
    }
    
}