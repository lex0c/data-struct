package br.com.leo.ed.controller;

import javax.swing.JOptionPane;

import br.com.leo.ed.model.bo.Ordenacao;
import br.com.leo.ed.model.vo.DadosDeOrdenacao;
import br.com.leo.ed.model.Lista;
import br.com.leo.ed.util.ValidaCampo;
import br.com.leo.ed.view.DetalhesUI;
import br.com.leo.ed.view.EditaUI;

public class EditaController {

    private EditaUI eView;
    private Lista list = Lista.getInstance();

    public EditaController(EditaUI eView) {
        this.eView = eView;
        initActions();
        configInit();
    }

    private void configInit() {
        leiame();
        eView.getTxtPosicao().setEnabled(false);
        eView.getTxtElemento().setEnabled(false);
        eView.getBtnAlterar().setEnabled(false);
        eView.getBtnDetalhes().setEnabled(false);
        eView.getBtnHelp().setEnabled(false);
    }

    private void initActions() {

        eView.setLocationRelativeTo(null);

        eView.getTxtPosicao().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPosicaoKeyTyped(evt);
            }
        });

        eView.getTxtElemento().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtElementoKeyTyped(evt);
            }
        });

        eView.getBtnAlterar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        eView.getBtnDetalhes().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        eView.getBtnFechar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        eView.getBtnEntendi().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntendiActionPerformed(evt);
            }
        });

        eView.getBtnHelp().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        eView.setVisible(true);
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {

        if ((eView.getTxtPosicao().getText().length() > 0)
                || (eView.getTxtElemento().getText().length() > 0)) {

            try {
                // Remove
                if ((eView.getTxtPosicao().getText().length() > 0)
                        && (eView.getTxtElemento().getText().length() == 0)) {

                    list.remover(Integer.parseInt(eView.getTxtPosicao().getText()));
                }

                //Adiciona no fim
                if ((eView.getTxtElemento().getText().length() > 0)
                        && (eView.getTxtPosicao().getText().length() == 0)) {

                    list.adicionar(Integer.parseInt(eView.getTxtElemento().getText()));
                }

                // Adiciona por posição
                if ((eView.getTxtPosicao().getText().length() > 0)
                        && (eView.getTxtElemento().getText().length() > 0)) {

                    list.adicionar(
                            Integer.parseInt(eView.getTxtPosicao().getText()),
                            Integer.parseInt(eView.getTxtElemento().getText())
                    );
                }

                eView.getTxtaSaida().setText(list.getPreOrdenacao().toString());
                eView.getBtnDetalhes().setEnabled(true);

            } catch (OutOfMemoryError | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Limite Excedido! Insira um valor menor.");
                eView.getTxtElemento().setText(null);

            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Essa posição não existe!");
                eView.getTxtPosicao().setText(null);
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Leia novamente. Click no botão '?' (Ponto de interroção)."
            );
        }

        eView.getTxtPosicao().setText(null);
        eView.getTxtElemento().setText(null);
    }

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {
        reordena();
        DetalhesUI dView = new DetalhesUI();
        new DetalhesController(dView);
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        reordena();
        eView.setVisible(false);
    }

    private void btnEntendiActionPerformed(java.awt.event.ActionEvent evt) {

        eView.getTxtaSaida().setText(list.getPreOrdenacao().toString());

        eView.getBtnHelp().setEnabled(true);
        eView.getBtnEntendi().setEnabled(false);
        eView.getTxtPosicao().setEnabled(true);
        eView.getTxtElemento().setEnabled(true);
        eView.getBtnAlterar().setEnabled(true);
    }

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {
        configInit();
        eView.getTxtPosicao().setText("");
        eView.getTxtElemento().setText("");
        eView.getBtnEntendi().setEnabled(true);
    }

    private void txtPosicaoKeyTyped(java.awt.event.KeyEvent evt) {
        ValidaCampo.apenasNumeros(evt);
    }

    private void txtElementoKeyTyped(java.awt.event.KeyEvent evt) {
        ValidaCampo.apenasNumeros(evt);
    }

    private void reordena() {
        DadosDeOrdenacao dados = DadosDeOrdenacao.getInstance();
        new Ordenacao().selecionarAlgoritmo(dados.getAlgoritmoIndexSelecionado());
    }

    private void leiame() {
        eView.getTxtaSaida().setText(
                "- Para adicionar no final do vetor preencha apenas o elemento\n a ser adicionado.\n"
                + "- Para adicionar por posição preencha a posição que deseja\n inserir o elemento e o mesmo.\n"
                + "- Para remover insira somente a posição do elemento\n a ser removido.\n"
        );
    }

}
