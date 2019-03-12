package chain.of.responsability.exercicio;

interface Resposta {
	
	void responde(Requisicao req, Conta conta);
	
	void setProxima(Resposta proxima);
	
 }