package br.com.leo.ed.controller;

import javax.swing.JOptionPane;

import br.com.leo.ed.model.bo.Busca;
import br.com.leo.ed.model.vo.DadosDeBusca;
import br.com.leo.ed.model.Lista;
import br.com.leo.ed.util.ValidaCampo;
import br.com.leo.ed.view.BuscaUI;

public class BuscaController {

    private BuscaUI bView;
    private Lista list = Lista.getInstance();
    private DadosDeBusca dados = DadosDeBusca.getInstance();

    public BuscaController(BuscaUI bView) {
        this.bView = bView;
        initActions();
        configInit();
    }

    private void configInit() {
        bView.getTxtaSaida().setText(list.getPosOrdenacao().toString());
    }

    private void initActions() {

        bView.setLocationRelativeTo(null);

        bView.getTxtCampoPrincipal().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoPrincipalKeyTyped(evt);
            }
        });

        bView.getBtnBusca().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        bView.getBtnFechar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        bView.setVisible(true);
    }

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {

        if (bView.getTxtCampoPrincipal().getText().length() > 0) {

            try {

                int elemento = Integer.parseInt(bView.getTxtCampoPrincipal().getText());

                new Busca().selecionarAlgoritmo(bView.getCbSearchAlgorithms().getSelectedIndex(),
                        elemento);

                bView.getLblResult().setText(getResult());

            } catch (OutOfMemoryError | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Limite Excedido! Insira um valor menor.");
                bView.getTxtCampoPrincipal().setText(null);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Insira no campo o elemento a ser buscado!");
        }

        bView.getTxtCampoPrincipal().requestFocus();
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        bView.setVisible(false);
    }

    private void txtCampoPrincipalKeyTyped(java.awt.event.KeyEvent evt) {
        ValidaCampo.apenasNumeros(evt);
    }

    private String getResult() {
        if (dados.getPosicaoElemento() != -1) {
            return "O elemento '" + list.getPosOrdenacao().get(dados.getPosicaoElemento())
                    + "' Foi encontrado na posição '" + dados.getPosicaoElemento() + "' do vetor.";
        }
        return "Elemento não encontrado!";
    }

}
