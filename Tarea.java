public class Tarea {
    private String id;
    private String estado; //Pendiente, En Curso, Completado
    private String usuarioAsignado;
    private String descripcion;
    private String fechaEstimadaInicio;
    private String fechaInicioReal;
    private String fechaEstimadaFin;
    private String fechaFinReal;

    public Tarea(String id, String descripcion, String usuarioAsignado, String fechaEstimadaInicio, String fechaEstimadaFin) {
      this. id = id;
      this. descripcion = descripcion;
      this.usuarioAsignado = usuarioAsignado;
      this.estado = "Pendiente";
      this.fechaEstimadaInicio = fechaEstimadaInicio; 
      this.fechaEstimadaFin = fechaEstimadaFin;
      this.fechaInicioReal = ""; 
      this.fechaFinReal = "";
    }
    // Definición de métodos getter para acceder a los atributos de clase tarea
    public String getId() {return id; }
    public String getEstado() {return estado; }
    public String getUsuarioAsignado() {return usuarioAsignado; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEstimadaInicio() { return fechaEstimadaInicio; }
    public String getFechaInicioReal() { return fechaInicioReal; }
    public String getFechaEstimadaFin () { return fechaEstimadaFin; }
    public String getFechaFinReal() {return fechaFinReal; }

// Definición de métodos setter para actualizar los atributos de clase tarea

public void setEstado(String nuevoEstado) {
  this.estado = nuevoEstado;
}

public void setUsuarioAsignado(String usuarioAsignado) {
  this.usuarioAsignado = usuarioAsignado;
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
    " | Asignada a" +usuarioAsignado +
    " | Descripcion: " + descripcion;
}
}

