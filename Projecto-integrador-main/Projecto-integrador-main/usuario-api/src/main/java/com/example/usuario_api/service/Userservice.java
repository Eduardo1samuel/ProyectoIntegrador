package com.example.usuario_api.service;
import com.example.usuario_api.model.Usuario;

import java.util.List;

public interface Userservice {
    List<Usuario> crearUsuarios(List<Usuario> usuarios);
    Usuario obtenerUsuarioPorId(Long id);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario actualizarUsuario(Long id, Usuario usuario);
    void eliminarUsuario(Long id);
}

