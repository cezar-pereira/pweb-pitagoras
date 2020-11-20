package br.com.kroton.pweb.recursos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kroton.pweb.entidades.Usuario;
import br.com.kroton.pweb.repositorios.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repositorio;

    public List<Usuario> findAll() {
        return repositorio.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return repositorio.findById(id);
    }

}
