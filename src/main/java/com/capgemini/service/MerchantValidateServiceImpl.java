package com.capgemini.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.model.Merchant;
import com.capgemini.repository.MerchantRepository;

@Component
public class MerchantValidateServiceImpl implements MerchantValidateService {
	@Autowired
	MerchantRepository repo;

	public MerchantValidateServiceImpl(MerchantRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Merchant> getMerchantDetails() throws MerchantNotFoundException {
		// TODO Auto-generated method stub
		String status = "Not Approved";
		List<Merchant> list = repo.getDetailsofMerchant(status);
		//System.out.println(list);
		if (list!= null)
			return list;
		else
			throw new MerchantNotFoundException("Merchant does not exist");

	}

	@Override
	public List<Merchant> merchantValidation(List<Merchant> merchantList) {
		// TODO Auto-generated method stub

		Merchant merchant = new Merchant();
		Iterator<Merchant> iter = merchantList.iterator();
		while (iter.hasNext()) {
			merchant = iter.next();
			if (merchant.getStatus().equals("accept")) {
				merchant.setStatus("Approved");
				repo.save(merchant);

			} else {
				//merchant.setStatus("Not Approved");
				//repo.save(merchant);
                   repo.delete(merchant);
			}

		}
		return merchantList;
	}
}