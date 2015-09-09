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
public class RectangleCalculator {

    private double doubleDataTypeArea;
    private String area;

    public String getArea(String length, String width)
    {
        double convertedLength = Double.parseDouble(length);
        double convertedWidth = Double.parseDouble(width);
        
        this.doubleDataTypeArea = convertedLength * convertedWidth;
        this.area = String.valueOf(this.doubleDataTypeArea);
        return area;
    }
}
