package topic4_7;

import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DBConnect conn = new DBConnect();
		
		try {
			PreparedStatement pstm = (PreparedStatement)conn.getConnection().prepareStatement("SELECT t.first_name FROM `teacher` t, `course` c, `schedule` s, `coursexschedule` cxs WHERE (t.reg_number = c.assigned_teacher) AND (c.id = cxs.id_course) AND (cxs.id_schedule = s.id) AND (t.reg_number = 100);");
		
			ResultSet res = pstm.executeQuery();
			res.next();
					
			String firstName = res.getString("first_name");
					
			pstm = (PreparedStatement)conn.getConnection().prepareStatement("SELECT t.last_name FROM `teacher` t, `course` c, `schedule` s, `coursexschedule` cxs WHERE (t.reg_number = c.assigned_teacher) AND (c.id = cxs.id_course) AND (cxs.id_schedule = s.id) AND (t.reg_number = 100);");
					
			res = pstm.executeQuery();
			res.next();
							
			String lastName = res.getString("last_name");
			
			pstm = (PreparedStatement)conn.getConnection().prepareStatement("SELECT c.name, s.day, s.time_start, s.time_end FROM `teacher` t, `course` c, `schedule` s, `coursexschedule` cxs WHERE (t.reg_number = c.assigned_teacher) AND (c.id = cxs.id_course) AND (cxs.id_schedule = s.id) AND (t.reg_number = 100);");
			
			res = pstm.executeQuery();
			
			System.out.println("Teacher: "+lastName+", "+firstName+"\nSchedule:");
			
			while (res.next()) {
				String str = "\t"+res.getString("day")+" "+res.getString("time_start")+" - "+res.getString("time_end")+": "+res.getString("name");
				System.out.println(str);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
