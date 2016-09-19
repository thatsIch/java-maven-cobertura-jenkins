import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PersonTest {
	@Test
	public void getName() throws Exception {
		final String name = "Peter";
		final int age = 15;
		final Person person = new Person(name, age);

		Assertions
			.assertThat(person.getName())
			.as("The name getter of a person should result in the same name.")
			.isEqualTo(name);
	}

	@Test
	public void getAge() throws Exception {
		final String name = "Peter";
		final int age = 15;
		final Person person = new Person(name, age);

		Assertions
			.assertThat(person.getAge())
			.as("The age getter of a person should result in the same age.")
			.isEqualTo(age);
	}

}