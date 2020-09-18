package abstraction.exercise.entities;

public class Juridica extends Pessoa{
    private Double numFuncionario;

    public Juridica() {
        super();
    }

    public Juridica(String nome, Double rendaAnual, Double numFuncionario) {
        super(nome, rendaAnual);
        this.numFuncionario = numFuncionario;
    }

    public Double getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(Double numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public double imposto() {
        double impostoPago = 0;
        if (numFuncionario > 10){
            impostoPago = getRendaAnual() * 0.14;
        } else {
            impostoPago = getRendaAnual() * 0.16;
        }
        return impostoPago;
    }
}
