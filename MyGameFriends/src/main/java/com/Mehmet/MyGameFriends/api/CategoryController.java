package com.Mehmet.MyGameFriends.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mehmet.MyGameFriends.business.abstracts.CategoryService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Category;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/category")
public class CategoryController {

	private CategoryService categoryService;

	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	@GetMapping("/getall")
	public DataResult<List<Category>> getAll() {
		return this.categoryService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Category> getById(int id) {
		return this.categoryService.getById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody Category category) {

		return this.categoryService.add(category);
	}

	@DeleteMapping("/delete")
	public Result delete( int id) {

		return this.categoryService.delete(id);
	}

	@PutMapping("/update")
	public Result update(@RequestBody Category category) {

		return this.categoryService.update(category);
	}
}
