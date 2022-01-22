package com.company.builder;

public class Employee {

    private String name;
    private String profession;
    private int level;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.level = builder.level;
        this.profession = builder.profession;
    }

    public static class Builder {

        private String name;
        private String profession;
        private int level;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setProfession(String profession) {

            this.profession = profession;
            return this;
        }

        public Builder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", level=" + level +
                '}';
    }
}
