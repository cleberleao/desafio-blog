package br.com.frwk.blog.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.frwk.blog.repository.UsuarioRepository;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	@Autowired
	private AutenticacaoService autenticacaoService;
	@Autowired
	private TokenService tokenService;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public SecurityConfigurations() {
	}

	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}

	protected void configure(HttpSecurity http) throws Exception {
		((HttpSecurity)((HttpSecurity)((HttpSecurity)((AuthorizedUrl)((AuthorizedUrl)((AuthorizedUrl)((AuthorizedUrl)((AuthorizedUrl)((AuthorizedUrl)http.authorizeRequests().antMatchers(HttpMethod.GET, new String[]{"/topicos"})).permitAll().antMatchers(HttpMethod.GET, new String[]{"/topicos/*"})).permitAll().antMatchers(HttpMethod.POST, new String[]{"/autentica", "/usuarios"})).permitAll().antMatchers(HttpMethod.GET, new String[]{"/actuator/**"})).permitAll().antMatchers(HttpMethod.GET, new String[]{"/"})).permitAll().anyRequest()).authenticated().and()).csrf().disable()).sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()).addFilterBefore(new AutenticacaoViaTokenFilter(this.tokenService, this.usuarioRepository), UsernamePasswordAuthenticationFilter.class);
	}

	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(new String[]{"/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**", "/**.css", "/**.js", "/assets/**"});
	}
}







