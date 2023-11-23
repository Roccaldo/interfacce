public class Main {
	public static void main(String[] args) {

		Rettangolo rettangolo = new Rettangolo("rettangolo", 5, 6);
		Triangolo triangolo = new Triangolo("triangolo", 4, 8);

		rettangolo.calcolaArea();
		triangolo.calcolaArea();
	}
}