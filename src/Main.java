public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.credito = 5000;
        cliente.edad = 48;
        cliente.nombre = "Federico";
        cliente.telefono = 75757575;
        System.out.println("Nombre : " + cliente.nombre);
        System.out.println("Edad : " + cliente.edad);
        System.out.println("Crédito : " + cliente.credito);
        System.out.println("Teléfono : " + cliente.telefono);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Joel";
        trabajador.edad = 23;
        trabajador.salario = 2000;
        trabajador.telefono = 73737373;
        System.out.println("Nombre : " + trabajador.nombre);
        System.out.println("Edad : " + trabajador.edad);
        System.out.println("Salario : " + trabajador.salario);
        System.out.println("Teléfono : " + trabajador.telefono);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}

/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
*/