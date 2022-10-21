package com.Mehmet.MyGameFriends.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Mehmet.MyGameFriends.entities.Gamer;

public interface GamerDao  extends JpaRepository<Gamer, Integer>{

		Gamer getById(int id);
}
