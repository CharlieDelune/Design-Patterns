
public class Actor extends PerformanceArtist {
	public Actor(){
		performanceBehavior = new ActPerformance();
		egoBehavior = new HugeEgo();
	}
	
	public void setEgo(EgoBehavior eb){
		this.egoBehavior = eb;
	}

}
