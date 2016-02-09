package br.com.leo.ed.controller;

import javax.swing.JOptionPane;

import br.com.leo.ed.model.Pilha;
import br.com.leo.ed.util.ValidaCampo;
import br.com.leo.ed.view.PilhaUI;

public class PilhaController {

    private PilhaUI pView;
    private Pilha list = Pilha.getInstance();

    public PilhaController(PilhaUI pView) {
        this.pView = pView;
        initActions();
    }

    private void initActions() {

        pView.setLocationRelativeTo(null);

        pView.getTxtEntrada().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaKeyTyped(evt);
            }
        });

        pView.getBtnPlhar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilharActionPerformed(evt);
            }
        });

        pView.getBtnRemover().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        pView.setVisible(true);
    }

    private void btnPilharActionPerformed(java.awt.event.ActionEvent evt) {
        if (pView.getTxtEntrada().getText().length() > 0) {
            list.adiciona(Integer.parseInt(pView.getTxtEntrada().getText()));
            pView.getTxtExibe().setText(list.listPilha());
            pView.getLblTamanho().setText(list.tamanho() + "");
            pView.getTxtEntrada().setText(null);
            pView.getTxtEntrada().requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Campo Vazio!");
        }
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        if (!list.remove()) {
            JOptionPane.showMessageDialog(null, "Pilha Vazia!");
        }
        pView.getTxtExibe().setText(list.listPilha());
        pView.getLblTamanho().setText(list.tamanho() + "");
    }

    private void txtEntradaKeyTyped(java.awt.event.KeyEvent evt) {
        ValidaCampo.apenasNumeros(evt);
    }

}
