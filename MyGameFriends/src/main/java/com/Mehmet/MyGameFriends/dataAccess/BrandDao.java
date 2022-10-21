package com.Mehmet.MyGameFriends.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mehmet.MyGameFriends.entities.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {
	
	Brand getById(int id);

}
