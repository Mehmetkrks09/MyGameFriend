package com.Mehmet.MyGameFriends.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mehmet.MyGameFriends.business.abstracts.CategoryService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.core.results.SuccessDataResult;
import com.Mehmet.MyGameFriends.core.results.SuccessResult;
import com.Mehmet.MyGameFriends.dataAccess.CategoryDao;
import com.Mehmet.MyGameFriends.entities.Category;

@Service
public class CategoryManager implements CategoryService{
	
	@Autowired
	private CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	
	
	@Override
	public Result add(Category category) {
		
		categoryDao.save(category);
		return new SuccessResult("Category Has Been Added!");
		
	}

	@Override
	public Result delete(int id) {

		Category newCategory = new Category();
		newCategory.setCategoryId(id);
		categoryDao.delete(newCategory);
		return new SuccessResult("Category Has Deleted");
	}

	@Override
	public Result update(Category category) {
		
		Category newCategory = new Category();
		newCategory.setCategoryId(category.getCategoryId());
		newCategory.setCategoryName(category.getCategoryName());
		categoryDao.save(newCategory);
		return new SuccessResult("Category Has Been Updated");
	}

	@Override
	public DataResult<List<Category>> getAll() {

		return new SuccessDataResult<List<Category>>(categoryDao.findAll(),"Categories Listed");
	}

	@Override
	public DataResult<Category> getById(int id) {

		return new SuccessDataResult<Category>(categoryDao.getById(id));
	}

}
