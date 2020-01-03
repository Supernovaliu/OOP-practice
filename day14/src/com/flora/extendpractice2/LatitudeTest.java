package com.flora.extendpractice2;

public class LatitudeTest {
 public double latitude;
 public double longititude;
 public LatitudeTest(double lat,double lon) {
	 this.latitude = lat;
	 this.longititude = lon;
 }
 public double distance(LatitudeTest other) {
	 return getDist(this.latitude,this.longititude,other.latitude,other.longititude);
 }
private double getDist(double latitude2, double longititude2, double latitude3, double longititude3) {
	// TODO Auto-generated method stub
	return 0;
}
}
