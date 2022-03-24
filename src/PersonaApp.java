import java.util.Scanner;

public class PersonaApp {
	
	// Creando el Objeto 
	// Arreglo de Objeto
	int MAX_Personas = 5;
	int id = 1, contadorPersonas = 0;
	
	Persona persona[] = new Persona[MAX_Personas];
	Scanner entrada = new Scanner(System.in);
	
	public PersonaApp() {
		
		int operacion = 0;
		
		do {
			System.out.println("MENU");
			System.out.println("1.- Alta de Persona");
			System.out.println("2.- Mostrar Persona");
			System.out.println("3.- Salir");
			operacion = entrada.nextInt();
			
			switch(operacion) {
			case 1:
				altaPersona();
				break;
			case 2:
				mostrarPersonas();
				break;
			default:
				System.out.println("Operacion no Valida");
			}
			
			
			
		}while(operacion != 3);
		
	}
	
	public void altaPersona() {

	long telefono;
	String nombre, apellidos;
	Double salario;
	System.out.println("Ingrese el Nombre de la Persona");
	nombre = entrada.next();
	System.out.println("Ingrese el Apellido de la Persona");
	apellidos = entrada.next();
	System.out.println("Ingrese el Telefono de la Persona");
	telefono = entrada.nextLong();
	System.out.println("Ingrese el Salario de la Persona");
	salario = entrada.nextDouble();
	
	// Objeto para Poder utilizar los metodos Set Get
	Persona p1 = new Persona();
	p1.setId(id);
	p1.setNombre(nombre);
	p1.setApellidos(apellidos);
	p1.setTelefono(telefono);
	p1.setSalario(salario);
	
	// Se Agrega informacion al Arreglo
	persona[contadorPersonas] = p1;
	contadorPersonas++;
	id++;

	}
	
	public void mostrarPersonas() {
		String salida = "";
		for(int i = 0; i<contadorPersonas; i++) {
			salida += "id: " + persona[i].getId()+"\n"
					+ "Nombre: " + persona[i].getNombre()+"\n"
					+ "Apellido: " + persona[i].getApellidos()+"\n"
					+ "Telefono: " + persona[i].getTelefono()+"\n"
					+ "Salirio: " + persona[i].getSalario()+"\n";
		}
		
		System.out.println(salida);
	}
	
	
}
