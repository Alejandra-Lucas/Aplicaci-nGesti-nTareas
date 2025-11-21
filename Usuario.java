public abstract class Usuario {
  protected String id;
  protected String nombre; 
  protected String nickname;
  protected String correo;
  protected String password; 

public Usuario(String id, String nombre, String nickname, String correo, String password) {
  this.id = id;
  this.nombre = nombre;
  this.nickname = nickname;
  this.correo = correo; 
  this.password = password; 
}

public String getId() { return id; }
public String getNombre() { return nombre; }
public String getNickname() { return nickname; }
public String getCorreo() { return correo; }
public String getPassword() { return password; }

public abstract void mostrarMenu();
}
