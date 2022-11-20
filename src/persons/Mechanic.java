package persons;

import transport.Transport;

import java.util.Objects;

public class Mechanic {

    private final String fullName;
    private final String company;
    private final boolean fixesBuses;
    private final boolean fixesTrucks;
    private final boolean fixesCars;


    public Mechanic(String fullName, String company, boolean fixesBuses, boolean fixesTrucks, boolean fixesCars) {
        if (fullName == null ||  fullName.isBlank() ||
                company == null || company.isBlank() ) {
            throw new IllegalArgumentException("Пожалуйста, заполните все поля");
        }
        this.fullName = fullName;
        this.company = company;
        this.fixesBuses = fixesBuses;
        this.fixesTrucks = fixesTrucks;
        this.fixesCars = fixesCars;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean isFixesBuses() {
        return fixesBuses;
    }

    public boolean isFixesTrucks() {
        return fixesTrucks;
    }

    public boolean isFixesCars() {
        return fixesCars;
    }

    public void service (Transport transport) {

    }

    public void fixTransport (Transport transport) {

    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return fullName.equals(mechanic.fullName) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }
}
