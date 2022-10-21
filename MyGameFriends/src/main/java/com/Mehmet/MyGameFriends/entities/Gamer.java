package com.Mehmet.MyGameFriends.entities;

import java.util.Date;

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
@Table(name = "gamers")
public class Gamer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "game_id")
	private  int gameId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_name")
	private  String lastName;
	
	@Column(name = "country")
	private  String country;
	
	@Column(name = "email")
	private  String email;
	
	@Column(name = "password")
	private  String password;
	
	@Column(name = "birth_of_day")
	private  Date birtOfDay;
	
	@Column(name = "gender")
	private  String  gender;
	
	@Column(name = "gamer_nick")
	private String gamerNick;
	
	@Column(name = "avaible_hours")
	private  Date avaibleHours;
	
	
}
