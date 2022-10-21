package com.Mehmet.MyGameFriends.business.abstracts;

import java.util.List;

import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Brand;

public interface BrandService {
	
	Result add(Brand brand);
	Result delete(int id);
	Result update(Brand brand);
	DataResult<List<Brand>> getAll();
	DataResult<Brand> getById(int id);
}
