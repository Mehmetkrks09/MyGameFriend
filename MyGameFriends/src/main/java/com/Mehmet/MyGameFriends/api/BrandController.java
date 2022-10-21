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

import com.Mehmet.MyGameFriends.business.abstracts.BrandService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Brand;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/brand")
public class BrandController {

	private BrandService brandService;

	@Autowired
	public BrandController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public DataResult<List<Brand>> getAll() {
		return this.brandService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Brand> getById(int id) {
		return this.brandService.getById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody Brand brand) {

		return this.brandService.add(brand);
	}

	@DeleteMapping("/delete")
	public Result delete( int id) {

		return this.brandService.delete(id);
	}

	@PutMapping("/update")
	public Result update(@RequestBody Brand brand) {

		return this.brandService.update(brand);
	}
}
