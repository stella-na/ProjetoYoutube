package projeto_youtube;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de Java");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		System.out.println(v[0].toString());
	}

}
