package database.classesForQueries;

import java.util.Objects;

public class PrintProjectPrices {
    private int projectId;
    private int price;

    public PrintProjectPrices(int projectId, int price) {
        this.projectId = projectId;
        this.price = price;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PrintProjectPrices {" +
                "projectId=" + projectId +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintProjectPrices that = (PrintProjectPrices) o;
        return projectId == that.projectId && price == that.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, price);
    }
}
