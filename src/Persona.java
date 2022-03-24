
public class Persona {
	
	// Siempre de Privado
	// Evitar modificaciones de los valores
	private int id;
	private long telefono;
	private String nombre, apellidos;
	private Double Salario;
	
	public Persona() {
		
	}
	
	// El que se manda a llamar cuando se ejecuta la clase
	public Persona(int id, long telefono, String nombre, String apellidos, Double salario) {
		this.id = id;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellidos = apellidos;
		Salario = salario;
	}

	// Regresar informacion almacena
	public int getId() {
		return id;
	}

	// Cambiar el valor en el atributo o agrega un nuevo
	public void setId(int id) {
		this.id = id;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}
	

}
