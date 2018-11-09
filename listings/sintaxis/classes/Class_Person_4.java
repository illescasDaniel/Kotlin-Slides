	public boolean equals(@Nullable Object var1) {
		if (this != var1) {
			if (var1 instanceof Person) {
				Person var2 = (Person)var1;
				if (Intrinsics.areEqual(this.name, var2.name) && this.age == var2.age) {
					return true;
				}
			}
			return false;
		} else {
			return true;
		}
	}
}
