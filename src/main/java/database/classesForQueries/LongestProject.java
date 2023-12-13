package database.classesForQueries;

import java.time.LocalDate;
import java.util.Objects;

public class LongestProject {
    private int projectId;
    private int clientId;
    private LocalDate startDate;
    private LocalDate finishDate;
    private int monthDuration;

    public LongestProject(int projectId, int clientId, LocalDate startDate, LocalDate finishDate, int monthDuration) {
        this.projectId = projectId;
        this.clientId = clientId;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.monthDuration = monthDuration;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public int getMonthDuration() {
        return monthDuration;
    }

    public void setMonthDuration(int monthDuration) {
        this.monthDuration = monthDuration;
    }

    @Override
    public String toString() {
        return "LongestProject {" +
                "projectId=" + projectId +
                ", clientId=" + clientId +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", monthDuration=" + monthDuration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongestProject that = (LongestProject) o;
        return projectId == that.projectId && clientId == that.clientId && monthDuration == that.monthDuration && Objects.equals(startDate, that.startDate) && Objects.equals(finishDate, that.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, clientId, startDate, finishDate, monthDuration);
    }
}
