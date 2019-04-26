public class BalancoTrimestral{

	public static void main(String arg[]){
		int gastosJaneiro = Integer.parseInt( arg[0]);
		int gastosFevereiro = Integer.parseInt( arg[1]);
		int gastosMarco = Integer.parseInt( arg[2]);
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos:"+gastosTrimestre);
		
	}

}
