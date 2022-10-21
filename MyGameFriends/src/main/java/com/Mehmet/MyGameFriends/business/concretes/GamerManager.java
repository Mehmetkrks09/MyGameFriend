package com.Mehmet.MyGameFriends.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mehmet.MyGameFriends.business.abstracts.GamerService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.core.results.SuccessDataResult;
import com.Mehmet.MyGameFriends.core.results.SuccessResult;
import com.Mehmet.MyGameFriends.dataAccess.GamerDao;
import com.Mehmet.MyGameFriends.entities.Gamer;

@Service
public class GamerManager implements GamerService {

	private GamerDao gamerDao;
	
	@Autowired
	public GamerManager(GamerDao gamerDao) {
		super();
		this.gamerDao = gamerDao;
	}

	@Override
	public Result add(Gamer gamer) {

		gamerDao.save(gamer);
		return new SuccessResult("Gamer Added");
	}

	@Override
	public Result delete(int id) {
		Gamer newGamer = new Gamer();
		newGamer.setId(id);
		gamerDao.delete(newGamer);
		return new SuccessResult("Gamer Deleted");
	}

	@Override
	public Result update(Gamer gamer) {

		Gamer newGamer = new Gamer();
		newGamer.setId(gamer.getId());
		newGamer.setName(gamer.getName());
		newGamer.setAvaibleHours(gamer.getAvaibleHours());
		newGamer.setBirtOfDay(gamer.getBirtOfDay());
		newGamer.setCountry(gamer.getCountry());
		newGamer.setEmail(gamer.getEmail());
		newGamer.setGameId(gamer.getGameId());
		newGamer.setGamerNick(gamer.getGamerNick());
		newGamer.setLastName(gamer.getLastName());
		newGamer.setGender(gamer.getGender());
		newGamer.setPassword(gamer.getPassword());
		gamerDao.save(newGamer);
		return new SuccessResult("Gamer  Updated");
	}

	@Override
	public DataResult<List<Gamer>> getAll() {

		return new SuccessDataResult<List<Gamer>>(gamerDao.findAll(), "Gamers Listed");
	}

	@Override
	public DataResult<Gamer> getById(int id) {

		return new SuccessDataResult<Gamer>(gamerDao.getById(id), "Gamer Listed");
	}

}
