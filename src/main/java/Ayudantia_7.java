import java.util.ArrayList;
import java.util.List;

class AgenciaDeViajes {
    private List<Cliente> clientes;
    private List<AgenteDeViajes> agentes;

    public AgenciaDeViajes() {
        this.clientes = new ArrayList<>();
        this.agentes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void agregarAgente(AgenteDeViajes agente) {
        this.agentes.add(agente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<AgenteDeViajes> getAgentes() {
        return agentes;
    }
}

class Cliente {
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

class AgenteDeViajes {
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

