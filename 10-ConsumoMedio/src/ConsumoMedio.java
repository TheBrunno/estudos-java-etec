import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {
		double distanciaKm, combustivelL, consumo;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a distância total do percurso: (KM)");
		distanciaKm = leitor.nextDouble();
		System.out.print("Digite a quantidade de combustivel gasto no percurso: (L)");
		combustivelL = leitor.nextDouble();
		consumo = distanciaKm/combustivelL;
		System.out.println("O consumo por Km é "+consumo+"L");
	}
}
