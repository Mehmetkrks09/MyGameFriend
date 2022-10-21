package com.Mehmet.MyGameFriends.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mehmet.MyGameFriends.business.abstracts.FriendshipService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.core.results.SuccessDataResult;
import com.Mehmet.MyGameFriends.core.results.SuccessResult;
import com.Mehmet.MyGameFriends.dataAccess.FriendshipDao;
import com.Mehmet.MyGameFriends.entities.Friendship;

@Service
public class FriendshipManager implements FriendshipService {

	private FriendshipDao friendshipDao;
	
	@Autowired
	public FriendshipManager(FriendshipDao friendshipDao) {
		super();
		this.friendshipDao = friendshipDao;
	}

	@Override
	public Result add(Friendship friendship) {

		friendshipDao.save(friendship);
		return new SuccessResult("Sent the Request");
		
	}

	@Override
	public Result delete(int id) {

		Friendship newFriendship= new Friendship();
		newFriendship.setId(id);
		friendshipDao.delete(newFriendship);
		return new SuccessResult("Friendship is End");
	}

	@Override
	public Result update(Friendship friendship) {

		Friendship newFriendship= new Friendship();
		newFriendship.setId(friendship.getId());
		newFriendship.setReceiverId(friendship.getReceiverId());
		newFriendship.setSenderId(friendship.getSenderId());
		newFriendship.setAccepted(true);
		return new SuccessResult("Friendship  Updated");
	}

	@Override
	public DataResult<List<Friendship>> getAll() {

		return new SuccessDataResult<List<Friendship>>(friendshipDao.findAll(), "Friends Listed");
	}

	@Override
	public DataResult<Friendship> getById(int id) {

		return new SuccessDataResult<Friendship>(this.friendshipDao.getById(id));
	}

}
