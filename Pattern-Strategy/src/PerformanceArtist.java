
public abstract class PerformanceArtist {
	PerformanceBehavior performanceBehavior;
	EgoBehavior egoBehavior;
	
	public PerformanceArtist(){
	}
	
	public void showPerformance(){
		performanceBehavior.perform();
	}
	
	public void showEgo(){
		egoBehavior.show();
	}
	
	public void fireManager(){
		System.out.println("You're fired!");
	}

}
