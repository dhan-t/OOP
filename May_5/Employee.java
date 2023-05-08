package act4.ClassPack;

public class Employee {
    private String name;
    private String jobTitle;
    private int salary;
    private int attendance;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void printer() {
        System.out.println("Your name is: " + name + ". Your position is: " + jobTitle + ". You salary is: "
                + ((attendance) * (salary)));
    }
}
