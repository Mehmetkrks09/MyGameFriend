package com.Mehmet.MyGameFriends.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mehmet.MyGameFriends.business.abstracts.GameService;

import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.core.results.SuccessDataResult;
import com.Mehmet.MyGameFriends.core.results.SuccessResult;
import com.Mehmet.MyGameFriends.dataAccess.GameDao;
import com.Mehmet.MyGameFriends.entities.Game;
import com.Mehmet.MyGameFriends.entities.Gamer;

@Service
public class GameManager  implements GameService {
	
	private GameDao gameDao;

	@Autowired
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public Result add(Game game) {

		gameDao.save(game);
		return new SuccessResult("Game Has Been Added");
	}

	@Override
	public Result delete(int id) {
		Game newGame= new Game();
		newGame.setId(id);
		gameDao.delete(newGame);
		return new SuccessResult("Game Has Been Deleted");
	}

	@Override
	public Result update(Game game) {

		Game newGame= new Game();
		newGame.setId(game.getId());
		newGame.setBrandId(game.getBrandId());
		newGame.setCategoryId(game.getCategoryId());
		newGame.setGamerCount(game.getGamerCount());
		newGame.setImage(game.getImage());
		newGame.setName(game.getName());
		gameDao.save(newGame);
		return new SuccessResult("Game Has Been Updated");
	}

	@Override
	public DataResult<List<Game>> getAll() {

		return new SuccessDataResult<List<Game>>(gameDao.findAll(), "Games Listed");
	}

	@Override
	public DataResult<Game> getById(int id) {

		return new SuccessDataResult<Game>(gameDao.getById(id), "Game listed");
	}

	


}
