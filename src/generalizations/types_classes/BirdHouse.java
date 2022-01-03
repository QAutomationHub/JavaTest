package generalizations.types_classes;

class BirdHouse <T extends Animal & isFlying> {
    private T owner;

    BirdHouse(T owner) {
        this.owner = owner;
    }
}
