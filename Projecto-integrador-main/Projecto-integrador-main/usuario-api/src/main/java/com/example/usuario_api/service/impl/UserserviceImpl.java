package com.example.usuario_api.service.impl;

import com.example.usuario_api.model.Usuario;
import com.example.usuario_api.service.Userservice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserserviceImpl implements Userservice {


    private Map<Long, Usuario> usuarios = new HashMap<>();
    private Long idCounter = 1L;


    public List<Usuario> crearUsuarios(List<Usuario> usuarios){
        for (Usuario usuario: usuarios){
            usuario.setId(idCounter++);
            this.usuarios.put(usuario.getId(),usuario);
        }
        return usuarios;
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarios.get(id);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        if (usuarios.containsKey(id)){
            usuario.setId(id);
            usuario.setId(id);
            usuarios.put(id,usuario);
            return usuario;
        }
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {
            usuarios.remove(id);
    }
}
