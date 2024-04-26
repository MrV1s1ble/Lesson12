public class Person {

    private String name;
    private String jobTitle;
    private String palceOfWork;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPalceOfWork() {
        return palceOfWork;
    }

    public void setPalceOfWork(String palceOfWork) {
        this.palceOfWork = palceOfWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person() {
    }

    public Person(String name, String jobTitle, String palceOfWork, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.palceOfWork = palceOfWork;
        this.age = age;
        this.salary = salary;
    }
}
