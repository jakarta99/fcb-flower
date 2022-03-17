package tw.com.fcb.flower.core.commons.http;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RocDateConverterTest {
	
	@Autowired
	RocDateConverter converter;

	@Test
	void testConvert() {
		
		String date1 = "19740928";
		
		String date2 = "0630928";
		
		String date3 = "630928";
		
		
		LocalDate localDate1 = converter.convert(date1);
		LocalDate localDate2 = converter.convert(date2);
		LocalDate localDate3 = converter.convert(date3);
		
		assertEquals("1974-09-28", localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		assertEquals("1974-09-28", localDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		assertEquals("1974-09-28", localDate3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
	}

}
