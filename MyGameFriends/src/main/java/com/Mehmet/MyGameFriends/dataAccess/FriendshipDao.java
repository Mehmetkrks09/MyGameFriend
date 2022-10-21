package com.Mehmet.MyGameFriends.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mehmet.MyGameFriends.entities.Friendship;


public interface FriendshipDao extends JpaRepository<Friendship, Integer>{

		Friendship getById(int id);
}
