package pageObjects;

public class Employee {
    String name;
    String position;
    String office;

    public Employee(String name, String position, String office) {
        this.name = name;
        this.position = position;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
