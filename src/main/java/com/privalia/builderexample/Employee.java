package com.privalia.builderexample;

public class Employee {
	private Long id;
	private String name;
	private int gender;
	private String address;
	private String hobby;

	/**
	 * Empty Private Constructor.
	 */
	private Employee() {
	}

	public static class EmployeeBuilder {
		private Long id;
		private String name;
		private int gender;
		private String address;
		private String hobby;

		public EmployeeBuilder(Long id, String name) {
			this.id = id;
			this.name = name;
		}

		/**
		 * @param gender
		 *            the gender to set
		 */
		public void setGender(int gender) {
			this.gender = gender;
		}

		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @param hobby
		 *            the hobby to set
		 */
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public Employee build() {
			Employee employee = new Employee();
			employee.id = id;
			employee.name = name;
			employee.gender = gender;
			employee.address = address;
			employee.hobby = hobby;
			return employee;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + (gender == 1 ? "Male" : "Female") + ", address="
				+ address + ", hobby=" + hobby + "]";
	}

}
