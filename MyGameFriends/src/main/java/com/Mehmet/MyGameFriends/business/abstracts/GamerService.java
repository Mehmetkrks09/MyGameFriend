package com.Mehmet.MyGameFriends.business.abstracts;

import java.util.List;

import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Gamer;

public interface GamerService {


	Result add(Gamer gamer);
	Result delete(int id);
	Result update(Gamer gamer);
	DataResult<List<Gamer>> getAll();
	DataResult<Gamer> getById(int id);


}
