package com.msaexample.msaproject.domain.repository;

import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.msaexample.msaproject.domain.model.TnLotInfo;

@CrossOrigin
public interface TnLotInfoRepository extends PagingAndSortingRepository<TnLotInfo, Long>,
												QuerydslPredicateExecutor<TnLotInfo>{
	
	public List<TnLotInfo> findByLotIdAndSiteId(String LotId, String siteId);

}
