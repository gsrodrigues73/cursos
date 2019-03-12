package chain.of.responsability.exercicio;

public class RespondeXML implements Resposta {

	private Resposta proxima;
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML)
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		else
			proxima.responde(req, conta);

	}

	@Override
	public void setProxima(Resposta proxima) {
		this.proxima = proxima;

	}

}
