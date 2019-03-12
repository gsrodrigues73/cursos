package chain.of.responsability.exercicio;

public class TestaRequisicao {

	public static void main(String[] args) {
		Conta conta = new Conta("Gilberto", 1230);
		
		Requisicao req1 = new Requisicao(Formato.XML);
		Requisicao req2 = new Requisicao(Formato.CSV);
		Requisicao req3 = new Requisicao(Formato.PORCENTO);
		
		new SelecionaFormato().responde(req1, conta);
		new SelecionaFormato().responde(req2, conta);
		new SelecionaFormato().responde(req3, conta);
		
	}
}
