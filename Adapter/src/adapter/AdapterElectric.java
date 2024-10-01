package adapter;

public class AdapterElectric implements LedInterFace{
    VietNamPower adaptee;

    public AdapterElectric(VietNamPower adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public int connect() {
        int electric = this.downElectric(this.adaptee.getElectric());

        if (electric > 3)
            return -1;

        if (electric == 3)
            return 1;

        return 0;
    }

    private int downElectric(int electric) {
        return electric - 217;
    }
}