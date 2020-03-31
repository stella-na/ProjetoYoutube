package projeto_youtube;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de Java");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Inscrito i[] = new Inscrito[2];
		i[0] = new Inscrito("José", 22, "M", "Zé");
		i[1] = new Inscrito("Maria", 19, "F", "Mara");		
		
		System.out.println(i[0].toString());
	}

}
