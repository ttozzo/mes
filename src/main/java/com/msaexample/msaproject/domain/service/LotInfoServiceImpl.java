package com.msaexample.msaproject.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msaexample.msaproject.domain.model.TnLotInfo;
import com.msaexample.msaproject.domain.repository.TnLotInfoRepository;

@Service
@Transactional
public class LotInfoServiceImpl implements LotInfoService {
	@Autowired
	private TnLotInfoRepository tnLotInfoRepository;
	
	String ret = "Sucess";
	
	@Override
	public String createLotInfo(List<TnLotInfo> lotInfoList){
		tnLotInfoRepository.saveAll(lotInfoList);
		return ret;
	}

}
