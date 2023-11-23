public class Triangolo implements Forma {

	private String nomeForma;
	private int base;
	private int altezza;

	public Triangolo(String nomeForma, int base, int altezza) {
		this.nomeForma = nomeForma;
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public void calcolaArea() {
		int result = base * altezza / 2;
		System.out.println(result);
	}

	public String getNomeForma(){
		return nomeForma;
	}
	public int getBase(){
		return base;
	}
	public int getAltezza(){
		return altezza;
	}

	public void setNomeForma(String nomeForma){
		this.nomeForma = nomeForma;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
}
