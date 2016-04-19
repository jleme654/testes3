package caelum.abstratas;

public class ControleBonificacoes {
	
	private double totalBonificacoes = 0;
	
	public  void registraFunc(Funcionario f){
		System.out.println("registrando: " + f);
		this.totalBonificacoes += f.getBonificacao();
	}
	
	public double getTotalBonificacoes(){
		return this.totalBonificacoes;
	}

}
