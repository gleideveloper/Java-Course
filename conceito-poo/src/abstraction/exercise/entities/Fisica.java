package abstraction.exercise.entities;

public class Fisica extends Pessoa {
    private Double despesasSaude;

    public Fisica() {
        super();
    }

    public Fisica(String nome, Double rendaAnual, Double despesasSaude) {
        super(nome, rendaAnual);
        this.despesasSaude = despesasSaude;
    }

    public Double getDespesasSaude() {
        return despesasSaude;
    }

    public void setDespesasSaude(Double despesasSaude) {
        this.despesasSaude = despesasSaude;
    }

    @Override
    public double imposto() {
        double impostoPago = 0;
        double imposto = 0;
        double descontoSaude = (despesasSaude * 0.5);
        if (getRendaAnual() < 20000){
            imposto = getRendaAnual() * 0.15;
            impostoPago = (despesasSaude > 0) ? imposto-descontoSaude:imposto;
        } else if (getRendaAnual() >= 20000){
            imposto = getRendaAnual() * 0.25;
            impostoPago = (despesasSaude > 0) ? imposto-descontoSaude:imposto;
        }
        return impostoPago;
    }
}
