package com.Mehmet.MyGameFriends.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mehmet.MyGameFriends.entities.Game;

public interface GameDao extends JpaRepository<Game, Integer>{

		Game getById(int id);
}
