package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.Entity.BillingEntity;
import com.Repository.TblBillingRepo;
import com.Service.BillingService;

@Component
public class BillingRENScheduler 

{
	@Autowired
	TblBillingRepo billingRepo;
	
	@Autowired
	BillingService billingService;

	
	@Scheduled(fixedDelay  = 1000L)
	public void billingThread2() {
		
		try {
			String status="1";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 1::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread3() {
		
		try {
			String status="2";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				
				System.out.print("Thread For status 2:::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread4() {
		
		try {
			
			String status="3";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 3:::");
				billingService.hitBilling(entity,status);
				}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread5() {
		
		try {
			
			String status="4";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
			
				System.out.print("Thread For status 4:::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread6() {
		
		try {
			String status="5";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				
				System.out.print("Thread For status 5::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread7() {
		
		try {
			String status="6";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				
				System.out.print("Thread For status 6::::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread8() {
		
		try {
			String status="7";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 7:::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread9() {
		
		try {
			String status="8";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {			
				System.out.print("Thread For status 8::::");
				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread10() {
		
		try {
			String status="9";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 9:::::");

				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

	@Scheduled(fixedDelay  = 1000L)
	public void billingThread11() {
		
		try {
			String status="10";
			String type = "REN";
			List<BillingEntity> entity = billingRepo.findByStatusAndType(status,type);
			if(entity.size()!=0) {
				System.out.print("Thread For status 10::::");

				billingService.hitBilling(entity,status);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}

	}

}
