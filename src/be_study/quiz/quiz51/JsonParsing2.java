package be_study.quiz.quiz51;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParsing2 {

	public static void main(String[] args) {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			JSONArray employees = (JSONArray)jsonObj.get("employees");
			JSONObject company = (JSONObject)jsonObj.get("company");
			JSONArray projects = (JSONArray)jsonObj.get("projects");
			
			System.out.println("-- 직원목록 --");
			for(int i=0; i<employees.size(); i++) {
				JSONObject employee = (JSONObject) employees.get(i);
				EmployeeDTO employeeDTO = new EmployeeDTO();
				
				employeeDTO.setId(((Number)employee.get("id")).intValue());
				employeeDTO.setName(employee.get("name").toString());
				employeeDTO.setPosition(employee.get("position").toString());
				employeeDTO.setSalary(((Number)employee.get("salary")).intValue());
				JSONArray skills = (JSONArray)employee.get("skills");
				for(int j=0; j<skills.size(); j++)
					employeeDTO.addSkill(skills.get(j).toString());
				
				System.out.println(employeeDTO);
			}
			System.out.println("------------------------------------------");
			
			System.out.println("-- 회사 --");
			System.out.println("이름 : " + company.get("name").toString());
			System.out.println("주소 : " + company.get("address").toString());
			System.out.println("설립일 : " + company.get("established").toString());
			JSONArray departments = (JSONArray)company.get("departments");
			System.out.println("회사 부서 목록 : ");
			for(int i=0; i<departments.size(); i++) {
				JSONObject department = (JSONObject)departments.get(i);
				DepartmentDTO departmentDTO = new DepartmentDTO();
				
				departmentDTO.setName(department.get("name").toString());
				JSONArray deptEmployees = (JSONArray)department.get("employees");
				for(int j=0; j<deptEmployees.size(); j++)
					departmentDTO.addEmployee(((Number)deptEmployees.get(j)).intValue());
				
				System.out.println(departmentDTO);
			}
			
			System.out.println("------------------------------------------");
			
			System.out.println("-- 프로젝트 목록 --");
			for(int i=0; i<projects.size(); i++) {
				JSONObject project = (JSONObject)projects.get(i);
				ProjectDTO projectDTO = new ProjectDTO();
				
				projectDTO.setTitle(project.get("title").toString());
				projectDTO.setBudget(((Number)project.get("budget")).intValue());
				JSONArray team = (JSONArray)project.get("team");
				for(int j=0; j<team.size(); j++)
					projectDTO.addTeam(((Number)team.get(j)).intValue());
				
				System.out.println(projectDTO);
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static String jsonString = "{"
			+ "\"employees\": ["
			+ "{"
			+ "\"id\": 1,"
			+ "\"name\": \"홍길동\","
			+ "\"position\": \"개발자\","
			+ "\"salary\": 50000,"
			+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
			+ "},"
			+ "{"
			+ "\"id\": 2,"
			+ "\"name\": \"김철수\","
			+ "\"position\": \"디자이너\","
			+ "\"salary\": 40000,"
			+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
			+ "}"
			+ "],"
			+ "\"company\": {"
			+ "\"name\": \"주식회사 ABC\","
			+ "\"address\": \"서울시 강남구\","
			+ "\"established\": \"1990-01-01\","
			+ "\"departments\": ["
			+ "{"
			+ "\"name\": \"개발부\","
			+ "\"employees\": [1, 3, 5]"
			+ "},"
			+ "{"
			+ "\"name\": \"디자인부\","
			+ "\"employees\": [2, 4]"
			+ "}"
			+ "]"
			+ "},"
			+ "\"projects\": ["
			+ "{"
			+ "\"title\": \"사내 시스템 개발\","
			+ "\"budget\": 100000,"
			+ "\"team\": [1, 3]"
			+ "},"
			+ "{"
			+ "\"title\": \"웹 디자인 프로젝트\","
			+ "\"budget\": 80000,"
			+ "\"team\": [2, 4]"
			+ "}"
			+ "]"
			+ "}";
}
