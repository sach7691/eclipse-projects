package com.ab.repositories;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;

import com.ab.models.StockPrice;

@Repository
public class StockPriceReopsitory {
	
	
	public List<StockPrice> readPriceFromFile(String fileName) {
		
		Resource resource = new ClassPathResource(fileName);
		
		StockPrice st = null;
		
		List<StockPrice> list = new ArrayList<>();;
		
		try {
			
	        InputStream inputStream = resource.getInputStream();  
	    
	        byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
	        
	        String data = new String(bdata, StandardCharsets.UTF_8); //byte array converted to String in java
	        
		    Scanner scanner = new Scanner(data);
		    
		    scanner.nextLine();
		    	    
		    while (scanner.hasNextLine()) {			   
		    	
		    String line = scanner.nextLine();
		    
		    String[] attributes = line.split(",");        

	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	        Date parsedDate = dateFormat.parse(attributes[0]);
	        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
	        
	        st = new StockPrice(timestamp,Double.valueOf(attributes[1]),Double.valueOf(attributes[2]),Double.valueOf(attributes[3]),Double.valueOf(attributes[4]));	
	        
		    list.add(st);

		    }
		    
		    scanner.close();
		    
		    } catch (FileNotFoundException e) {
		    System.out.println(e);
		    } catch (IOException e) {
		    System.out.println(e);
		    }catch (ParseException e) {
			System.out.println(e);
		    }       
	        	        
	 		return list;
				
	}
	
	
	public List<StockPrice> readPriceToDate(String fileName){
	
		   StockPriceReopsitory sr = new StockPriceReopsitory();
		   
		   List<StockPrice> sp = sr.readPriceFromFile(fileName);
		  
		   List<StockPrice> compared = new ArrayList<>();
		   
		    Calendar c = Calendar.getInstance();
		   
		    int utcOffset = c.get(Calendar.ZONE_OFFSET) + c.get(Calendar.DST_OFFSET); 
		   
		    Long utcMilliseconds = c.getTimeInMillis() + utcOffset;
		    
	        Timestamp timestamp = new Timestamp(utcMilliseconds); //utc time into timestamp
		    
		   for(int i =0; i< sp.size(); i++) {
		 
		   int x = sp.get(i).getDateTime().compareTo(timestamp);
		  
		   if(x<0) {
			  
			  compared.add(new StockPrice(sp.get(i).getDateTime(),sp.get(i).getOpen(),sp.get(i).getHigh(),sp.get(i).getLow(),sp.get(i).getClose()));
			
		           }
		  
		   }
		   
		   
		  
		return compared;
	}
	
	
	
}	


