package com.theplayer.kits.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "abc")
public class HomeEntity  {
	
	@Id
	@Column(name = "pk")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "StudentName")
    private String studentname;
	
	@Column(name = "Course")
    private String course;
	
	@Column(name = "Fee")
    private String fee;
	
	
}

