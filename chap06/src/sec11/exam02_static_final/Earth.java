package sec11.exam02_static_final;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	// EARTH_SURFACE_AREA = 4*math.PI*(EARTH_RADIUS)^2; // 에러
	static { EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS; }	

}
