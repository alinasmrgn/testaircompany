import plane.ExperimentalPlane;
import model.MilitaryPlaneType;
import plane.MilitaryPlane;
import plane.PassengerPlane;
import plane.Plane;

import java.util.*;


public class Airport {
    private List<? extends Plane> allPlanesList;

    public Airport(List<? extends Plane> planes) {
        this.allPlanesList = planes;
    }

    public List<PassengerPlane> getPassengerPlaneList() {
        List<? extends Plane> allPlanesList = this.allPlanesList;
        List<PassengerPlane> passengerPlaneList = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof PassengerPlane) {
                passengerPlaneList.add((PassengerPlane) plane);}
        }
        return passengerPlaneList;
    }

    public List<MilitaryPlane> getMilitaryPlanesList() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlaneList();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanesList = new ArrayList<>();
    List<MilitaryPlane> militaryPlanesList = getMilitaryPlanesList();
         for (int i = 0; i < militaryPlanesList.size(); i++) {
             if (militaryPlanesList.get(i).getMilitaryPlaneType == MilitaryPlaneType.TRANSPORT) {
                 transportMilitaryPlanesList.add(militaryPlanesList.get(i));
             }
        }
        return transportMilitaryPlanesList;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanesList = getMilitaryPlanesList();
        for (int i = 0; i < militaryPlanesList.size(); i++) {
            if (militaryPlanesList.get(i).getMilitaryPlaneType == MilitaryPlaneType.BOMBER) {
                bombertMilitaryPlanesList.add(militaryPlanesList.get(i));
            }
        }
        return bomberMilitaryPlanesList;
    }

    public List<MilitaryPlane> getFighterMilitaryPlanes() {
        List<MilitaryPlane> fighterMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanesList = getMilitaryPlanesList();
        for (int i = 0; i < militaryPlanesList.size(); i++) {
            if (militaryPlanesList.get(i).getMilitaryPlaneType == MilitaryPlaneType.FIGHTER) {
                fighterMilitaryPlanesList.add(militaryPlanesList.get(i));
            }
        }
        returnfighterMilitaryPlanesList;
    }

    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanesList = new ArrayList<>();
        for (Plane plane : allPlanesList) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlaneslist.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanesList;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(allPlanesList, new Comparator<Plane>() {
            public int compare(Plane firstPlane, Plane secondPlane) {
                return firstPlane.getMaxFlightDistance() -  secondPlane.getMaxFlightDistance();
            }
        });
        return this;
    }


    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane firstPlane, Plane secondPlane) {
                return firstPlane.getMaxSpeed() -  secondPlane.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane firstPlane, Plane secondPlane) {
                return firstPlane.getMaxLoadCapacity -  secondPlane.getMaxLoadCapacity;
            }
        });
        return this;
    }

    public List<? extends Plane> getAllPlanesList() {
        return allPlanesList;
    }


    @Override
    public String toString() {
        return "Airport{" +
                "allPlaneList=" + allPlanesList.toString() +
                '}';
    }

}
