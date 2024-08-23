package com.example.usuario_api.controller;

import com.example.usuario_api.model.Usuario;
import com.example.usuario_api.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private Userservice userservice;

    @PostMapping("/batch")
    public List<Usuario> crearUsuarios(@RequestBody List<Usuario> usuarios) {
        return userservice.crearUsuarios(usuarios);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id){
        return userservice.obtenerUsuarioPorId(id);
    }

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios(){
        return userservice.obtenerTodosLosUsuarios();
    }
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id,@RequestBody Usuario usuario){
        return userservice.actualizarUsuario(id,usuario);
    }
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        userservice.eliminarUsuario(id);
    }

}
