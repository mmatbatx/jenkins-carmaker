package carmaker;
import java.lang.System.*;
import java.util.Random;

public class CarMaker{
	public static void main (String[] args) {
		Random r= new Random(System.currentTimeMillis());
	for (int i=0;i<10;i++){
		Car aux= new Car (r.nextInt(3)+1, r.nextInt(5)+1, r.nextInt(500000));
		System.out.println(aux.toString());
		}
	}
}
