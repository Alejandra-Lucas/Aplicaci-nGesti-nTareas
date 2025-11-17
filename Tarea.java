public class Tarea {
    private String id;
    private String estado; //Pendiente, En Curso, Completado
    private String usuarioAsignado;
    private String descripcion;
    private String fechaEstimadaInicio;
    private String fechaInicioReal;
    private String fechaEstimadaFin;
    private String fechaFinReal;

    public Tarea(String id, String descripcion, Usuario usuario, String fechaEstimadaInicio, String fechaEstimadaFin) {
      this. id = id;
      this. descripcion = descripcion
      this.usuarioAsignado = usuario;
      this.estado = "Pendiente";
      this.fechaEstimadaInicio = fechaEstimadaInicio; 
      this.fechaEstimadaFin = fechaEstimadFin
      this.fechaInicioReal = ""; 
      this.fechafinReal = "";
    }

    public String getId() [return id; }
    public String getEstado() [return estado; }
    public Usuario getUsuarioAsignado() {return usuarioAsignado; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEstimadaInicio() { return FechaEstimadaInicio; }
    public String getFechaInicioReal() { return FechaInicioReal; }
    public String getFechaEstimadaFin () { return FechaEstimadaFin; }
    public String getFechaFinReal() {return FechaFinReal; }

public void setEstado(String nuevoEstado) {
  this estado = nuevoEstado;
}

public void setUsuarioAsignado(Usuario usuario) {
  this.usuarioAsignado = usuario;
}

public void setDescripcion(String descripcion) {
  this.descripcion = descripcion;
}

public void setFechaEstimadaInicio(String fecha) {
  this.fechaEstimadaInicio = fecha;
}

public void setFechaEstimadaFin(String fecha) {
  this.fechaEstimadaFin = fecha;
}

public void iniciarTarea(String fechaInicioReal) {
  this.estado = "En Curso";
  this.fechaInicioReal = fechaInicioReal;
}

@Override
  public String toString() {
  return "Tarea ID: " + id +
    " | Estado: " + estado +
    " | "Asignada a" +usuarioAsignado.getNombre() +
    " | Descripcion: " + descripcion;
}
}

