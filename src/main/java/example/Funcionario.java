package example;

public abstract class Funcionario {
    //Agregação com campo do tipo da estratégia criada pera gerenciar salários
    protected ISalario salario;
    //Atributos e métodos diversos relacionados ao funcionário
    public void calcularSalario() {
        salario.calcularSalario();
    }
}
