package chain.of.responsability.exercicio;

public class SelecionaFormato {

	public void responde(Requisicao req, Conta conta) {
		Resposta r1 = new RespondeCSV();
		Resposta r2 = new RespondeXML();
		Resposta r3 = new RespondePorCento();
		Resposta r4 = new RespostaVazia();
		
		r1.setProxima(r2);
		r2.setProxima(r3);
		r3.setProxima(r4);
		
		r1.responde(req, conta);
	}
}
