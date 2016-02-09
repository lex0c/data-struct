package br.com.leo.ed.controller;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;
import br.com.leo.ed.model.Lista;
import br.com.leo.ed.view.DetalhesUI;
import br.com.leo.ed.view.EditaUI;
import br.com.leo.ed.view.VisualizaUI;

public class DetalhesController {

    private DetalhesUI dView;
    private Lista list = Lista.getInstance();
    private DadosDeOrdenacao dados = DadosDeOrdenacao.getInstance();

    public DetalhesController(DetalhesUI dView) {
        this.dView = dView;
        initActions();
        configInit();
    }

    private void configInit() {

        dView.getLblMetodo().setText(dados.getAlgoritmoSelecionado());
        dView.getLblPrimeiro().setText(list.getPosOrdenacao().get(0).toString());
        dView.getLblUltimo().setText(list.getPosOrdenacao()
                .get(list.getPosOrdenacao().size() - 1).toString());

        dView.getLblTempo().setText(dados.getTempoOrdencao());
    }

    private void initActions() {

        dView.setLocationRelativeTo(null);

        dView.getBtnFechar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        dView.getBtnEditar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        dView.getBtnVisualizar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        dView.setVisible(true);
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        dView.setVisible(false);
    }

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {
        VisualizaUI vView = new VisualizaUI();
        new VisualizaController(vView);
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        EditaUI eView = new EditaUI();
        new EditaController(eView);

        dView.setVisible(false);
    }

}
