package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrainingPrograms implements SuperEntity{
    @Id
    private String programId;
    private String programName;
    private String duration;
    private String fee;

    public TrainingPrograms() {

    }

    public TrainingPrograms(String programId, String programName, String duration, String fee) {
        this.setProgramId(programId);
        this.setProgramName(programName);
        this.setDuration(duration);
        this.setFee(fee);
    }


    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "TrainingPrograms{" +
                "programId='" + programId + '\'' +
                ", programName='" + programName + '\'' +
                ", duration='" + duration + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }
}
