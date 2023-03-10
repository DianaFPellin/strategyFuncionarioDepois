package example;

import example.estrategiaFuncionarios.Contratado;
import example.estrategiaFuncionarios.Estagiario;
import example.estrategiaFuncionarios.Freelancer;
import example.estrategiaFuncionarios.HomeOffice;
import example.estrategiaFuncionarios.Voluntario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estagiário: ");
        Funcionario e = new Estagiario();
        e.calcularSalario();
        e.calcularFerias();

        System.out.println("");
        System.out.println("Contratado CLT: ");
        Funcionario c = new Contratado();
        c.calcularSalario();
        c.calcularFerias();

        System.out.println("");
        System.out.println("Freelancer: ");
        Funcionario f = new Freelancer();
        f.calcularSalario();
        f.calcularFerias();

        System.out.println("");
        System.out.println("HomeOffice: ");
        Funcionario h = new HomeOffice();
        h.calcularSalario();
        h.calcularFerias();

        System.out.println("");
        System.out.println("Voluntário: ");
        Funcionario v = new Voluntario();
        v.calcularFerias();
        v.calcularSalario();
    }
}