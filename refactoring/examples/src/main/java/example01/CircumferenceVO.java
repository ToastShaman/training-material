package example01;

public class CircumferenceVO {

    private Double radius;
    private Double circumference;

    /**
     * @param circumference
     */
    public void setCircumference(Double circumference) {
        this.circumference = circumference;
    }

    /**
     * @param radius
     */
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * @return Returns the circumference
     */
    public Double getCircumference() {
        return circumference;
    }

    /**
     * @return Returns the radius
     */
    public Double getRadius() {
        return radius;
    }
}
