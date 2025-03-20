class Empleado implements ComponenteOrganizacional {
    private String id;
    private String nombre;
    private double salario;

    public Empleado(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " (ID: " + id + ") - Salario: $" + salario);
    }

    @Override
    public double calcularSalarioTotal() {
        return salario; // Los empleados individuales solo devuelven su propio salario
    }
}
