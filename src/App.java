import Devices.SonoffDevice;

public class App {
    public static void main(String[] args) {

        SonoffDevice lampada = SonoffDevice.getInstancia();
        SonoffDevice porta = SonoffDevice.getInstancia();

        System.out.println(lampada);
        System.out.println(porta);

        lampada.setState(true);

        System.out.println(lampada.getState());
        System.out.println(porta.getState());
    }
}
