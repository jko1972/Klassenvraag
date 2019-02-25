class Demo{
	public static void main(String[] args) {
		Winkel jumbo = new Winkel();
		jumbo.naamWinkel = "Albert Heijn";
		Artikel v = new Artikel();
		v.naam = "Cola";
		daargaanwe(jumbo);
		int AantalSchappen = 100;
		jumbo.tonen();
	}
	static void daargaanwe(Winkel q) {
		q.eenArtikel = new Artikel();
		
		
	}	
}
class Artikel{
	static String naam = "Fanta";
	
}
class Winkel{
	int AantalSchappen;
	String naamWinkel;
	Artikel eenArtikel;
	void tonen() {
		System.out.println("Dit is de " + naamWinkel + "\n met het aantal schappen: "+ AantalSchappen + " met een artikel: "+ eenArtikel.naam);
	}
}

