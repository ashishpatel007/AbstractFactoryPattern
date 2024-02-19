package jdp2e.abstrafactory.demo;

class PetTiger implements Tiger {

    public PetTiger(String color){
        System.out.println("A pet tiger with " + color + " is created.");
    }

    @Override
    public void speak() {
        System.out.println("Pet Tiger says softly: Halum.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet Tigers play in the animal circus.\n");

    }
}
