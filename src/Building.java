/*
The Building class describes the building using attributes

created by hteverett on 1/25/2017


 */
public class Building {

    private String campus;

    private String name;

    private Coordinate coordinate;

//    private Double latitude;
//
//    private Double longitude;

    private String imageName;

    private String buildingCode;

    // the constructor that takes in all attributes and sets them, the default constructor has been removed

    public Building(String campus, String name, Coordinate coordinate, String imageName, String buildingCode) {
        this.campus = campus;
        this.name = name;
        this.coordinate = coordinate;
        this.imageName = imageName;
        this.buildingCode = buildingCode;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) throws InvalidLatitudeException, InvalidLongitudeException{
        try {
            setCoordinate(coordinate);
        } catch (InvalidLatitudeException e) {
            throw e;
        } catch (InvalidLongitudeException e) {
            throw e;
        }
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }



    // toString is overridden and the string has been modified and formatted
    @Override
    public String toString() {

        return "Campus: " + campus + "\n" +
                "Name: " + name + "\n" +
                "Coordinate: " + "\n" +
                coordinate.toString() + "\n" +
                "Image Name: " + imageName + "\n" +
                "Building Code: " + buildingCode + "\n" +
                "------------------------------" + "\n";

    }
}