package cts.seminar_3.homework_singleton;

public class Phone {

    private static Phone phone;
    private int buttons;
    private boolean hasDisplay;

    private Phone(int buttons, boolean hasDisplay) {
        this.buttons = buttons;
        this.hasDisplay = hasDisplay;
    }

    public static Phone getPhone(int buttons, boolean hasDisplay) {
        if(Phone.phone == null) return new Phone(buttons, hasDisplay);
        return Phone.phone;
    }
}
