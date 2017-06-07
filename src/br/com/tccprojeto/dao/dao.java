package br.com.tccprojeto.dao;

import java.sql.*;

import com.mysql.jdbc.Statement;

import br.com.tccprojeto.conexao.conexao;
import br.com.tccprojeto.modelo.tccmodelo;

public class dao {

	public static void enserir(tccmodelo mod) {

		try {
			String sql = "insert into tccprojeto (registro, titulo, autor, curso) values (?,?,?,?)";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);

			st.setString(1, mod.getRegistro());
			st.setString(2, mod.getTitulo());
			st.setString(3, mod.getAutor());
			st.setString(4, mod.getCurso());
			st.execute();
			System.out.println("dados enseridos com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void excluir(tccmodelo mod) {

		try {
			String sql = "delete from tccprojeto where idtcc='" + mod.getId() + "'";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			st.execute();
			System.out.println("registro excluido com sucesso");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void alterar(tccmodelo mod) {

		try {
			String sql = "update tccprojeto set registro=?, titulo=?, autor=?, curso=? where idtcc=?";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			st.setString(1, mod.getRegistro());
			st.setString(2, mod.getTitulo());
			st.setString(3, mod.getAutor());
			st.setString(4, mod.getCurso());
			st.setInt(5, mod.getId());
			st.execute();
			System.out.println("dados alterados com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void pesquisarPorTiulo(tccmodelo mod) {
		try {
			String sql = "select * from tccprojeto where titulo='" + mod.getTitulo() + "'";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("registro"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println(rs.getString("curso"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void pesquisarPorAutor(tccmodelo mod) {
		try {
			String sql = "select * from tccprojeto where autor='" + mod.getAutor() + "'";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("registro"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println(rs.getString("curso"));
			}
			System.out.println("registro encontrado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void pesquisarPorCurso(tccmodelo mod) {
		try {
			String sql = "select * from tccprojeto where curso='" + mod.getCurso() + "'";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("registro"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println(rs.getString("curso"));
			}
			System.out.println("registro encontrado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void pesquisarPorRegistro(tccmodelo mod) {
		try {
			String sql = "select * from tccprojeto where registro='" + mod.getRegistro() + "'";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("registro"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println(rs.getString("curso"));
			}
			System.out.println("registro encontrado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void lista() {
		try {
			String sql = "select * from tccprojeto";
			PreparedStatement st = conexao.conexao().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("registro"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println(rs.getString("curso"));
			}
			System.out.println("registro encontrado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
