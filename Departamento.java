import java.util.ArrayList;
import java.util.List;

public class Departamento implements UnidadOrg {
    private String nombre;
    private List<UnidadOrg> unidades = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void agregarUnidad(UnidadOrg unidad) {
        unidades.add(unidad);
    }

    @Override
    public String obtenerInfo() {
        StringBuilder info = new StringBuilder("Departamento: " + nombre + "\n");
        for (UnidadOrg unidad : unidades) {
            info.append("  - ").append(unidad.obtenerInfo()).append("\n");
        }
        return info.toString();
    }
}
