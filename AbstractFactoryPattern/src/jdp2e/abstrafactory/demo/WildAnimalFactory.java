package jdp2e.abstrafactory.demo;
//Concrete Factory-Wild Animal Factory
class WildAnimalFactory implements AnimalFactory
{
    @Override
    public Dog createDog() {

        return new WildDog();
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }
}
