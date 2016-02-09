package br.com.leo.ed.controller;

import javax.swing.JOptionPane;

import br.com.leo.ed.model.Fila;
import br.com.leo.ed.util.ValidaCampo;
import br.com.leo.ed.view.FilaUI;

public class FilaController {

    private FilaUI fView;
    private Fila list = Fila.getInstance();

    public FilaController(FilaUI fView) {
        this.fView = fView;
        initActions();
    }

    private void initActions() {

        fView.setLocationRelativeTo(null);

        fView.getBtnIncluir().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        fView.getBtnRemover().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        fView.getTxtEntrada().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntradaKeyTyped(evt);
            }
        });

        fView.setVisible(true);
    }

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {
        if (fView.getTxtEntrada().getText().length() > 0) {
            list.adiciona(Integer.parseInt(fView.getTxtEntrada().getText()));
            fView.getTxtExibe().setText(list.listFila());
            fView.getLblTamanho().setText(list.tamanho() + "");
            fView.getTxtEntrada().setText(null);
            fView.getTxtEntrada().requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Campo Vazio!");
        }
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        if (!list.remove()) {
            JOptionPane.showMessageDialog(null, "Fila Vazia!");
        }
        fView.getTxtExibe().setText(list.listFila());
        fView.getLblTamanho().setText(list.tamanho() + "");
    }

    private void txtEntradaKeyTyped(java.awt.event.KeyEvent evt) {
        ValidaCampo.apenasNumeros(evt);
    }

}
