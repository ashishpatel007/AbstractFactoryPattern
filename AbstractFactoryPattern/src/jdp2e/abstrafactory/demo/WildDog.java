package jdp2e.abstrafactory.demo;
// Types of Dogs-wild dogs and pet dogs
class WildDog implements Dog
{

    @Override
    public void speak()
    {
        System.out.println("Wild Dog says loudly: Bow-Wow.");

    }

    @Override
    public void preferredAction()
    {
        System.out.println("Wild Dogs prefer to roam freely in jungles.\n");

    }
}
