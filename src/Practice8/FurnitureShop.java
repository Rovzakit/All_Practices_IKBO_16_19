package Practice8;

public class FurnitureShop {
    private Chair[] chairs = new Chair[3];

    private Table[] tables = new Table[3];

    private Lamp[] lamps = new Lamp[3];



    public FurnitureShop(){
        for(int i = 0; i < 3; i++){
            chairs[i] = new Chair();
            tables[i] = new Table();
            lamps[i] = new Lamp();
        }


        chairs[0].height = .5f;
        chairs[2].height = 1;

        tables[0].legAmount = 1;
        tables[2].legAmount = 4;

        lamps[0].color = "white";
        lamps[2].color = "green";
    }

    public void Commands(String cmd){
        switch (cmd){
            case ("catalog"):
                for(int i = 0; i < 3; i++){
                    System.out.println("The 'chair " + (i + 1) + "' with height: " + chairs[i].height + " meters");
                }
                for(int i = 0; i < 3; i++){
                    System.out.println("The 'table " + (i + 1) + "' with " + tables[i].legAmount + " leg(s)");
                }
                for(int i = 0; i < 3; i++){
                    System.out.println("The 'lamp " + (i + 1) + "' with " + lamps[i].color + " color");
                }
                break;
            case ("buy chair 1"):
                System.out.println("You've bought a 'chair 1' (height: 0.5 meters)");
                break;
            case ("buy chair 2"):
                System.out.println("You've bought a 'chair 2' (height: 0.75 meters)");
                break;
            case ("buy chair 3"):
                System.out.println("You've bought a 'chair 3' (height: 1 meters)");
                break;
            case ("buy table 1"):
                System.out.println("You've bought a 'table 1' (leg amount: 1)");
                break;
            case ("buy table 2"):
                System.out.println("You've bought a 'table 2' (leg amount: 3)");
                break;
            case ("buy table 3"):
                System.out.println("You've bought a 'table 3' (leg amount: 4)");
                break;
            case ("buy lamp 1"):
                System.out.println("You've bought a 'lamp 1' (color: white)");
                break;
            case ("buy lamp 2"):
                System.out.println("You've bought a 'lamp 2' (color: yellow)");
                break;
            case ("buy lamp 3"):
                System.out.println("You've bought a 'lamp 3' (color: green)");
                break;
            case ("help"):
                System.out.println("The list of commands:");
                System.out.println("catalog");
                System.out.println("buy 'name of product'");
                System.out.println("help");
                break;
            default:
                System.out.println("unknown command");
                break;
        }
    }
}
