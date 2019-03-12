package chain.of.responsability.exercicio;

public class RespostaVazia implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {
		System.out.println("Não foi identificado o formato");
	}

	@Override
	public void setProxima(Resposta proxima) {

	}

}
