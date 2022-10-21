package com.Mehmet.MyGameFriends.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Mehmet.MyGameFriends.entities.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

	Category getById(int id);
}
