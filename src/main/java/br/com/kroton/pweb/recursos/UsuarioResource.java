package br.com.kroton.pweb.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kroton.pweb.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<Usuario> getTodos() {
        Usuario usuario1 = new Usuario(7L, "Cezar", "cezar@email.com", "(82) 99999-9999", "123456");
        return ResponseEntity.ok(usuario1);
    }
}
