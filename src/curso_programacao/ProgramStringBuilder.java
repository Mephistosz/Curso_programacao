package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramStringBuilder {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice Trip!");
		Comment c2 = new Comment("Wow tha's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 15);
		p1.addComentarios(c1);
		p1.addComentarios(c2);
		System.out.println(p1);
	}
}
