package br.com.kroton.pweb.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kroton.pweb.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
