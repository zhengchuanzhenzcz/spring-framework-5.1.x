import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 郑传振
 * @Date: 2020/4/22 12:08
 * @Description:
 */
@Configuration
public class Main {

	@Bean("person")
	public Person person() {
		return new Person("Hello");
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		System.out.println((Person) context.getBean("person"));
	}

}

class Person {
	String name;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
	}
}
