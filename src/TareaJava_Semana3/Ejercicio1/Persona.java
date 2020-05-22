package TareaJava_Semana3.Ejercicio1;

public class Persona {
	private String nombre;
	private String apellido;
	private String sexo;
	private String desc;
	
	public Persona(String nombre, String apellido, String sexo, String desc) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.desc = desc;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return nombre + " - " + apellido + " - " + sexo + " - " + desc; 
	}

}
