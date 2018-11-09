	public final void setAge(int var1) {
		this.age = var1;
	}

	public Person(@NotNull String name, int age) {
		super();
		Intrinsics.checkParameterIsNotNull(name, "name");
		this.name = name;
		this.age = age;
	}

	@NotNull
	public final String component1() {
		return this.name;
	}

	public final int component2() {
		return this.age;
	}

	@NotNull
	public final Person copy(@NotNull String name, int age) {
		Intrinsics.checkParameterIsNotNull(name, "name");
		return new Person(name, age);
	}
