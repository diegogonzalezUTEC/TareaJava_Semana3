package TareaJava_Semana3.Ejercicio1;

public class Figura implements iFigura{
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	private String nombre;
	private int valor1;
	private int valor2;
	
	@Override
	public int calcularArea(int valor1, int valor2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
