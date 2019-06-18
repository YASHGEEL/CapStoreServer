package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Category;
import com.capgemini.model.Merchant;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.model.ReportView;
import com.capgemini.model.ReportViewCategory;
import com.capgemini.model.ReportViewMerchant;
import com.capgemini.repository.ProductReportRepository;


	@Service("service")
	public class DispatchReportServiceImpl implements DispatchReportService{

		@Autowired
		ProductReportRepository repo;
		int flag=0;
		
		public DispatchReportServiceImpl(ProductReportRepository repo) {
			super();
			this.repo = repo;
		}

		@Override
		public List displayReportForProduct(int prodId) throws ProductNotFoundException {
		
			List<ReportView> reportView=new ArrayList();
			List<OrderDetails> orderdetails=repo.getOrderDetails();
			for(OrderDetails order:orderdetails)
			{
				List<Product> product=order.getProduct();
				for(Product pr:product)
				{
					if(pr.getId()==prodId)
					{
						ReportView rv= new ReportView();
						rv.setpId(pr.getId());
						rv.setpName(pr.getName());
						rv.setOrderId(order.getId());
						rv.setDate(order.getStartTime());
						rv.setCustId(order.getCustomer().getId());
						rv.setCustName(order.getCustomer().getName());
						rv.setStatus(order.getStatus());
						reportView.add(rv);
						flag=1;
						break;
					}
				}
				if(flag==0)
					throw new ProductNotFoundException();
			}
			return reportView;
		}

		@Override
		public List displayReportForCategory(int catId) throws CategoryNotFoundException {
			List<ReportViewCategory> reportCategory=new ArrayList();
			List<OrderDetails> orderdetails=repo.getOrderDetails();
			for(OrderDetails order:orderdetails)
			{
				List<Product> product=order.getProduct();
				for(Product pr:product)
				{
					Category c=pr.getCategory();
					if(c.getId()==catId)
					{
						ReportViewCategory rvc=new ReportViewCategory();
						rvc.setCatId(c.getId());
						rvc.setCatName(c.getName());
						rvc.setProdId(pr.getId());
						rvc.setProdName(pr.getName());
						rvc.setCustId(order.getCustomer().getId());
						rvc.setStatus(order.getStatus());
						rvc.setDate(order.getStartTime());
						reportCategory.add(rvc);
						flag=1;
					}
				}
				if(flag==0)
					throw new CategoryNotFoundException();
			}
			return reportCategory;
		}

		@Override
		public List displayReportForMerchant(int mId) throws MerchantNotFoundException {
	
			List<ReportViewMerchant> reportMerchant=new ArrayList();
			List<OrderDetails> orderdetails=repo.getOrderDetails();
			for(OrderDetails order:orderdetails)
			{
				List<Product> product=order.getProduct();
				for(Product pr:product)
				{
					Merchant merchant=pr.getMerchant();
					if(merchant.getId()==mId)
					{
						ReportViewMerchant rvm=new ReportViewMerchant();
						rvm.setMerchantId(merchant.getId());
						rvm.setMerchantName(merchant.getName());
						rvm.setPhone(merchant.getPhone());
						rvm.setAddress(merchant.getAddress());
						rvm.setProdId(pr.getId());
						rvm.setCustId(order.getCustomer().getId());
						rvm.setStatus(order.getStatus());
						rvm.setDate(order.getStartTime());
						reportMerchant.add(rvm);
						flag=1;
						
					}
				}
				if(flag==0)
					throw new MerchantNotFoundException();
			}
			return reportMerchant;
		}






}