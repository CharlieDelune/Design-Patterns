
public class Singer extends PerformanceArtist {
	public Singer(){
		performanceBehavior = new SingPerformance();
		egoBehavior = new TinyEgo();
	}
	
	public void setEgo(EgoBehavior eb){
		this.egoBehavior = eb;
	}

}
