package tn.edu.esprit.arctic1.sportNews.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import tn.edu.esprit.arctic1.sportNews.domain.Category;
import tn.edu.esprit.arctic1.sportNews.domain.News;
import tn.edu.esprit.arctic1.sportNews.services.interfaces.CategoryServicesLocal;
import tn.edu.esprit.arctic1.sportNews.services.interfaces.CategoryServicesRemote;

/**
 * Session Bean implementation class CategoryServices
 */
@Stateless
public class CategoryServices implements CategoryServicesRemote,
		CategoryServicesLocal {

	/**
	 * Default constructor.
	 */
	public CategoryServices() {
	}

	@Override
	public List<Category> findAllCategories() {
		List<Category> categories = new ArrayList<Category>();

		Category category = new Category();
		category.setId(1);
		category.setName("soccer");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("swimming");

		categories.add(category);
		categories.add(category2);

		return categories;
	}

	@Override
	public List<News> findAllNewsByCategoryId(int idCategory) {
		List<News> newss = new ArrayList<News>();

		News news = new News();
		news.setId(1);
		news.setContent("chelsea defeated ManCity 2 - 0 ");

		News news2 = new News();
		news2.setId(2);
		news2.setContent("justin bieber arrested for  driving drunk  ");

		newss.add(news);
		newss.add(news2);
		return newss;
	}

}
