package com.Mehmet.MyGameFriends.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Mehmet.MyGameFriends.business.abstracts.GameService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Game;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/game")
public class GameController {

	private GameService gameService;

	@Autowired
	public GameController(GameService gameService) {
		super();
		this.gameService = gameService;
	}

	@GetMapping("/getall")
	public DataResult<List<Game>> getAll() {
		return this.gameService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Game> getById(int id) {
		return this.gameService.getById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody Game game) {

		return this.gameService.add(game);
	}

	@DeleteMapping("/delete")
	public Result delete( int id) {

		return this.gameService.delete(id);
	}

	@PutMapping("/update")
	public Result update(@RequestBody Game game) {

		return this.gameService.update(game);
	}
}
