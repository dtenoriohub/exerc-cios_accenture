package dia_01.dia_01_atividade01_formaMaisCompleta;

public enum AssentoEnum {
	
	ClasseA(50, "ClasseA"),
	ClasseB(30, "ClasseB"),
	ClasseC(20, "ClasseC");
	
	private int valorAssento;
	private String tipoAssento;
	
	AssentoEnum(int valor, String assento) {
		this.valorAssento = valor;
		this.tipoAssento = assento;
	}
	public int getValorAssento() {
		return valorAssento;
	}
	public String getTipoAssento() {
		return tipoAssento;
	}
	@Override
	public String toString() {
		return tipoAssento;
	}
}











