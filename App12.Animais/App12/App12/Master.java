package App12;

public class Master {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		m.emitirSom();
		
		Lobo l = new Lobo();
		l.emitirSom();
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		
		c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(19, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	}

}
