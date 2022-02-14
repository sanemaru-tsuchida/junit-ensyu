package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class FrameworksTest {

	@DisplayName("2-6")
	@Test
	void test() {

		
		ApplicationServer applicationServerTomcat = ApplicationServer.Tomcat;
		ApplicationServer applicationServerGlassFish = ApplicationServer.GlassFish;
		ApplicationServer applicationServerJBoss = ApplicationServer.JBoss;
		
		Database databaseBD2 = Database.DB2;
		Database databaseMySQL = Database.MySQL;
		Database databaseOracle = Database.Oracle;
		Database databasePostSQL = Database.PostgreSQL;
	
		assertEquals(true, Frameworks.isSupport(applicationServerGlassFish, databaseOracle));
		assertEquals(true, Frameworks.isSupport(applicationServerGlassFish, databaseBD2));
		assertEquals(true, Frameworks.isSupport(applicationServerGlassFish, databasePostSQL));
		assertEquals(true, Frameworks.isSupport(applicationServerGlassFish, databaseMySQL));
		assertEquals(false, Frameworks.isSupport(applicationServerJBoss, databaseOracle));
		assertEquals(true, Frameworks.isSupport(applicationServerJBoss, databaseBD2));
		assertEquals(true, Frameworks.isSupport(applicationServerJBoss, databasePostSQL));
		assertEquals(false, Frameworks.isSupport(applicationServerJBoss, databaseMySQL));
		assertEquals(false, Frameworks.isSupport(applicationServerTomcat, databaseOracle));
		assertEquals(false, Frameworks.isSupport(applicationServerTomcat, databaseBD2));
		assertEquals(false, Frameworks.isSupport(applicationServerTomcat, databaseOracle));
		assertEquals(true, Frameworks.isSupport(applicationServerTomcat, databaseMySQL));

		

		
		
	}

	

	
}
