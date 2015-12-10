
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		return x+y;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		return x-y;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		return x*y;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		return x%y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x=2);
	{
		if( x%2 ==0 ){
			return true;
		}else{
		return false;
	}
	}

	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		if(x%3==0){
		return true;
	}{return false;
	}
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		if(x<y){
			return x;
		}else if(y<x)
		return x;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		if(edad > 18){
			return true && edad;
		}else{
			return false && System.out.println("es menor");
		}
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if(x%2==0 && y%2==0 && z%2==0){
			return true;
		}else{
			return false;
		}
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if(x > (y&&z)){
			return x;
		}else if(y>(x&&z)){
			return y;
		}else if(z>(y&&x)){
			return z;
		}
	}
	
	public static void main(String[] args)
	{
		
	}

}