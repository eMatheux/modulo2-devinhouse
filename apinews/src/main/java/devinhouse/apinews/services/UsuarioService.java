package devinhouse.apinews.services;

import devinhouse.apinews.model.Usuario;
import devinhouse.apinews.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }
    public Usuario saveUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario getUserById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
    public void deleteUser(Long id) {
        usuarioRepository.deleteById(id);
    }
}
