package com.Mehmet.MyGameFriends.business.abstracts;

import java.util.List;

import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Game;

public interface GameService {

	Result add(Game game);
	Result delete(int id);
	Result update(Game game);
	DataResult<List<Game>> getAll();
	DataResult<Game> getById(int id);

}
