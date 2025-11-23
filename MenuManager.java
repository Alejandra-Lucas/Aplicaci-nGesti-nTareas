import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MenuManager {
    private Scanner scanner;
    private SistemaLogin sistemaLogin;
    private GestorUsuarios gestorUsuarios;
    private GestorTareas gestorTareas;
    private Usuario usuarioActual;
    public MenuManager() {
        this.scanner = new Scanner(System.in);
        this.sistemaLogin = new SistemaLogin();
        this.gestorUsuarios = new GestorUsuarios(); 
        this.gestorTareas = new GestorTareas();
    }

    public void inicio(){
        boolean salir = false;
        while (!salir) {
            try{
                System.out.println("=== Menú Principal ===");
                System.out.println("1. Iniciar Sesión");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = leerEntero();

                switch (opcion) {
                    case 1:
                        procesarLogin();
                        break;
                    case 2:
                        salir = true;
                        System.out.println("Saliendo del sistema. ¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número.");
            } catch (Exception e) {
                System.out.println("Error del sistema: " + e.getMessage());
                }
        } // Fin while
    } // Fin método inicio

    private void procesarLogin() {
        System.out.print("Ingrese su correo o nickname: ");
        String credencial = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();
        try {
            this.usuarioActual = sistemaLogin.iniciarSesion(credencial, password, gestorUsuarios);
            System.out.println("Bienvenidx, " + usuarioActual.getNombre());
        } catch (Exception e) {
            System.out.println("Error de inicio de sesión: " + e.getMessage());
        }
    }

    private void mostrarMenuCorrespondiente() {
        if (usuarioActual instanceof Administrador) {
            menuAdmin();
        } else if (usuarioActual instanceof Desarrollador) {
            menuDesarrollador();
        } else if (usuarioActual instanceof Invitado) {
            menuInvitado();
        } else {
            System.out.println("Tipo de usuario no reconocido.");
        }
    }

    // ------ Menú Administrador ------
    private void menuAdmin(){
        boolean salir = false;
        while (!salir) {
            System.out.println("--- Menú Administrador ---");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Crear tarea nueva");
            System.out.println("3. Ver todas las tareas");
            System.out.println("4. Actualizar tarea");
            System.out.println("5. Eliminar tarea");
            System.out.println("6. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            int opcion = leerEntero();
        }
    }

    // ------ Menú Desarrollador ------
    private void menuDesarrollador(){}

    // ------ Menú Invitado ------
    private void menuInvitado(){}

    // Método para leer números enteros
    private int leerEntero() {
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Valor inválido
        }
    }


} // Fin de la clase MenuManager