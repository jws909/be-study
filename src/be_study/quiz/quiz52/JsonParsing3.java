package be_study.quiz.quiz52;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParsing3 {
	
	public static void main(String[] args) {
		CustomerDTO customerDTO = null;
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			customerDTO = new CustomerDTO();
			
			customerDTO.setId(((Number)jsonObj.get("id")).intValue());
			customerDTO.setName(jsonObj.get("name").toString());
			
			JSONArray contacts = (JSONArray)jsonObj.get("contacts");
			for(int i=0; i<contacts.size(); i++) {
				Contact contact = new Contact();
				JSONObject jsContact = (JSONObject)contacts.get(i);
				
				contact.setType(jsContact.get("type").toString());
				contact.setValue(jsContact.get("value").toString());
				
				customerDTO.addContact(contact);
			}
			
			Address address = new Address();
			JSONObject jsAddress = (JSONObject)jsonObj.get("address");
			address.setStreet(jsAddress.get("street").toString());
			address.setCity(jsAddress.get("city").toString());
			address.setZipcode(jsAddress.get("zipcode").toString());
			
			customerDTO.setAddress(address);
			
			JSONArray orders = (JSONArray)jsonObj.get("orders");
			for(int i=0; i<orders.size(); i++) {
				Order order = new Order();
				JSONObject jsOrder = (JSONObject)orders.get(i);
				
				order.setOrderId(jsOrder.get("orderId").toString());
				order.setDate(jsOrder.get("date").toString());
				
				JSONArray items = (JSONArray)jsOrder.get("items");
				for(int j=0; j<items.size(); j++) {
					Item item = new Item();
					JSONObject jsItem = (JSONObject)items.get(j);
					
					item.setId(((Number)jsItem.get("id")).intValue());
					item.setName(jsItem.get("name").toString());
					item.setQuantity(((Number)jsItem.get("quantity")).intValue());
					
					order.addItems(item);
				}
				
				customerDTO.addOrder(order);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(customerDTO);
	}
	
	static String jsonString = "{"
			+ "\"id\": 1,"
			+ "\"name\": \"John Doe\","
			+ "\"contacts\": ["
			+ "{"
			+ "\"type\": \"email\","
			+ "\"value\": \"john.doe@example.com\""
			+ "},"
			+ "{"
			+ "\"type\": \"phone\","
			+ "\"value\": \"01023456789\""
			+ "}"
			+ "],"
			+ "\"address\": {"
			+ "\"street\": \"123 Main Street\","
			+ "\"city\": \"Seoul\","
			+ "\"zipcode\": \"12345\""
			+ "},"
			+ "\"orders\": ["
			+ "{"
			+ "\"orderId\": \"ORD-001\","
			+ "\"date\": \"2024-07-09\","
			+ "\"items\": ["
			+ "{"
			+ "\"id\": 1,"
			+ "\"name\": \"Smartphone\","
			+ "\"quantity\": 2"
			+ "},"
			+ "{"
			+ "\"id\": 2,"
			+ "\"name\": \"Laptop\","
			+ "\"quantity\": 1"
			+ "}"
			+ "]"
			+ "},"
			+ "{"
			+ "\"orderId\": \"ORD-002\","
			+ "\"date\": \"2024-07-10\","
			+ "\"items\": ["
			+ "{"
			+ "\"id\": 3,"
			+ "\"name\": \"Headphones\","
			+ "\"quantity\": 1"
			+ "}"
			+ "]"
			+ "}"
			+ "]"
			+ "}";
}
