public abstract class Usuario {
  protected int id;
  protected String nombre; 
  protected String nickname;
  protected String correo;
  protected String password; 

public Usuario(int id, String nombre, String nickname, String correo, String password) {
  this.id = id;
  this.nombre = nombre;
  this.nickname = nickname;
  this.correo = correo; 
  this.password = password; 
}

public int getId() { return id; }
public String getNombre() { return nombre; }
public String getNickname() { return nickname; }
public String getCorreo() { return correo; }
public String getPassword() { return password; }

public abstract void mostrarMenu();
}
