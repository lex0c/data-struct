package br.com.leo.ed.controller;

import javax.swing.JOptionPane;

import br.com.leo.ed.model.bo.Ordenacao;
import br.com.leo.ed.model.Lista;
import br.com.leo.ed.util.ValidaCampo;
import br.com.leo.ed.view.BuscaUI;
import br.com.leo.ed.view.DetalhesUI;
import br.com.leo.ed.view.PrincipalUI;

public class PrincipalController {

    private PrincipalUI pView;
    private Lista list = Lista.getInstance();

    public PrincipalController(PrincipalUI pView) {
        this.pView = pView;
        initActions();
        configInit();
    }

    private void configInit() {

        pView.getTxtCampoPrincipal().requestFocus();

        pView.getBtnOrdenar().setEnabled(false);
        pView.getBtnDetalhes().setEnabled(false);
        pView.getBtnBuscar().setEnabled(false);
    }

    private void initActions() {

        pView.setLocationRelativeTo(null);

        pView.getBtnGerar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        pView.getBtnOrdenar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        pView.getBtnDetalhes().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        pView.getBtnBuscar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        pView.getTxtCampoPrincipal().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoPrincipalKeyTyped(evt);
            }
        });

        pView.setVisible(true);
    }

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {

        if ((pView.getTxtCampoPrincipal().getText().length() > 0)) {

            try {

                int tamanho = Integer.parseInt(pView.getTxtCampoPrincipal().getText());

                if (tamanho > 1) {

                    list.factory(pView.getCBTipo().getSelectedItem().toString(), tamanho);

                    pView.getTxtaSaida().setText((list.getPreOrdenacao().toString().replaceAll("\\[|\\]", "")));
                    pView.getBtnOrdenar().setEnabled(true);
                    pView.getBtnDetalhes().setEnabled(false);
                    pView.getBtnBuscar().setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Crie no minimo um vetor de duas posições!");
                    pView.getTxtCampoPrincipal().setText(null);
                }

            } catch (OutOfMemoryError | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Limite Excedido! Insira um valor menor.");
                pView.getTxtCampoPrincipal().setText(null);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Insira um tamanho valido!");
            pView.getTxtCampoPrincipal().setText(null);
        }

        pView.getTxtCampoPrincipal().requestFocus();
    }

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {

        new Ordenacao().selecionarAlgoritmo(pView.getCbSortingAlgorithms().getSelectedIndex());
        pView.getTxtaSaida().setText(list.getPosOrdenacao().toString().replaceAll("\\[|\\]", ""));

        pView.getBtnDetalhes().setEnabled(true);
        pView.getBtnBuscar().setEnabled(true);
        pView.getTxtCampoPrincipal().requestFocus();
    }

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {
        DetalhesUI dView = new DetalhesUI();
        new DetalhesController(dView);
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        BuscaUI bView = new BuscaUI();
        new BuscaController(bView);
    }

    private void txtCampoPrincipalKeyTyped(java.awt.event.KeyEvent evt) {
        ValidaCampo.apenasNumeros(evt);
    }

}
