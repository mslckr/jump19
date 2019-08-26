package animalsExample;

public class Animal {
	private String name;
	private int weight;
	private String species;
	//this version of the example differs from the video
	
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {return name;}
	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight must be greater than 0");
		}
	}
	public int getWeight() {return weight;}
	//species is in place of sound
	public void setSpec(String newSpec) {species = newSpec;}
	public String getSpec() {return species;}
	
}
