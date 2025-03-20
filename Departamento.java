// Clase Departamento que puede contener empleados o subdepartamentos
class Departamento implements ComponenteOrganizacional {
    private String nombre;
    private List<ComponenteOrganizacional> componentes = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteOrganizacional componente) {
        componentes.add(componente);
    }

    public void eliminar(ComponenteOrganizacional componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Departamento: " + nombre);
        for (ComponenteOrganizacional componente : componentes) {
            componente.mostrarInformacion();
        }
    }

    @Override
    public double calcularSalarioTotal() {
        double total = 0;
        for (ComponenteOrganizacional componente : componentes) {
            total += componente.calcularSalarioTotal();
        }
        return total;
    }
}