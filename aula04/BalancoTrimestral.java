class BalancoTrimestral {
	public static void main (String[] args) {
	//declarando as variáveis
	double gastosJaneiro, gastosFevereiro, gastosMarco, gastosTrimestre; 
	//inicialização das variáveis
	gastosJaneiro = 1500;
	gastosFevereiro = 2300;
	gastosMarco = 1700;
	//soma do trimestre
	gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal " + gastosTrimestre/3);	
	
	}
}
