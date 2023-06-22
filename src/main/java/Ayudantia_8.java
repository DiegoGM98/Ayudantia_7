import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {
    private List<Cliente> clientes;
    private List<AgenteDeViajes> agentes;

    public AgenciaDeViajes() {
        this.clientes = new ArrayList<>();
        this.agentes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

    public void agregarAgente(AgenteDeViajes agente) {
        if (!agentes.contains(agente)) {
            this.agentes.add(agente);
        }
    }

    public Cliente buscarCliente(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null;
    }

    public AgenteDeViajes buscarAgente(String identificacion) {
        for (AgenteDeViajes agente : agentes) {
            if (agente.getIdentificacion().equals(identificacion)) {
                return agente;
            }
        }
        return null;
    }

    public void eliminarAgente(String identificacion) {
        AgenteDeViajes agente = buscarAgente(identificacion);
        if (agente != null) {
            agentes.remove(agente);
        }
    }

    public void generarVenta(Cliente cliente, AgenteDeViajes agente, String destino, double precio) {
        // Implementar lógica de venta aquí
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<AgenteDeViajes> getAgentes() {
        return agentes;
    }
}

public class Cliente {
    private String nombre;
    private String identificacion;
    private String preferenciasDeViaje;
    private double presupuesto;

    public Cliente(String nombre, String identificacion, String preferenciasDeViaje, double presupuesto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.preferenciasDeViaje = preferenciasDeViaje;
        this.presupuesto = presupuesto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return identificacion != null ? identificacion.equals(cliente.identificacion) : cliente.identificacion == null;
    }

    @Override
    public int hashCode() {
        return identificacion != null ? identificacion.hashCode() : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPreferenciasDeViaje() {
        return preferenciasDeViaje;
    }

    public void setPreferenciasDeViaje(String preferenciasDeViaje) {
        this.preferenciasDeViaje = preferenciasDeViaje;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}

public class AgenteDeViajes {
    private String nombre;
    private String identificacion;
    private int aniosExperiencia;
    private String especializacion;

    public AgenteDeViajes(String nombre, String identificacion, int aniosExperiencia, String especializacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.aniosExperiencia = aniosExperiencia;
        this.especializacion = especializacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgenteDeViajes that = (AgenteDeViajes) o;

        return identificacion != null ? identificacion.equals(that.identificacion) : that.identificacion == null;
    }

    @Override
    public int hashCode() {
        return identificacion != null ? identificacion.hashCode() : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}

