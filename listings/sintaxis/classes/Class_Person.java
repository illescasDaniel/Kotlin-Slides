import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
	/* ... */
)
public final class Person {
	@NotNull
	private final String name;
	private int age;

	public final void run(long distance) {
		String var3 = "Running " + distance + " m";
		System.out.println(var3);
	}

	@NotNull
	public final String getName() {
		return this.name;
	}

	public final int getAge() {
		return this.age;
	}

	