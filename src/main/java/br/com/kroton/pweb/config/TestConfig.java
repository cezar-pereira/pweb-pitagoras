package br.com.kroton.pweb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.kroton.pweb.entidades.Usuario;
import br.com.kroton.pweb.repositorios.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario1 = new Usuario(7L, "Cezar", "cezar@email.com", "(82) 99999-9999", "123456");
        Usuario usuario2 = new Usuario(7L, "Cezar2", "cezar@email.com2", "(82) 99999-99992", "1234562");
        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2));
    }

}
