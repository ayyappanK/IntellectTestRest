package IntellectTest.RestApplication.dao;

 

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import IntellectTest.RestApplication.model.UserProfile;

public class UserProfileDAO {

	private static final Map<String, UserProfile> empMap = new HashMap<String, UserProfile>();


	static{
		
		initEmps();
	}
	
	private static void initEmps() {
UserProfile emp1 = new UserProfile("E01", "Smith", "Clerk", null, 123, null, false);
UserProfile emp2 = new UserProfile("E02", "Allen", "Salesman", null, 560, null, false);
UserProfile emp3 = new UserProfile("E03", "Jones", "Manager", null, 900, null, false);

empMap.put(emp1.getEmpNo(), emp1);
empMap.put(emp2.getEmpNo(), emp2);
empMap.put(emp3.getEmpNo(), emp3);
    }

	public static UserProfile getUserProfile(String empNo) {
return empMap.get(empNo);
   }

	public static UserProfile addUserProfile(UserProfile emp) {
		empMap.put(emp.getEmpNo(), emp);
return emp;
    }

	public static UserProfile updateUserProfile(UserProfile emp) {
empMap.put(emp.getEmpNo(), emp);
return emp;
    }

	public static void deleteUserProfile(String empNo) {
empMap.remove(empNo);
    }

	public static List<UserProfile> getAllUserProfiles() {
Collection<UserProfile> c = empMap.values();
List<UserProfile> list = new ArrayList<UserProfile>();
list.addAll(c);
return list;
    }

	List<UserProfile> list;
}