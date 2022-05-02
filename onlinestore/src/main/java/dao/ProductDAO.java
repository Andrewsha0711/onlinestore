package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Product;

public class ProductDAO {
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
	
	// Получение товаров нужной страницы
	public ArrayList<Product> getProducts(int page, int limit) {
		// limit - количество товаров на одной странице
		// Нумерация страниц товаров 1,2,3...
		int offset = (page-1)*limit;
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"SELECT * FROM public.products ORDER BY id ASC LIMIT ? OFFSET ?;"
					);
			preparedStatement.setInt(1, limit);
			preparedStatement.setInt(2, offset);
			
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next()) {
				Product product = new Product();
				product.setId(result.getString("id"));
				product.setName(result.getString("name"));
				product.setShortDescription(result.getString("shortdescription"));
				product.setActualPrice(result.getDouble("price"));
				product.setDiscount(result.getDouble("discount"));
				product.setImagePath(result.getString("imagepath"));
				
				products.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
}
