package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.ProductCategory;

public class ProductCategoryDAO {
	// Спрятать
		private static final String URL = "jdbc:postgresql://localhost:5432/onlinestore";
		private static final String USERNAME = "andrewsha";
		private static final String PASSWORD = "07112000";

		private static Connection connection;

		static {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public ArrayList<ProductCategory> getProductCategories() {
			ArrayList<ProductCategory> categories = new ArrayList<ProductCategory>();
			try {
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery("SELECT * FROM productcategories");
				
				while(result.next()) {
					ProductCategory category = new ProductCategory();
					category.setId(result.getInt("id"));
					category.setName(result.getString("name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return categories;
		}
}
