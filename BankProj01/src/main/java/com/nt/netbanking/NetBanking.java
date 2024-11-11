package com.nt.netbanking;

import java.util.Random;

public class NetBanking 
{

	public String createAcno(double AddharNo,double Mnumber) {
		
		return new Random().nextDouble(652892411)+"Account Is Created :";
	}
	
	public String TransferMoney(double srcAcNo,double destAcNo,double amt) {
		
		return amt +"Transfer from "+srcAcNo+" To "+destAcNo;
	}
	
}
