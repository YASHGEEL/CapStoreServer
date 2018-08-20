package com.capgemini.service;

import java.util.List;
import com.capgemini.model.Merchant;

public interface ManagingMerchantService {
public void AddMerchant(Merchant merch);
public void DeleteMerchant(int id);
public void UpdateMerchant(Merchant merch);
public List<Merchant> displayMerchant();
public List<Merchant> displayApprovedMerchant();
}
