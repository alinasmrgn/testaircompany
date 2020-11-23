package plane;

import model.ClassificationLevel;
import model.ExperimentalPlaneType;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalPlaneType experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String PlaneModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalPlaneType experimentalTypeType, ClassificationLevel classificationLevel) {
        super(PlaneModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypetype = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public ExperimentalPlaneType getExperimentalType(){
        return experimentalType;
    }

    @Override
    public boolean equals(Object plane) {
        if (this == plane) return true;
        if (!(plane instanceof ExperimentalPlane)) return false;
        if (!super.equals(plane)) return false;
        ExperimentalPlane currentPlane = (ExperimentalPlane) plane;
        return experimentalType == currentPlane.experimentalType
                && classificationLevel == currentPlane.classificationLevel;
    }

    @Override
    pupublic int hashCode() { return Objects.hash(super.hashCode(), experimentalType, classificationLevel); }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", experimentalType=" +  experimentalType +
                        "classificationLevel='" + classificationLevel +
                        '}');
    }
}
