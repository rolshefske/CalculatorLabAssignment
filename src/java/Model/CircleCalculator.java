/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lucifur
 */
public class CircleCalculator {
    
    private double doubleDataTypeArea;
    private String area;

    public String getArea(String radius)
    {
        double convertedRadius = Double.parseDouble(radius);
        
        this.doubleDataTypeArea = Math.pow(convertedRadius, 2) * Math.PI;
        this.area = String.valueOf(this.doubleDataTypeArea);
        return area;
    }
}
