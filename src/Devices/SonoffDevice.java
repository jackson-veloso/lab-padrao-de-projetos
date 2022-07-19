package Devices;

public class SonoffDevice {
    private static class InstanceHolder{
        public static SonoffDevice instancia = new SonoffDevice();
    }
    private boolean state = false;

    private SonoffDevice(){
        super();
    }

    public static SonoffDevice getInstancia() {
        return InstanceHolder.instancia;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

//    @Override
//    public String toString() {
//        return "SonoffDevice{" +
//                "state=" + state +
//                '}';
//    }
}
