package control;

import model.bean.Usuario;
import model.dao.GenericDAO;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private GenericDAO dao = new GenericDAO();

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
