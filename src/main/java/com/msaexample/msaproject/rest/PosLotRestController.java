package com.msaexample.msaproject.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msaexample.msaproject.domain.model.TnLotInfo;
import com.msaexample.msaproject.domain.service.LotInfoService;

@RestController
@CrossOrigin
public class PosLotRestController {
	@Autowired LotInfoService lotInfoService;
	@RequestMapping(value = "/tnLotInfo/createLots", method = RequestMethod.POST)
	public ResponseEntity<String> createLots(@RequestBody List<TnLotInfo> lotlist) {
		String sucess_yn = lotInfoService.createLotInfo(lotlist);
		return new ResponseEntity<String>(sucess_yn, HttpStatus.OK);
	}

}
