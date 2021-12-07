package com.lib.dto;


public class ErelDTO {

    private String nomeEmpresa, tipoServico, dataSolicitacao;
    private Double notasPagas, notasPendentes;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Double getNotasPagas() {
        return notasPagas;
    }

    public void setNotasPagas(Double notasPagas) {
        this.notasPagas = notasPagas;
    }

    public Double getNotasPendentes() {
        return notasPendentes;
    }

    public void setNotasPendentes(Double notasPendentes) {
        this.notasPendentes = notasPendentes;
    }

    @Override
    public String toString() {
        return "\nnomeEmpresa = '" + nomeEmpresa + '\'' +
                "\ntipoServico = '" + tipoServico + '\'' +
                "\ndataSolicitacao = '" + dataSolicitacao + '\'' +
                "\nnotasPagas = " + notasPagas +
                "\nnotasPendentes = " + notasPendentes;
    }
}
