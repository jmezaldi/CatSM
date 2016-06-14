package com.yanbal.catalogo.dao;


import com.yanbal.catalogo.bean.UsuarioBean;
import java.util.List;

public interface UsuarioDAO {
	
	public List<UsuarioBean> consultaUsuario(String usuario);

}
