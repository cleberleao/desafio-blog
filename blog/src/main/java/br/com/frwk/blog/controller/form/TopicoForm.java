package br.com.frwk.blog.controller.form;

import br.com.frwk.blog.modelo.Post;
import br.com.frwk.blog.modelo.Topico;
import br.com.frwk.blog.repository.PostRepository;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class TopicoForm {
	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String titulo;
	@NotNull
	@NotEmpty
	@Length(min = 10)
	private String mensagem;
	@NotNull
	@NotEmpty
	private String nomePost;

	public TopicoForm() {
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setNomePost(String nomePost) {
		this.nomePost = nomePost;
	}

	public Topico converter(PostRepository cursoRepository) {
		Post post = cursoRepository.findByNome(this.nomePost);
		return new Topico(this.titulo, this.mensagem, post);
	}
}
