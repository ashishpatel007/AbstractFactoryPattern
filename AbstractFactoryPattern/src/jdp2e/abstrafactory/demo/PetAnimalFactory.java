package jdp2e.abstrafactory.demo;
//Concrete Factory - Pet Animal Factory
class PetAnimalFactory implements AnimalFactory
{
    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger(String color) {

        return new PetTiger(color);
    }
}
