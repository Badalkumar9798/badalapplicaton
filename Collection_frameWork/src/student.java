public class student implements Comparable<student> {

    public int age;
    public String name;
    public int weight;

    public student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // compareTo method
    @Override
    public int compareTo(student that) {

        // sort by age
        if(this.age ==that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }

    // print object properly
    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}