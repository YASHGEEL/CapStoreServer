package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

public class DisplayProductUtil {

	public IDisplayProductUtil myFunct(Product product) {

		IDisplayProductUtil util = new IDisplayProductUtil() {

			@Override
			public int getId() {

				return product.getId();
			}

			@Override
			public String getName() {

				return product.getName();
			}

			@Override
			public String getBrand() {

				return product.getBrand();
			}

			@Override
			public String getDescription() {

				return product.getDescription();
			}

			@Override
			public float getCost() {

				return product.getCost();
			}

			@Override
			public String getStatus() {

				return product.getStatus();
			}

			@Override
			public int getQuantity() {

				return product.getQuantity();
			}

			@Override
			public String getImageUrl() {

				return product.getImageUrl();
			}

			@Override
			public int getViewCount() {

				return product.getViewCount();
			}

			@Override
			public float getAverageRating() {

				return product.getAverageRating();
			}

			@Override
			public CategoryData getCategory() {

				CategoryData cData = new CategoryData() {

					@Override
					public String getName() {
						return product.getCategory().getName();
					}

					@Override
					public int getId() {

						return product.getCategory().getId();
					}
				};
				return cData;
			}

			@Override
			public List<FeedBackData> getFeedback() {

				List<FeedBack> fList = product.getFeedback();
				List<FeedBackData> feedBackList = new ArrayList<FeedBackData>();
				for (FeedBack feedBack : fList) {
					FeedBackData fData = new FeedBackData() {

						@Override
						public int getRating() {

							return feedBack.getRating();
						}

						@Override
						public int getId() {

							return feedBack.getId();
						}

						@Override
						public String getFeedbackResponse() {

							return feedBack.getFeedbackResponse();
						}

						@Override
						public CustomerData getCustomer() {

							CustomerData cData = new CustomerData() {

								@Override
								public String getName() {

									return feedBack.getCustomer().getName();
								}

								@Override
								public String getImageUrl() {

									return feedBack.getCustomer().getImageUrl();
								}

								@Override
								public int getId() {

									return feedBack.getCustomer().getId();
								}

								@Override
								public String getEmail() {

									return feedBack.getCustomer().getEmail();
								}
							};

							return cData;
						}

						@Override
						public String getComment() {

							return feedBack.getComment();
						}

					};
					feedBackList.add(fData);
				}

				return feedBackList;

			}

		};
		return util;
	}

}
