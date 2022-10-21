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
@Table(name = "friendships")
public class Friendship {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private  int id;
	
	@Column(name = "sender_id")
	private  int senderId;
	
	@Column(name = "receiver_id")
	private  int receiverId;
	
	@Column(name = "is_accepted")
	private  boolean isAccepted;

}
