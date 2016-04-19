package caelum.abstratas;

public class Main {
	
	public static void main(String[] args) {
		Funcionario f = new Gerente();
		f.nome = "Julio"; f.cpf = "879"; f.salario = 5000;
		
		Funcionario f2 = new Gerente();
		f2.nome = "Maria"; f2.cpf = "186"; f2.salario = 4000;
		
		Funcionario f3 = new Supervisor();
		f3.nome = "Joao"; f3.cpf = "929"; f3.salario = 1000;
		
		ControleBonificacoes c = new ControleBonificacoes();
		c.registraFunc(f);
//		c.registraFunc(f2);
//		c.registraFunc(f3);
		System.out.println(c.getTotalBonificacoes());
	}

}
