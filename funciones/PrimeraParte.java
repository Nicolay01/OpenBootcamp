package funciones;

public class PrimeraParte {

	public static int sumThree(int one, int two, int three) {
		return one + two + three;
	}

	public static void main(String[] args) {
		int sumVar = PrimeraParte.sumThree(5, 5, 10); // 20
		System.out.println(sumVar);
	}
}