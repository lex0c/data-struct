package br.com.leo.ed.controller;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;
import br.com.leo.ed.model.Lista;
import br.com.leo.ed.view.VisualizaUI;

public class VisualizaController {

    private VisualizaUI vView;
    private Lista list = Lista.getInstance();
    private DadosDeOrdenacao dados = DadosDeOrdenacao.getInstance();

    public VisualizaController(VisualizaUI vView) {
        this.vView = vView;
        initActions();
        configInit();
    }

    private void configInit() {

        vView.getLblTipo().setText(list.getTipoGerado());
        vView.getLblMetodo().setText(dados.getAlgoritmoSelecionado());
        vView.getTxtaInicial().setText(list.getPreOrdenacao().toString());
        vView.getTxtaOrdenado().setText(list.getPosOrdenacao().toString());
    }

    private void initActions() {

        vView.setLocationRelativeTo(null);

        vView.getBtnFechar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        vView.setVisible(true);
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        vView.setVisible(false);
    }

}
