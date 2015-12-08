
public class InfoApp {

	public static void main(String[] args) {
		InfoPrintAlmari m = new InfoPrintAlmari();
		InfoPrintPublicover p = new InfoPrintPublicover();
		System.out.print(m.getName("Mohammed Almari"));
		
		System.out.println("");
		p.printPublicover();
	}

}
