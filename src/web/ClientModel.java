package web;

import java.util.ArrayList;

import metier.ClientP;

public class ClientModel {
	private String motCle;
	private ClientP client = new ClientP();
	private ArrayList<ClientP> listClients=new ArrayList<ClientP>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public ClientP getClient() {
		return client;
	}
	public void setClient(ClientP client) {
		this.client = client;
	}
	public ArrayList<ClientP> getListClients() {
		return listClients;
	}
	public void setListClients(ArrayList<ClientP> listClients) {
		this.listClients = listClients;
	}}
