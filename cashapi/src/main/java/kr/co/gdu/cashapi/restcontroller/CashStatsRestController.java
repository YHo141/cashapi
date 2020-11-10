package kr.co.gdu.cashapi.restcontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {
	@Autowired CashStatsService cashStatsService;
	
	
	@GetMapping("/totalOfMonthByYear")
	public Map<String, Object> totalOfMonthByYear(){
		Map<String, Object> map = cashStatsService.getTotalOfMonthByYear();
		return map;// @RestController때문에 객체처리를 JSON문자열로 변경
	}
	
	@GetMapping("/totalOutAndInByYear/{year}")
	public Map<String,Object> totalOutAndInByYear(@PathVariable(name = "year") int year){
		
		return cashStatsService.getTotalOutAndInByYear(year);
	}
}
