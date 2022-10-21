package com.Mehmet.MyGameFriends.business.abstracts;

import java.util.List; 

import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Category;

public interface CategoryService  {

	Result add(Category category);
	Result delete(int id);
	Result update(Category category);
	DataResult<List<Category>> getAll();
	DataResult<Category> getById(int id);
}
