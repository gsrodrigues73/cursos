package interpreter;

import visitor.Visitor;

public interface Expressao {

	int avalia();
	
	// criado para atender a aula Visitor
//	void visita(ImpressoraVisitor impressora);
	void aceita(Visitor impressora);
}
