package tn.edu.esprit.arctic1.sportNewsClient.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.arctic1.sportNews.domain.Category;
import tn.edu.esprit.arctic1.sportNews.services.interfaces.CategoryServicesRemote;

public class TestFindAllCategories {
	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			CategoryServicesRemote proxy = (CategoryServicesRemote) context
					.lookup("tn.edu.esprit.arctic1.sportNews/CategoryServices!tn.edu.esprit.arctic1.sportNews.services.interfaces.CategoryServicesRemote");

			List<Category> categories = proxy.findAllCategories();
			for (Category c : categories) {
				System.out.println(c.getName());
			}

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
