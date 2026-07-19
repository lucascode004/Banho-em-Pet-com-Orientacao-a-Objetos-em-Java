public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo  = 10;
    private Pet pet;

    public void takeShower(){
        if (this.pet == null){
            System.out.println("Coloque um pet na máquina");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet  " + pet.getName() + "está limpo");
    }

    public void addWater(){
        if (water >= 30){
            System.out.println("A capacidade de água está em seu limite");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo >= 10){
            System.out.println("A capacidade de shampoo está em seu limite");
            return;
        }

        shampoo += 2;
    }

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if (!this.clean){
            System.out.println("A maquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na maquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
    }


    public void removePet(){
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " foi limpo e tirado da maquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina foi limpa com sucesso!");
    }
}
