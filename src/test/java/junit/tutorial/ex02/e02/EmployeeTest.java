package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;


import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	private Employee employee = new Employee();

	@Test
	@DisplayName("2-2")
	void index() {

		try {
			//** これでファイルを渡す。クローズが相手側で設定されているので.loadを呼ぶのは一回だけ。そうしないとエラーが出る。*/
			InputStream fileStream = new FileInputStream(
					"C:\\env\\springworkspace\\junit-ensyu\\src\\test\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");
			//**リスト作成 別にやらなくていい*/
			List<Employee> empList = new ArrayList<>();
			employee.setFirstName("Ichiro");
			employee.setLastName("Tanaka");
			employee.setEmail("ichiro@example.com");
			empList.add(employee);
			 List<Employee> employees = Employee.load(fileStream);


			assertAll(() -> {
				assertEquals(empList.get(0).getFirstName(), employees.get(0).getFirstName(), "名前チェック");
			}, () -> {
				assertEquals(empList.get(0).getLastName(), employees.get(0).getLastName(), "苗字チェック");
			}, () -> {
				assertEquals(empList.get(0).getEmail(),employees.get(0).getEmail(), "メールアドレスチェック");
			});
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}


