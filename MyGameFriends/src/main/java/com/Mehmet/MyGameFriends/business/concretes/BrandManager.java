package com.Mehmet.MyGameFriends.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mehmet.MyGameFriends.business.abstracts.BrandService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.core.results.SuccessDataResult;
import com.Mehmet.MyGameFriends.core.results.SuccessResult;
import com.Mehmet.MyGameFriends.dataAccess.BrandDao;
import com.Mehmet.MyGameFriends.entities.Brand;

@Service
public class BrandManager implements BrandService{

	
	private BrandDao brandDao;
	
	@Autowired
	public BrandManager(BrandDao brandDao) {
		super();
		this.brandDao = brandDao;
	}

	
	
	@Override
	public Result add(Brand brand) {

		brandDao.save(brand);
		return new SuccessResult("Brand is Added!");
	}

	@Override
	public Result delete(int  id) {
		
		Brand brand = new Brand();
		brand.setId(id);
		brandDao.delete(brand);
       return new SuccessResult("Brand Has Been Deleted!");
	}

	@Override
	public Result update(Brand brand) {

	  Brand newBrand= new Brand();
	  newBrand.setId(brand.getId());
	  newBrand.setEmail(brand.getEmail());
	  newBrand.setImage(brand.getImage());
	  newBrand.setWebsite(brand.getWebsite());
	  brandDao.save(newBrand);
	  return new SuccessResult("Brand Has Been Updated");
	}

	@Override
	public DataResult<List<Brand>> getAll() {

		return new SuccessDataResult<List<Brand>>(brandDao.findAll(),"Brands Listed");
	}

	@Override
	public DataResult<Brand> getById(int id) {

		return new SuccessDataResult<Brand>(this.brandDao.getById(id), "Brand listed");
	}

}
