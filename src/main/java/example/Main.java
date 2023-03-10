package example;

public class Main {
    public static void main(String[] args) {
        Funcionario e = new Estagiario();
        e.calcularSalario();

        Funcionario c = new Contratado();
        c.calcularSalario();
    }
}