package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.h2.tools.Server;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.example.demo.respository")
public class H2Application {

	public static void main(String[] args) {
		startH2();
	}

	private static void startH2() {
		try {
			Server.createTcpServer("-tcpAllowOthers").start();
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/stackoverflow", "sa", "");
			System.out.println(
					"Connection Established: " + conn.getMetaData().getDatabaseProductName() + "/" + conn.getCatalog());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
