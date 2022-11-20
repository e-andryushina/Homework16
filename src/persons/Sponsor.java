package persons;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private final String sponsorshipSum;
    private final boolean physical;

    public Sponsor(String name, String sponsorshipSum, boolean physical) {
        if (name == null || name.isBlank() || sponsorshipSum == null
                || sponsorshipSum.isBlank()) {
            throw new IllegalArgumentException("Пожалуйста, заполните все поля");
        }
        this.name = name;
        this.sponsorshipSum = sponsorshipSum;
        this.physical = physical;
    }

    public String getName() {
        return name;
    }

    public String getSponsorshipSum() {
        return sponsorshipSum;
    }

    public boolean isPhysical() {
        return physical;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", sponsorshipSum='" + sponsorshipSum + '\'' +
                ", physical=" + physical +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return physical == sponsor.physical && name.equals(sponsor.name) && sponsorshipSum.equals(sponsor.sponsorshipSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sponsorshipSum, physical);
    }
}
