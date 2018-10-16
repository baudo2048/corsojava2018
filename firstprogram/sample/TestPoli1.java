package firstprogram.sample;

import firstprogram.math.Polygon;

public class TestPoli1 {
	Polygon p;
	
	public TestPoli1() {
		this.p = new Polygon();
	}
	
	public void setP(Polygon p) {
		this.p = p;
	}
	
	public Polygon getP() {
		return this.p;
	}
	
	public void esegui() {
		p.metodoComune();
	}
}
