/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.greencookbook.control.client;

import br.univali.greencookbook.model.dao.GenericDAO;
import br.univali.greencookbook.model.entity.Usuario;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author biankatpas
 */
@ManagedBean
@SessionScoped
public class UsuarioBean{

    private Usuario usuario;
    private GenericDAO dao;

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        usuario = new Usuario();
        dao = new GenericDAO();
    }

    public String add() {
        dao.insert(usuario);
        return "salvo";
    }

    public String remove() {
        dao.remove(usuario);
        return "excluido";
    }

    public String update() {
        dao.update(usuario);
        return "atualizado";
    }

    public String findByIda() {
        dao.selectById(usuario);
        return "encontrado";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
