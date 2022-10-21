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

import com.Mehmet.MyGameFriends.business.abstracts.FriendshipService;
import com.Mehmet.MyGameFriends.core.results.DataResult;
import com.Mehmet.MyGameFriends.core.results.Result;
import com.Mehmet.MyGameFriends.entities.Friendship;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/api/friendship")
public class FriendshipController {

	private FriendshipService friendshipService;

	@Autowired
	public FriendshipController(FriendshipService friendshipService) {
		super();
		this.friendshipService = friendshipService;
	}

	@GetMapping("/getall")
	public DataResult<List<Friendship>> getAll() {
		return this.friendshipService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Friendship> getById(int id) {
		return this.friendshipService.getById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody Friendship friendship) {

		return this.friendshipService.add(friendship);
	}

	@DeleteMapping("/delete")
	public Result delete( int id) {

		return this.friendshipService.delete(id);
	}

	@PutMapping("/update")
	public Result update(@RequestBody Friendship friendship) {

		return this.friendshipService.update(friendship);
	}
}
