public class Empleado implements UnidadOrg {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String obtenerInfo() {
        return "Empleado: " + nombre;
    }
}
