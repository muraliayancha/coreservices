package com.services.core.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUtil {

	@CrossOrigin("*")
	@GetMapping("/getallaccounts")
	public @ResponseBody List<String> getAccounts()
	{
		List<String> accounts = new ArrayList<String>();
		accounts.add("00000001");
		accounts.add("00000002");
		accounts.add("00000003");
		accounts.add("00000004");
		accounts.add("00000005");
		accounts.add("00000006");
		return accounts;
	}
	
}
