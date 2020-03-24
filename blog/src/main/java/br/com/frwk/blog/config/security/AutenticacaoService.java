package br.com.frwk.blog.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.frwk.blog.modelo.Usuario;
import br.com.frwk.blog.repository.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService {
	@Autowired
	private UsuarioRepository repository;

	public AutenticacaoService() {
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = this.repository.findByEmail(username);
		if (usuario.isPresent()) {
			return (UserDetails)usuario.get();
		} else {
			throw new UsernameNotFoundException("Dados de usuário e senha são inválidos!");
		}
	}
}
