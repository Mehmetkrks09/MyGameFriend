package com.Mehmet.MyGameFriends.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "games")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand_id")
	private  int brandId;
	
	@Column(name = "category_id")
	private  int categoryId;
	
	@Column(name = "name")
	private  String name;
	
	@Column(name = "image")
	private  String image;
	
	@Column(name = "gamer_count")
	private  int gamerCount;
	
}
