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

import com.Mehmet.MyGameFriends.business.abstracts.GamerService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Gamer;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/gamer")
public class GamerController {

	private GamerService gamerService;

	@Autowired
	public GamerController(GamerService gamerService) {
		super();
		this.gamerService = gamerService;
	}

	@GetMapping("/getall")
	public DataResult<List<Gamer>> getAll() {
		return this.gamerService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Gamer> getById(int id) {
		return this.gamerService.getById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody Gamer gamer) {

		return this.gamerService.add(gamer);
	}

	@DeleteMapping("/delete")
	public Result delete( int id) {

		return this.gamerService.delete(id);
	}

	@PutMapping("/update")
	public Result update(@RequestBody Gamer gamer) {

		return this.gamerService.update(gamer);
	}
}
