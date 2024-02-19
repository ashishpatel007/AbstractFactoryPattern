package jdp2e.abstrafactory.demo;
// Types of Tigers-wild tigers and pet tigers
class WildTiger implements Tiger
{

    public WildTiger(String color){
        System.out.println("A wild tiger with " + color + " is created.");
    }
    @Override
    public void speak() {
        System.out.println("Wild Tiger says loudly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild Tigers prefer hunting in jungles.\n");

    }
}
