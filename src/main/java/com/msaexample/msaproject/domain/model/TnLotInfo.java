package com.msaexample.msaproject.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "TN_LOT_INFO")
public class TnLotInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long objId;
	private String lotId;
	private String siteId;
	private String mtrlLotId;
	private double qty;

}
