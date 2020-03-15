package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date data;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comentarios = new ArrayList<>();

	public Post() {
	}

	public Post(Date data, String title, String content, Integer likes) {
		this.data = data;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(data) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comentarios) {
			sb.append(c.getComentario() + "\n");
		}
		return sb.toString();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComentarios() {
		return comentarios;
	}

	public void addComentarios(Comment comentarios) {
		this.comentarios.add(comentarios);
	}

	public void removeComentarios(Comment comentarios) {
		this.comentarios.remove(comentarios);
	}
}
