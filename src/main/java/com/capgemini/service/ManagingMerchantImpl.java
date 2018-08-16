package com.capgemini.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.capgemini.model.Merchant;
import com.capgemini.repository.MerchantManageRepository;

@Component
public class ManagingMerchantImpl implements ManagingMerchantService {

	@Autowired
	MerchantManageRepository repo;

	
	@Override
	public void AddMerchant(Merchant merch) {
		repo.save(merch);
		
	}

	@Override
	public void DeleteMerchant(int id) {
		
		Merchant merch=repo.getOne(id);
		repo.delete(merch);
		
	}

	@Override
	public void UpdateMerchant(Merchant merch) {
		repo.save(merch);
		
	}

	@Override
	public List<Merchant> displayMerchant() {
		return repo.findAll();
	}

	@Override
	public Merchant displaySingleMerchant(int id) {
		return repo.merchantdisplay(id);
	}


}
