package exercicio_de_fixacao.model.entities;

import java.util.Date;
import java.util.List;

public class Contrato {
    private Integer number;
    private Date dataContrato;
    private Double valorTotal;
    private List<Parcela> parcelas;

    public Contrato() {
    }

    public Contrato(Integer number, Date dataContrato, Double valorTotal, List<Parcela> parcelas) {
        this.number = number;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
        this.parcelas = parcelas;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }
}
