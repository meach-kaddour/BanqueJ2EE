package Dao;

import java.util.ArrayList;

import metier.ClientP;

public interface ClientDao {
	public ClientP save(ClientP clt);
	public ClientP getParId(Long id);
	public ClientP update(ClientP clt);
	public ClientP delete(Long id);
	public ArrayList<ClientP> getClientParName(String name);
}
