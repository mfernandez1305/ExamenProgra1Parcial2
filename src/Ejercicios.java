
public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	{
		if (num%3==0){//evalua si el numero es divisible entre 3
		return true;//si el numero es divisible devolvera true
	}
	return false;//si el numero no es divisible devolvera false
}
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
		if (a<b && a<c){//evalua si a es menor que b y menor que c
		return a;//si la condicion se cumple devuelve a sino pasa a las siguiente condicion 
		}
		if (b<a && b<c){//evalua si b es menor que a y menor que c
			return b; //si la condicion se cumple devuelve b sino pasa a las siguiente condicion
		}
		if (c<a && c<b){//evalua si c es menor que a y menor que b
			return c; //si la condicion se cumple devuelve c 
		}
		return a; // si a, b y c son iguales retorna cualquiera de los valores en este caso devuelve a 
	}
	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	static int getPromedio(int arreglo[])
	{
		int promedio=0;//declara la variable promedio
		
		for (int  i=0;  i<arreglo.length; i++){//declara la variable i la cual utilizaremos como contador 
		promedio=promedio+arreglo[i];// acumula los valores que se calcularan en el promedio 	
		}
		return promedio/arreglo.length;// devuelve el resultado de los valores calculados entre el tamaño del arreglo
	}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		if (pais.equals("Honduras")){//evalua la condicion 
		return "Tegucigalpa";// si la condicion es verdadera retorna tegucigalpa
		}
		if (pais.equals("Francia")){//evalua la condicion
			return "Paris";// si la condicion es verdadera retorna paris
		}
		if (pais.equals("Inglaterra")){//evalua la condicion
			return "Londres";//si la condicion es verdadera retorna londres 
		}
		return "ingrese pais valido(honduras, francia, inglaterra";//si ninguna de las condiciones se cumplen retorna que ingrese un pais el cual se pueda evaluar 
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		if (num==0){//evalua la condicion
		return 0;// si la condicion se cumple retorna 0
		}
		return num+funcionRecursiva(num-1);//retorna el calculo 
		 
		
	}
	
	public static void main(String args[])
	{
	}
}
