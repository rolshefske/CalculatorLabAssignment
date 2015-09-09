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
public class TriangleCalculator {
    private double doubleDataTypeArea;
    private String area;

    public String getArea(String base, String height)
    {
        double convertedBase = Double.parseDouble(base);
        double convertedHeight = Double.parseDouble(height);
        
        this.doubleDataTypeArea = (convertedBase * convertedHeight) / 2;
        this.area = String.valueOf(this.doubleDataTypeArea);
        return area;
    }    
}
