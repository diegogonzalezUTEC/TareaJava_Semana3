package TareaJava_Semana3.Ejercicio1;

public class Triangulo extends Figura implements iFigura{
	
	
	@Override
	public int calcularArea(int valor1, int valor2) {
		// TODO Auto-generated method stub
		return (valor1 * valor2)/2;
	}

}
