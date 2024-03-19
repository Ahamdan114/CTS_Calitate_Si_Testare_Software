package ro.ase.acs.Seminar_5.furniture;

public interface Chair {
    String sitOn();
}

interface Sofa {
    String lieOn();
}

class ModernChair implements Chair {

    @Override
    public String sitOn() {
        return "Sit on " + "ModernChair";
    }
}

class ModernSofa implements Sofa {

    @Override
    public String lieOn() {
        return "Lie on " + "ModernSofa";
    }
}

class VictorianChair implements Chair {

    @Override
    public String sitOn() {
        return "Sit on " + "VictorianChair";
    }
}

class VictorianSofa implements Sofa {

    @Override
    public String lieOn() {
        return "Lie on " + "VictorianSofa";
    }
}

interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

//======================================================================
//======================================================================

class Client {
    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void useFurniture() {
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.lieOn());
    }
}

