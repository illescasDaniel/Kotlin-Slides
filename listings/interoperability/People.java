import org.jetbrains.annotations.NotNull;
import java.util.List;

public class People {

	private final List<Person> list;

	public List<Person> getList() {
		return this.list;
	}

	People(@NotNull List<Person> people) {
		this.list = people;
		this.list.get(0).getName();
	}
}
