package com.bjtu.implement;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bjtu.dao.GenericDaoSupport;
import com.bjtu.entity.Address;
import com.bjtu.entity.Category;
import com.bjtu.entity.Feature;
import com.bjtu.entity.Item;
import com.bjtu.service.AddressService;
import com.bjtu.service.FeatureService;
import com.bjtu.service.ItemService;

/**
 * @author mac
 *
 */
@Component("addressService")
public class AddressServiceImpl implements AddressService{

	@Autowired
	private GenericDaoSupport genericDaoSupport;

	public List<Address> listAllAddress() {
		String querySentence = "FROM Address address";
		return genericDaoSupport.searchForList(querySentence, new HashMap<String, Object>());
	}


	
}
