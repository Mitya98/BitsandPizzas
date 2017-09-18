package bitsandpizzas.hfad.com.bitsandpizzas;

/**
 * Created by Владелец on 16.09.2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
