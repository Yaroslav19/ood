package dp.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Builder {
    public static void main(String[] args) {
        Person p = new PersonBuilderImpl()
                .setId(23)
                .setSalary(4000).build();
        System.out.println(p.toString());
    }

    @Getter
    @Setter
    @ToString
    static class Person {
        private Integer id;
        private String name;
        private Integer salary;
    }

    interface PersonBuilder {
        PersonBuilder setId(Integer id);
        PersonBuilder setName(String name);
        PersonBuilder setSalary(Integer salary);
        Person build();
    }

    static class PersonBuilderImpl implements PersonBuilder {
        Person person = new Person();

        @Override
        public PersonBuilder setId(Integer id) {
            person.setId(id);
            return this;
        }

        @Override
        public PersonBuilder setName(String name) {
            person.setName(name);
            return this;
        }

        @Override
        public PersonBuilder setSalary(Integer salary) {
            person.setSalary(salary);
            return this;
        }

        @Override
        public Person build() {
            return person;
        }
    }
}
