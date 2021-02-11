package Dao;

import java.util.ArrayList;

import metier.ClientP;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClientDao dao=new  ImplClientDao();
		ClientP p1=dao.save(new ClientP("hicham","gujjdgg",50,"perssone"));
		ClientP p2=dao.save(new ClientP("hilalh","gokilgg",4,"perssone"));
		ClientP p3=dao.save(new ClientP("hadinh","gddgeg",5,"perssone"));
		System.out.println(p1.toString()+p2.toString());
		dao.delete(40l);
		System.out.println(p1.toString()+p2.toString());
		ArrayList<ClientP> clts=dao.getClientParName("%nizar%");
		
		for(ClientP clt :clts) {
			System.out.println(clt.toString());
		}
		
	}

}
