package br.com.qosdesenvolvimentos.sercurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.com.qosdesenvolvimentos.model.Usuario;

public class UsuarioSistema extends User {

	private static final long serialVersionUID =1L;
	
	private Usuario usuario;

	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
		super(usuario.getEmail(), usuario.getSenha(), authorities);
		this.usuario = usuario;
	}
	

	public UsuarioSistema(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}










	public UsuarioSistema(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
	}










	public Usuario getUsuario() {
		return usuario;
	}
	
	

}
