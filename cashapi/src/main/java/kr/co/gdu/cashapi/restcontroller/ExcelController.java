package kr.co.gdu.cashapi.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcelController {
	
	@GetMapping( path = "/cashListExcel", produces = "application/vnd.ms-excel")
	public String excelDownload() {
		return "cashListExcel";
	}
}
