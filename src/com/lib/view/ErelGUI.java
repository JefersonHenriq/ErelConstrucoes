package com.lib.view;

import com.lib.dao.ErelDAO;
import com.lib.dto.ErelDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ErelGUI extends JFrame{
    private JTabbedPane tabbedPane1;
    private JTextField txtEmpresaNome;
    private JTextField txtServicoTipo;
    private JTextField txtSolicitacaoData;
    private JButton cadastrarButton;
    private JTextField txtPagasNotas;
    private JTextField txtPendentesNotas;
    private JTextField informeOCódDeTextField;
    private JButton btnPesquisar;
    private JList lstObjects;
    private JRadioButton ordemNumericaRadioButton;
    private JRadioButton ordemAlfabeticaRadioButton;
    private JTextField txtGetEmpresa;
    private JTextField txtGetServico;
    private JTextField txtGetData;
    private JTextField txtGetPendente;
    private JTextField txtGetPagas;
    private JTextField txtStrEmpresa;
    private JTextField txtStrServico;
    private JTextField txtStrData;
    private JTextField txtStrPaga;
    private JTextField txtStrPendente;
    private JButton btnExcluir;
    private JButton btnSalvar;
    private JButton btnPesquisarAlterar;
    private JButton btnPesquisarExcluir;
    private JPanel mainPanel;

    public ErelGUI(String title) {

        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nomeEmpresa, tipoServico, dataSolicitacao;
                Double notasPagas, notasPendentes;

                nomeEmpresa = txtEmpresaNome.getText();
                tipoServico = txtServicoTipo.getText();
                dataSolicitacao = txtSolicitacaoData.getText();
                notasPagas = Double.parseDouble(txtPagasNotas.getText());
                notasPendentes = Double.parseDouble(txtPendentesNotas.getText());

                ErelDTO objErelDTO = new ErelDTO();

                objErelDTO.setNomeEmpresa(nomeEmpresa);
                objErelDTO.setTipoServico(tipoServico);
                objErelDTO.setDataSolicitacao(dataSolicitacao);
                objErelDTO.setNotasPagas(notasPagas);
                objErelDTO.setNotasPendentes(notasPendentes);

                ErelDAO objErelDAO = new ErelDAO();
                objErelDAO.cadastraErel(objErelDTO);

                JOptionPane.showMessageDialog(null, objErelDTO.toString());

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

            }
        });

        btnExcluir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);



            }
        });

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnPesquisarAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnPesquisarExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new ErelGUI("Erel Contruções e Empreendimentos");
        frame.setVisible(true);
    }
}
