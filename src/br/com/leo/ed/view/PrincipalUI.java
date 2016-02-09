package br.com.leo.ed.view;

@SuppressWarnings("serial")
public class PrincipalUI extends javax.swing.JFrame {

    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnOrdenar;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox cbSortingAlgorithms;
    @SuppressWarnings("rawtypes")
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCampoPrincipal;
    private javax.swing.JTextArea txtaSaida;

    public PrincipalUI() {
        initComponents();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        txtCampoPrincipal = new javax.swing.JTextField();
        btnGerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaSaida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cbSortingAlgorithms = new javax.swing.JComboBox();
        btnOrdenar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox();

        jInternalFrame1.setVisible(true);
        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame1Layout.setVerticalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manipulador de Vetor");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Tamanho:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Ordenação:");

        txtaSaida.setEditable(false);
        txtaSaida.setColumns(20);
        txtaSaida.setRows(5);
        jScrollPane1.setViewportView(txtaSaida);

        btnGerar.setText("Gerar");
        btnOrdenar.setText("Ordenar");
        btnDetalhes.setText("Detalhes");
        btnBuscar.setText("Buscar");

        cbSortingAlgorithms.setModel(
                new javax.swing.DefaultComboBoxModel(
                        new String[]{"InsertionSort", "SelectionSort", "BubbleSort", "QuickSort", "ShellSort", "HeapSort"}
                )
        );

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Aleatório", "Decrescente", "Crescente"}));

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
                                        .addComponent(cbSortingAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOrdenar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDetalhes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCampoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGerar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                        .addContainerGap())
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCampoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(btnGerar)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnOrdenar)
                                .addComponent(cbSortingAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDetalhes)
                                .addComponent(btnBuscar)
                                .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    //Getters and Setters
    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    public javax.swing.JButton getBtnDetalhes() {
        return btnDetalhes;
    }

    public javax.swing.JButton getBtnGerar() {
        return btnGerar;
    }

    public javax.swing.JButton getBtnOrdenar() {
        return btnOrdenar;
    }

    @SuppressWarnings("rawtypes")
    public javax.swing.JComboBox getCbSortingAlgorithms() {
        return cbSortingAlgorithms;
    }

    @SuppressWarnings("rawtypes")
    public javax.swing.JComboBox getCBTipo() {
        return cbTipo;
    }

    public javax.swing.JTextField getTxtCampoPrincipal() {
        return txtCampoPrincipal;
    }

    public javax.swing.JTextArea getTxtaSaida() {
        txtaSaida.setLineWrap(true);
        return txtaSaida;
    }

}
