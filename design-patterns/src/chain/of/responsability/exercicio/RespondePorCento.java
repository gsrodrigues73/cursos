package chain.of.responsability.exercicio;

public class RespondePorCento implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO)
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		else
			proxima.responde(req, conta);

	}

	@Override
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;

	}

}
