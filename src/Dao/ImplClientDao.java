package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import metier.ClientP;

public class ImplClientDao  implements ClientDao{

	@Override
	public ClientP save(ClientP clt) {
		Connection connection =DbConnection.getConnection();
		try {
			PreparedStatement ps =connection.prepareStatement
					("INSERT INTO CLIENT (NOM,PRENOM,CODE,TYPE) VALUES(?,?,?,?)");
			ps.setString(1, clt.getNom());
			ps.setString(2, clt.getPrenom());
			ps.setInt(3,clt.getCode());
			ps.setString(4, clt.getType());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(id) AS MAXID FROM CLIENT");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				clt.setId(rs.getLong("MAXID"));
			}
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clt;
	}

	
	@Override
	public ArrayList<ClientP> getClientParName(String name) {
		ArrayList<ClientP> clients =new ArrayList<ClientP>();
		Connection connection =DbConnection.getConnection();
		try {
			PreparedStatement ps =connection.prepareStatement
					("SELECT * FROM CLIENT WHERE NOM LIKE ? ");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ClientP clt=new ClientP();
				clt.setId(rs.getLong("id"));
				clt.setNom(rs.getString("nom"));
				clt.setPrenom(rs.getString("prenom"));
				clt.setCode(rs.getInt("code"));
				clt.setType(rs.getString("type"));
				
				clients.add(clt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clients;
	}
	

	@Override
	public ClientP getParId(Long id) {
		ClientP client =null;
		Connection connection =DbConnection.getConnection();
		try {
			PreparedStatement ps =connection.prepareStatement
					("SELECT * FROM CLIENT WHERE ID LIKE ? ");
			ps.setLong(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				client=new ClientP();
				client.setId(rs.getLong("id"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setCode(rs.getInt("code"));
				client.setType(rs.getString("type"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

	@Override
	public ClientP update(ClientP clt) {
		Connection connection =DbConnection.getConnection();
		try {
			PreparedStatement ps =connection.prepareStatement
					("UPDATE CLIENT SET NOM=?,PRENOM=?,CODE=?,TYPE=? WHERE id=?");
			ps.setString(1, clt.getNom());
			ps.setString(2, clt.getPrenom());
			ps.setInt(3,clt.getCode());
			ps.setString(4, clt.getType());
			ps.setLong(5, clt.getId());
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clt;
	}

	@Override
	public ClientP delete(Long id) {
		Connection connection =DbConnection.getConnection();
		try {
			PreparedStatement ps =connection.prepareStatement
					("DELETE FROM CLIENT WHERE ID=?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
