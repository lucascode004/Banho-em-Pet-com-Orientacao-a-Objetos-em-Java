import java.util.Scanner;

public class Main{

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args){
        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no  pet");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a  maquina com shampoo");
            System.out.println("4 - Verificar agua da maquina");
            System.out.println("5 - Verificar shampoo da maquina");
            System.out.println("6 - Verificar se tem Pet no banho");
            System.out.println("7 - Colocar Pet na maquina");
            System.out.println("8 - Retirar Pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo ();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalida");
            }

        } while (true);
    }

    private static void setWater(){
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina esta no momento com " + amount + "litro(s) de shampoo");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com " + amount + "litro(s) de shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina" : "Não tem pet na maquina");
    }


    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do Pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);

    }


}