	class InicarConta {
	     public static void main(String[] args) {
	     Conta c1 = new Conta();
	     
             c1.titular= "Dara";
             c1.numero = 5566;
 	     c1.agencia = "45678-9";
	     c1.saldo = 50.0;
	     c1.dataDeAbertura = "07/07/2019";
   	     c1.deposita (100.0);

	     //Conta c2 = new Conta();
	     Conta c2;
	     c2 = c1;
	     
             c2.titular= "Dara";
             c2.numero = 5566;
 	     c2.agencia = "45678-9";
	     c2.saldo = 50.0;
	     c2.dataDeAbertura = "07/07/2019";
   	     c2.deposita (100.0);

		if (c1 == c2){
		   System.out.println("As contas são iguas.");
		} else {
		  System.out.println("As contas são diferentes");
		}


	     //System.out.println("Saldo atual :" + c1.saldo);
 	     //System.out.println("Rendimento mensal :" + c1.calculaRendimento());
	     System.out.println("Dados :" + c1.recuperaDadosParaImpressao());
		
	     }	
	}
