package com.Mehmet.MyGameFriends.business.abstracts;

import java.util.List;

import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Friendship;

public interface FriendshipService {

	Result add(Friendship friendship);
	Result delete(int id);
	Result update(Friendship friendship);
	DataResult<List<Friendship>> getAll();
	DataResult<Friendship> getById(int id);

}
