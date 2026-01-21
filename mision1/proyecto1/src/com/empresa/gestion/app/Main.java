package mision1.proyecto1.src.com.empresa.gestion.app;
import mision1.proyecto1.src.com.empresa.gestion.model.*;
import mision1.proyecto1.src.com.empresa.gestion.service.NominaService;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Ana", 28);
        persona.presentarse();

        Empleado empleado = new Empleado("Luis", 35, 3000);
        empleado.presentarse();

        Gerente gerente = new Gerente("Marta", 40, 5000, "Ventas");
        gerente.presentarse();

        NominaService nominaService = new NominaService();
        double salarioAnualEmpleado = nominaService.calcularSalarioAnual(empleado);
        double salarioAnualGerente = nominaService.calcularSalarioAnual(gerente);

        System.out.println("Salario anual de " + empleado.getNombre() + ": " + salarioAnualEmpleado + " dólares.");
        System.out.println("Salario anual de " + gerente.getNombre() + ": " + salarioAnualGerente + " dólares.");
    }
}
