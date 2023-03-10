package example;

public class SalarioFixo implements ISalario{
    @Override
    public void calcularSalario() {
        System.out.println("Salário Fixo");
    }
}
