import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.subhash.supplier.Supplier;

public class JDBCConnection {
	
	public static void main(String args[]){
	
	Supplier s = new Supplier();
	List<Supplier> suppliers = new ArrayList<Supplier>();
	jdbc(suppliers);
	for(Supplier sup : suppliers)
		System.out.println(sup);
		/*
		 * int[] a = new int[3]; a[0] = 2; a[1] = 2; a[2] =1;
		 * System.out.println(findSecondLargest(a));
		 */
	}
	 public static void jdbc(List<Supplier> suppliers) {
		 Connection con;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			//"jdbc:mariadb://localhost:3306/DB?user=root&password=password"
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/subhash?user=root&password=password");
			PreparedStatement st = con.prepareStatement("Select * from suppliers");
			ResultSet rs = st.executeQuery();
			Supplier s;
			 SortedSet<Supplier> s1 = new TreeSet<>(
				        Comparator.comparing(Supplier::getPhone));
			while(rs.next()) {
				s = new Supplier();
				s.setSupplierId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setPhone(rs.getString(3));
				suppliers.add(s);
				s1.add(s);
			}
			for(Supplier s2 : s1) {
				System.out.println("sdioofih"+s2);
			}
			con.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	 }
	 public static int findSecondLargest(int[] array) {
			Arrays.sort(array);
			int maxElement = array[array.length-1];
			if(array.length == 1) {
				return -1;
			}
			for(int i = array.length-2; i >= 0;i--) {
				if(maxElement != array[i]) {
					return array[i];
				}
			}
			return -1;
			
		}
}
