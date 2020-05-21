package TareaJava_Semana3.Ejercicio1;

public class Cuadrilatero extends Figura implements iFigura{
	@Override
	public int calcularArea(int valor1, int valor2) {
		// TODO Auto-generated method stub
		//return super.calcularArea(valor1, valor2);
		int area=0;
		if(valor1 !=valor2) {
			area = valor1*valor2;
		}
		if (valor1 !=0 && valor2 == 0){
			
			area = valor1 * valor1;
		}
		
		return area;
	}
	
}
