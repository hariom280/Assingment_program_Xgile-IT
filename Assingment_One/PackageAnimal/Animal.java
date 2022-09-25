package PackageAnimal; //Created package with PackageAnimal

public class Animal {
    private String breedName;
    public int ear = 2;

    public void setName(String breedName){ //Created public Method setName
        this.breedName=breedName;
    }
    public String getName(){ //Created public Method getName
        return this.breedName;
    }

}
