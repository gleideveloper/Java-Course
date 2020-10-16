package exercicio_de_fixacao.model.entities;

import java.util.Date;

public class Parcela {
    private Double valor;
    private Date dataParcela;

    public Parcela() {
    }

    public Parcela(Double valor, Date dataParcela) {
        this.valor = valor;
        this.dataParcela = dataParcela;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(Date dataParcela) {
        this.dataParcela = dataParcela;
    }
}
