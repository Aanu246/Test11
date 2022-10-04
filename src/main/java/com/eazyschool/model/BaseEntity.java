package com.eazyschool.model;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	private LocalDateTime createdAt;
	private String createdBy;
	private LocalDateTime updateAt;
	private String updatedBy;
	
	

}
