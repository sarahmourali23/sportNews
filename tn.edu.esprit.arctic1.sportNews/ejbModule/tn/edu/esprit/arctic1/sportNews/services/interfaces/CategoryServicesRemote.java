package tn.edu.esprit.arctic1.sportNews.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.arctic1.sportNews.domain.Category;
import tn.edu.esprit.arctic1.sportNews.domain.News;

@Remote
public interface CategoryServicesRemote {

	public List<Category> findAllCategories();

	public List<News> findAllNewsByCategoryId(int idCategory);

}
