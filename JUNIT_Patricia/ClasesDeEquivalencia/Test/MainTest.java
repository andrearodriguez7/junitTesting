import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    public void testMostrarMenuCliente() {
        BBDDLite bbdd = new BBDDLite();
        Scanner leer = new Scanner(System.in);
        String dni = "12345678Z";
        bbdd.agregarUsuario(dni);
        Cliente cliente = bbdd.obtenerCliente(dni);
        Main.mostrarMenuCliente(leer, cliente, 100.0);

        assertEquals(100.0, bbdd.obtenerCliente(cliente.getDni()).getSaldo(), 0.01);
    }


    @Test
    void ingresarDNIValido() {
        Scanner leer = new Scanner(System.in);
        String dniEsperado = "12345678T";

        String dni = Main.ingresarDNI(leer);

        assertEquals(dniEsperado, dni);
    }

    @Test
    void ingresarDNINoValidoFormato() {
        // Arrange
        Scanner leer = new Scanner(System.in);
        leer.nextLine();
        String dniEsperado = "12345678T";

        String dni = Main.ingresarDNI(leer);

        assertEquals(dniEsperado, dni);
    }

    @Test
    void ingresarDNINoValidoLetra() {

        Scanner leer = new Scanner(System.in);
        leer.nextLine();
        String dniEsperado = "12345678T";

        String dni = Main.ingresarDNI(leer);

        assertEquals(dniEsperado, dni);
    }

    @Test
    void ingresarDNINoValidoLetraYNumeros() {
        Scanner leer = new Scanner(System.in);
        leer.nextLine();
        String dniEsperado = "12345678T";

        String dni = Main.ingresarDNI(leer);

        assertEquals(dniEsperado, dni);
    }
}