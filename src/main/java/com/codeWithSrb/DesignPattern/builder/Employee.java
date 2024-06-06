package com.codeWithSrb.DesignPattern.builder;

import java.util.Objects;

public class Employee {

    private final int employeeId;
    private final String employeeName;
    private final int employeeAge;
    private final int numberOfChildren;
    private final String favouriteMovie;

    public Employee(EmployeeBuilder builder) {
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.employeeAge = builder.employeeAge;
        this.numberOfChildren = builder.numberOfChildren;
        this.favouriteMovie = builder.favouriteMovie;
    }

    public static EmployeeBuilder newBuilder() {
        return new EmployeeBuilder();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && employeeAge == employee.employeeAge && numberOfChildren == employee.numberOfChildren && Objects.equals(employeeName, employee.employeeName) && Objects.equals(favouriteMovie, employee.favouriteMovie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, employeeAge, numberOfChildren, favouriteMovie);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", numberOfChildren=" + numberOfChildren +
                ", favouriteMovie='" + favouriteMovie + '\'' +
                '}';
    }

    public static class EmployeeBuilder {

        private int employeeId;
        private String employeeName;
        private int employeeAge;
        private int numberOfChildren;
        private String favouriteMovie;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder withName(String name) {
            this.employeeName = name;
            return this;
        }

        public EmployeeBuilder withAge(int age) {
            this.employeeAge = age;
            return this;
        }

        public EmployeeBuilder withNumberOfChildren(int numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }

        public EmployeeBuilder withFavouriteMovie(String movie) {
            this.favouriteMovie = movie;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }
}
