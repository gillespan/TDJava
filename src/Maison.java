public class Maison implements Chauffable , Refroidissable{
    int temp;

    @Override
    public void chauffer() {
        temp++;
    }

    @Override
    public void refroidir() {
        temp--;
    }
}
