/**
 * 
 */
package potencias;
import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Poten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Num=0;
		int res;
		Scanner Scan=new Scanner (System.in);
		System.out.println("Ingrese un numero entero para saber su potencia");
		System.out.println("Para cancelar digite un numero negativo");
		Num=Scan.nextInt();
		for (int i=0;i<Num;i++){
			if(Num<0){
				break;
			}else{
				res=(int) Math.pow(Num, 2);
				System.out.println(Num+" al cuadrado es: "+res);
				Num=Scan.nextInt();
			}
			
		}System.out.println("Operacion cancelada");
		
		

	}

}
