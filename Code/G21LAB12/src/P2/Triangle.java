package P2;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Power1stZ
 */
public class Triangle {

    private double s1, s2, s3;

    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        if (s1 + s2 > s3 && s1 + s3 > s2 && s3 + s2 > s1) {
            setS1(s1);
            setS2(s2);
            setS3(s3);
        } else {
            throw new IllegalTriangleException("Cannot be triangle");
        }
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

}
