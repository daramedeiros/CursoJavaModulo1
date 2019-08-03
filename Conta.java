	class Conta {
	      String titular;
	      int numero;
	      String agencia;
	      double saldo;
	      String dataDeAbertura;
	
		void sacar(double valor) {
		    this.saldo = this.saldo-valor;
		}
		
		void deposita(double valor) {
		    this.saldo = this.saldo+valor;
		}

		double calculaRendimento() {
		    this.saldo = this.saldo*0.1;
			return this.saldo;
	
		}
		
	     String recuperaDadosParaImpressao() {
		   String dados = "Titular: " + this.titular;
		   dados += "\nNúmero: " + this.numero;
		   dados += "\nAgencia: " + this.agencia;
		   dados += "\nSaldo: " + this.saldo;
		   dados += "\nData de abertura: " + this.dataDeAbertura;
		   dados += "\nRendimento: " + this.calculaRendimento();
		   return dados;
	     }

	}
