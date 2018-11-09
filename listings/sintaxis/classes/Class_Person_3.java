	@NotNull
	public static Person copy$default(Person var0, String var1, int var2, int var3, Object var4) {
		if ((var3 & 1) != 0) {
			var1 = var0.name;
		}
		if ((var3 & 2) != 0) {
			var2 = var0.age;
		}
		return var0.copy(var1, var2);
	}

	@NotNull
	public String toString() {
		return "Person(name=" + this.name + ", age=" + this.age + ")";
	}

	public int hashCode() {
		return (this.name != null ? this.name.hashCode() : 0) * 31 + this.age;
	}
